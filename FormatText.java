import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class FormatText {

    private static final String ITALICS_START = "<i>";
    private static final String ITALICS_END = "</i>";
    private static final HashSet<String> italicized = AutoCorrect.italicizedHashSet();

    private static String parseChar(int c, boolean isRTL) {
        String ch = String.valueOf((char) c);
        if (ch.equals("\n") || ch.equals("\r")) {
            ch = isRTL ? "<br>" : "<p>";
        }
        return ch;
    }

    private static boolean isPunctuation(int c) {
        String punctuationMarks = ".,,:;!'\"()[]-–";
        return punctuationMarks.indexOf((char) c) != -1;
    }

    private static String italicizeString(String input) {
        return String.format("%s%s%s", ITALICS_START, input, ITALICS_END);
    }

    public static void main(String[] args) throws IOException {
        printFixedText(new BufferedReader(new InputStreamReader(System.in)));
    }

    private static void printFixedText(BufferedReader in) throws IOException {
        StringBuilder sb = new StringBuilder();
        for (int c = in.read(), prev = -1; c != -1; prev = c, c = in.read()) {
            if (Character.isWhitespace(prev) && ((char) c == '-' || (char) c == '–')) {
                c = handleHebrewQuotations(in); // NOSONAR
            }
            if (Character.isAlphabetic(c) || (char) c == '\'') {
                sb.append((char) c);
                continue;
            }
            String prevWord = AutoCorrect.makeReplacement(sb.toString());
            if (italicized.contains(prevWord)) {
                prevWord = italicizeString(prevWord);
            }
            System.out.printf("%s%s", prevWord, parseChar(c, false));
            sb.setLength(0);
            if ((char) c == '?' || (char) c == '!') {
                prev = in.read();
                c = Character.toUpperCase(in.read());
                if (Character.isAlphabetic(prev)) {
                    sb.append((char) prev);
                } else {
                    System.out.printf("%c", prev);
                }
                if (Character.isAlphabetic(c)) {
                    sb.append((char) c);
                } else {
                    System.out.printf("%c", c);
                }

            }
        }
        String prevWord = AutoCorrect.makeReplacement(sb.toString());
        if (italicized.contains(prevWord)) {
            prevWord = italicizeString(prevWord);
        }
        System.out.print(prevWord);
    }

    private static int handleHebrewQuotations(BufferedReader in) throws IOException {
        int cNew = in.read();
        StringBuilder whitespace = new StringBuilder();
        boolean hasNewLine = false;
        while (Character.isWhitespace(cNew)) {
            hasNewLine = hasNewLine || (char) cNew == '\n' || (char) cNew == '\r';
            whitespace.append((char) cNew);
            cNew = in.read();
        }
        if (hasNewLine && Character.UnicodeBlock.of(cNew) == Character.UnicodeBlock.HEBREW) {
            return handleDashNewlineAndHebrew(in, cNew);
        }
        handleDashNoHebrewQuote(whitespace.toString());
        return cNew;
    }

    private static int handleDashNewlineAndHebrew(BufferedReader in, int c) throws IOException {
        System.out.printf("%n%s%c", "<p dir=\"rtl\"> dir=\"rtl\"", c);
        for (c = in.read(); Character.UnicodeBlock.of(c) == Character.UnicodeBlock.HEBREW || isPunctuation(c)
                || Character.isWhitespace(c); c = in.read()) {
            if ((char) c == '\n' || (char) c == '\r') {
                int cNext = c;
                while (Character.isWhitespace(cNext)) {
                    cNext = in.read();
                }
                if (Character.UnicodeBlock.of(cNext) == Character.UnicodeBlock.HEBREW) {
                    System.out.print("<br>");
                } else {
                    System.out.print("</p><p>");
                    return cNext;
                }
                c = cNext;
            }
            System.out.print(parseChar(c, true));
        }
        System.out.print("</p><p>");
        return c;
    }

    private static void handleDashNoHebrewQuote(String whitespace) {
        StringBuilder newWS = new StringBuilder(whitespace.length() + 3);
        for (int i = 0; i < whitespace.length(); i++) {
            if (whitespace.charAt(i) == '\n' || whitespace.charAt(i) == '\r') {
                newWS.append("<p>");
            } else {
                newWS.append(whitespace.charAt(i));
            }
        }
        System.out.printf("%s%s", '-', newWS.toString());
    }
}