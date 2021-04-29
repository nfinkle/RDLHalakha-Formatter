import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class FormatText {

    private static final class intStringBuilder {
        private final int i;
        private final StringBuilder sb;

        public intStringBuilder(int i, StringBuilder sb) {
            this.i = i;
            this.sb = sb;
        }

        public int getInt() {
            return this.i;
        }

        public StringBuilder getSB() {
            return this.sb;
        }
    }

    private static final String ITALICS_START = "<em>";
    private static final String ITALICS_END = "</em>";
    private static final HashSet<String> italicized = AutoCorrect.italicizedHashSet();

    private static String parseChar(int c, boolean isRTL) {
        String ch = String.valueOf((char) c);
        if (ch.equals("\n") || ch.equals("\r")) {
            ch = isRTL ? "<br>" : "<p>";
        }
        return ch.replace("\u00A0", " "); // replace non-breaking spaces
    }

    private static boolean isPunctuation(int c) {
        String punctuationMarks = ".,,:;!'\"()[]-–";
        return punctuationMarks.indexOf((char) c) != -1;
    }

    private static String italicizeString(String input) {
        return String.format("%s%s%s", ITALICS_START, input, ITALICS_END);
    }

    public static void main(String[] args) throws IOException {
        StringBuilder out = new StringBuilder();
        buildFixedText(new BufferedReader(new InputStreamReader(System.in)), out);
        String output = out.toString().replace(String.format("%s %s", ITALICS_END, ITALICS_START), " ");
        System.out.print(output.replace(" " + ITALICS_END, ITALICS_END + " "));
    }

    private static void buildFixedText(BufferedReader in, StringBuilder out) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int c = in.read(), prev = -1; c != -1; prev = c, c = in.read()) {
            if (Character.isWhitespace(prev) && ((char) c == '-' || (char) c == '–')) {
                c = handleHebrewQuotations(in, out); // NOSONAR
            }
            if (Character.isAlphabetic(c) || (char) c == '\'') {
                sb.append((char) c);
                continue;
            }
            String prevWord = AutoCorrect.makeReplacement(sb.toString());
            if (italicized.contains(prevWord)) {
                prevWord = italicizeString(prevWord);
            }
            out.append(String.format("%s%s", prevWord, parseChar(c, false)));
            sb.setLength(0);
            if ((char) c == '?' || (char) c == '!') {
                prev = in.read();
                c = in.read();
                if (Character.isAlphabetic(prev)) {
                    sb.append((char) prev);
                } else {
                    if ((char) prev == '\r' || (char) prev == '\n') {
                        out.append("</p><p>");
                    } else {
                        out.append(String.format("%c", prev));
                    }
                    c = Character.toUpperCase(c);
                }
                if (Character.isAlphabetic(c)) {
                    sb.append((char) c);
                } else if ((char) c == '\r' || (char) c == '\n') {
                    out.append("</p><p>");
                } else {
                    out.append(String.format("%c", c));
                }
            }
        }
        String prevWord = AutoCorrect.makeReplacement(sb.toString());
        if (italicized.contains(prevWord)) {
            prevWord = italicizeString(prevWord);
        }
        out.append(prevWord);
    }

    private static int handleHebrewQuotations(BufferedReader in, StringBuilder out) throws IOException {
        int cNew = in.read();
        StringBuilder whitespace = new StringBuilder();
        boolean hasNewLine = false;
        while (Character.isWhitespace(cNew)) {
            hasNewLine = hasNewLine || (char) cNew == '\n' || (char) cNew == '\r';
            whitespace.append((char) cNew);
            cNew = in.read();
        }
        if (hasNewLine && Character.UnicodeBlock.of(cNew) == Character.UnicodeBlock.HEBREW) {
            return handleDashNewlineAndHebrew(in, cNew, out);
        }
        handleDashNoHebrewQuote(whitespace.toString(), out);
        return cNew;
    }

    private static int handleDashNewlineAndHebrew(BufferedReader in, int c, StringBuilder out) throws IOException {
        out.append(String.format("%n%s%c", "<p dir=\"rtl\"> ", c));
        // out.append(String.format("%n%s%c", "<p dir=\"rtl\"> dir=\"rtl\"", c);
        for (c = in.read(); Character.UnicodeBlock.of(c) == Character.UnicodeBlock.HEBREW || isPunctuation(c)
                || Character.isWhitespace(c); c = in.read()) {
            if ((char) c == '\n' || (char) c == '\r') {
                int cNext = c;
                while (Character.isWhitespace(cNext)) {
                    cNext = in.read();
                }
                if (Character.UnicodeBlock.of(cNext) == Character.UnicodeBlock.HEBREW) {
                    out.append("<br>");
                } else {
                    out.append("</p><p>");
                    return cNext;
                }
                c = cNext;
            }
            out.append(parseChar(c, true));
        }
        out.append("</p><p>");
        return c;
    }

    private static void handleDashNoHebrewQuote(String whitespace, StringBuilder out) {
        StringBuilder newWS = new StringBuilder(whitespace.length() + 3);
        for (int i = 0; i < whitespace.length(); i++) {
            if (whitespace.charAt(i) == '\n' || whitespace.charAt(i) == '\r') {
                newWS.append("<p>");
            } else {
                newWS.append(whitespace.charAt(i));
            }
        }
        out.append(String.format("%s%s", '-', newWS.toString()));
    }
}