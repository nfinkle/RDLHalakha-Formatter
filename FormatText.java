import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;

public class FormatText {
    private static final String ALOT = "Alot";
    private static final String ARUKH = "Arukh";
    private static final String ASSUR = "assur";
    private static final String AVODAH_UNDERCASE = "avodah";
    private static final String AVODAH_UPPERCASE = "Avodah";
    private static final String BATEL = "batel";
    private static final String BEDIEVED = "bedieved";
    private static final String BEIT_YOSEF = "Beit Yosef";
    private static final String BEIN = "Bein";
    private static final String BELIAH = "beliah";
    private static final String BELIAT = "beliat";
    private static final String BELIOT = "beli'ot";
    private static final String BERAKHAH_LOWER_CASE = "berakhah";
    private static final String BERAKHAH_CAPITALIZED = "Berakhah";
    private static final String BERAKHOT = "Berakhot";
    private static final String BERURAH = "Berurah";
    private static final String CHAYIM = "CHAYIM";
    private static final String CM = "CM";
    private static final String CHOSHEN = "Choshen";
    private static final String DEAH = "De'ah";
    private static final String DE_ORAYTA = "de'orayta";
    private static final String EH = "EH";
    private static final String HACHAMAH = "HaChamah";
    private static final String HAEZER = "HaEzer";
    private static final String HAKOKHAVIM = "HaKokhavim";
    private static final String HALAKHA = "Halakha";
    private static final String HALAKHIC = "halakhic";
    private static final String HALAKHICALLY = "halakhically";
    private static final String HALAKHOT = "halakhot";
    private static final String HANEITZ = "HaNeitz";
    private static final String HASHEM = "HaShem";
    private static final String HASHEMASHOT = "HaShemashot";
    private static final String HASHACHAR = "HaShachar";
    private static final String HASHULCHAN = "HaShulchan";
    private static final String HILKHOT = "hilkhot";
    private static final String KERIAH = "keriah";
    private static final String KERIAT = "keriat";
    private static final String KOKHAVIM = "kokhavim";
    private static final String LEKHATCHILA = "lekhatchila";
    private static final String LEMAASEH = "lema'aseh";
    private static final String IGGROT_MOSHE = "Iggrot Moshe";
    private static final String ISSUR = "issur";
    private static final String MUTAR = "mutar";
    private static final String MISHNAH = "Mishnah";
    private static final String MISHNAH_BERURAH = "Mishnah Berurah";
    private static final String OC = "OC";
    private static final String ORACH = "Orach";
    private static final String PESACHIM = "Pesachim";
    private static final String PESAK = "pesak";
    private static final String PLAG = "Plag";
    private static final String PRI = "Pri";
    private static final String SEIF = "se'if";
    private static final String SHABBAT = "Shabbat";
    private static final String SHAKH = "Shakh";
    private static final String SHEKIAH = "Shekiah";
    private static final String SHEKIAT = "Shekiat";
    private static final String SHULCHAN = "Shulchan";
    private static final String SHULCHAN_ARUKH = "Shulchan Arukh";
    private static final String TAAM = "ta'am";
    private static final String TESHUVA = "teshuva";
    private static final String TESHUVOT = "teshuvot";
    private static final String TOSAFOT = "Tosafot";
    private static final String TUR = "Tur";
    private static final String TZEIT = "Tzeit";
    private static final String TZIBUR = "tzibur";
    private static final String YD = "YD";
    private static final String YEISH = "yeish";
    private static final String YOREH = "Yoreh";
    private static final String ZARAH_UNDERCASE = "zarah";
    private static final String ZARAH_UPPERCASE = "Zarah";

    private static final String ITALICS_START = "<i>";
    private static final String ITALICS_END = "</i>";
    // private static final String ITALICS_START = "\033[3m";
    // private static final String ITALICS_END = "\033[0m";
    private static final HashSet<String> italicized = italicizedHashSet();

    private static final HashSet<String> italicizedHashSet() {
        String[] italicizedArr = { ALOT, ARUKH, ASSUR, AVODAH_UNDERCASE, AVODAH_UPPERCASE, BATEL, BEDIEVED, BEIN,
                BEIT_YOSEF, BELIAH, BELIAT, BELIOT, BERAKHAH_LOWER_CASE, BERAKHAH_CAPITALIZED, BERAKHOT, BERURAH,
                CHAYIM, CHOSHEN, CM, DEAH, DE_ORAYTA, EH, "Even", HACHAMAH, HAEZER, HAKOKHAVIM, HALAKHA, HALAKHIC,
                HALAKHICALLY, HALAKHOT, HAKOKHAVIM, HANEITZ, HASHACHAR, HASHEMASHOT, HASHULCHAN, HILKHOT, IGGROT_MOSHE,
                ISSUR, "kashrut", "Kashrut", KERIAH, KERIAT, KOKHAVIM, LEKHATCHILA, LEMAASEH, MUTAR, MISHNAH,
                MISHNAH_BERURAH, "mishnayot", "Mishnayot", "Mishpat", OC, ORACH, PESACHIM, PESAK, PLAG, PRI, SEIF,
                SHAKH, "shas", "Shas", SHEKIAH, SHEKIAT, SHULCHAN, SHULCHAN_ARUKH, "sugyot", "Sugyot", TAAM, TESHUVA,
                TESHUVOT, TOSAFOT, TUR, TZEIT, TZIBUR, YD, YEISH, YOREH, ZARAH_UNDERCASE, ZARAH_UPPERCASE };
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, italicizedArr);
        return set;
    }

    private static String parseChar(int c, boolean isRTL) {
        String ch = String.valueOf((char) c);
        if (ch.equals("\n") || ch.equals("\r")) {
            ch = isRTL ? "<br>" : "<p>";
        }
        return ch;
    }

    private static boolean isPunctuation(int c) {
        String PUNCTUATIONS_MARKS = ".,,:;!'\"()[]-–";
        return PUNCTUATIONS_MARKS.indexOf((char) c) != -1;
    }

    private static String italicizeString(String input) {
        return String.format("%s%s%s", ITALICS_START, input, ITALICS_END);
    }

    private static String makeReplacement(String word) {
        switch (word) {
            case "alot":
                return ALOT;
            case "Aruch":
                return ARUKH;
            case "asur":
                return ASSUR;
            case "avoda":
                return AVODAH_UNDERCASE;
            case "Avoda":
                return AVODAH_UPPERCASE;
            case "battel":
                return BATEL;
            case "be'dieved":
                return BEDIEVED;
            case "bein":
            case "bayn":
                return BEIN;
            case "bliyah":
            case "bliah":
            case "beliyah":
            case "belia":
            case "beliya":
            case "bliya":
            case "blia":
            case "bli'a":
            case "beli'ah":
            case "beli'a":
                return BELIAH;
            case "bliyat":
            case "bli'at":
            case "beli'at":
            case "beliyat":
                return BELIAT;
            case "bliyot":
            case "bli'ot":
            case "beliyot":
                return BELIOT;
            case "Berura":
            case "Brura":
            case "Brurah":
                return BERURAH;
            case "Bracha":
            case "Brakha":
            case "Berakha":
            case "Brachah":
            case "Brakhah":
            case "Berachah":
                return BERAKHAH_CAPITALIZED;
            case "bracha":
            case "brakha":
            case "berakha":
            case "brachah":
            case "brakhah":
            case "berachah":
                return BERAKHAH_LOWER_CASE;
            case "Brachot":
            case "Brakhot":
            case "Berachot":
                return BERAKHOT;
            case "BY":
                return BEIT_YOSEF;
            case "Chayyim":
            case "Hayim":
            case "Hayyim":
                return CHAYIM;
            case "Hoshen":
                return CHOSHEN;
            case "HM":
                return CM;
            case "Deah":
            case "Dea":
            case "De'a":
                return DEAH;
            case "de'oraita":
            case "di'oraita":
            case "de'oraitta":
            case "di'oraitta":
            case "di'orayta":
                return DE_ORAYTA;
            case "hachama":
            case "hachamah":
            case "Hachama":
            case "HaChama":
            case "Hachamah":
                return HACHAMAH;
            case "haEzer":
            case "Haezer":
            case "Ha'ezer":
            case "Ha'Ezer":
                return HAEZER;
            case "hacochavim":
            case "haCochavim":
            case "HaCochavim":
            case "hacokhavim":
            case "haCokhavim":
            case "HaCokhavim":
            case "hakochavim":
            case "Hakochavim":
            case "HaKochavim":
            case "hakokhavim":
            case "Hakokhavim":
                return HAKOKHAVIM;
            case "Halacha":
            case "halakha":
            case "halacha":
                return HALAKHA;
            case "Halachic":
            case "Halakhic":
            case "halachic":
                return HALAKHIC;
            case "Halachically":
            case "Halakhically":
            case "halachically":
                return HALAKHICALLY;
            case "halachot":
                return HALAKHOT;
            case "hanetz":
            case "haneitz":
            case "Hanetz":
            case "Haneitz":
            case "HaNetz":
            case "Netz":
            case "Neitz":
            case "netz":
            case "neitz":
                return HANEITZ;
            case "hashachar":
            case "haShachar":
            case "hashakhar":
            case "haShakhar":
            case "HaShakhar":
                return HASHACHAR;
            case "Hashem":
            case "haShem":
                return HASHEM;
            case "hashemashot":
            case "haShemashot":
            case "Hashemashot":
            case "hashmashot":
            case "haShmashot":
            case "Hashmashot":
            case "HaShmashot":
                return HASHEMASHOT;
            case "Hashulchan":
            case "haShulchan":
            case "HaShulkhan":
            case "hashulkhan":
            case "Hashulkhan":
                return HASHULCHAN;
            case "hilchot":
                return HILKHOT;
            case "IM":
            case "Igrot Moshe":
                return IGGROT_MOSHE;
            case "isur":
                return ISSUR;
            case "keriyah":
            case "keri'ah":
            case "kriyah":
            case "kriah":
            case "kri'ah":
                return KERIAH;
            case "keriyat":
            case "keri'at":
            case "kriyat":
            case "kriat":
            case "kri'at":
                return KERIAT;
            case "cochavim":
            case "cokhavim":
            case "kochavim":
                return KOKHAVIM;
            case "lechatchila":
                return LEKHATCHILA;
            case "li'maase":
            case "li'mayse":
            case "limaase":
            case "lima'ase":
            case "limayse":
            case "li'maaseh":
            case "li'mayseh":
            case "limaaseh":
            case "lima'aseh":
            case "limayseh":
            case "le'maase":
            case "le'ma'ase":
            case "le'mayse":
            case "le'maaseh":
            case "le'ma'aseh":
            case "le'mayseh":
            case "lema'ase":
                return LEMAASEH;
            case "mincha":
            case "minchah":
            case "minha":
                return "Mincha";
            case "Maariv":
            case "maariv":
                return "Ma'ariv";
            case "muttar":
                return MUTAR;
            case "Mishna":
            case "Mishne":
            case "Mishneh":
                return MISHNAH;
            case "MB":
                return MISHNAH_BERURAH;
            case "OH":
                return OC;
            case "Orakh":
                return ORACH;
            case "psak":
                return PESAK;
            case "psachim":
            case "psahim":
            case "psakhim":
            case "pesahim":
            case "pesakhim":
            case "Psachim":
            case "Psahim":
            case "Psakhim":
            case "Pesahim":
            case "Pesakhim":
                return PESACHIM;
            case "plag":
                return PLAG;
            case "SA":
                return SHULCHAN_ARUKH;
            case "seif":
                return SEIF;
            case "Shulkhan":
                return SHULCHAN;
            case "Shach":
                return SHAKH;
            case "shekia":
            case "shekiah":
            case "shekiya":
            case "shekiyah":
            case "sheki'a":
            case "sheki'ah":
            case "shkia":
            case "shkiah":
            case "shkiya":
            case "shkiyah":
            case "shki'a":
            case "shki'ah":
            case "Shekia":
            case "Sheki'ah":
            case "Shekiya":
            case "Shekiyah":
            case "Sheki'a":
            case "Shkia":
            case "Shkiah":
            case "Shkiya":
            case "Shkiyah":
            case "Shki'a":
            case "Shki'ah":
                return SHEKIAH;
            case "shekiat":
            case "shekiyat":
            case "sheki'at":
            case "shkiat":
            case "shkiyat":
            case "shki'at":
            case "Shekiyat":
            case "Sheki'at":
            case "Shkiat":
            case "Shkiyat":
            case "Shki'at":
                return SHEKIAT;
            case "Shabbos":
                return SHABBAT;
            case "taam":
                return TAAM;
            case "tzeis":
            case "Tzeis":
            case "tzeit":
                return TZEIT;
            case "tzibbur":
                return TZIBUR;
            case "tshuvot":
                return TESHUVOT;
            case "tshuva":
            case "tshuvah":
            case "teshuvah":
                return TESHUVA;
            case "Tosfot":
            case "Tosphot":
            case "Tosefot":
            case "Tosephot":
            case "Tosfos":
            case "Tosafos":
                return TOSAFOT;
            case "yesh":
                return YEISH;
            case "Yore":
                return YOREH;
            case "Zara":
                return ZARAH_UPPERCASE;
            case "zara":
                return ZARAH_UNDERCASE;
            default:
                return word;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        printFixedText(in);
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
            String prevWord = makeReplacement(sb.toString());
            if (italicized.contains(prevWord)) {
                prevWord = italicizeString(prevWord);
            }
            System.out.printf("%s%s", prevWord, parseChar(c, false));
            sb.setLength(0);
        }
        String prevWord = makeReplacement(sb.toString());
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
            System.out.printf("%n%s%c", "<p dir=\"rtl\"> dir=\"rtl\"", cNew);
            for (cNew = in.read(); Character.UnicodeBlock.of(cNew) == Character.UnicodeBlock.HEBREW
                    || isPunctuation(cNew) || Character.isWhitespace(cNew); cNew = in.read()) {
                if ((char) cNew == '\n' || (char) cNew == '\r') {
                    int cNext = cNew;
                    while (Character.isWhitespace(cNext)) {
                        cNext = in.read();
                    }
                    if (Character.UnicodeBlock.of(cNext) == Character.UnicodeBlock.HEBREW) {
                        System.out.print("<br>dir=\"rtl\"");
                    } else {
                        System.out.print("</p><p>");
                        return cNext;
                    }
                    cNew = cNext;
                }
                System.out.print(parseChar(cNew, true));
            }
            System.out.print("</p><p>");
        } else {
            String ws = whitespace.toString();
            StringBuilder newWhitespace = new StringBuilder(ws.length() + 3);
            for (int i = 0; i < ws.length(); i++) {
                if (ws.charAt(i) == '\n' || ws.charAt(i) == '\r') {
                    newWhitespace.append("<p>");
                } else {
                    newWhitespace.append(ws.charAt(i));
                }
            }
            System.out.printf("%s%s", '-', newWhitespace.toString());
        }
        return cNew;
    }
}