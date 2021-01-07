import java.util.Collections;
import java.util.HashSet;

public class AutoCorrect {

    private static final String ACHRONIM = "Achronim";
    private static final String AKUM = "akum";
    private static final String ALOT = "Alot";
    private static final String ARUKH = "Arukh";
    private static final String ASSUR = "assur";
    private static final String AVEIL = "aveil";
    private static final String AVODAH_UNDERCASE = "avodah";
    private static final String AVODAH_UPPERCASE = "Avodah";
    private static final String BATEL = "batel";
    private static final String BEDIEVED = "bedieved";
    private static final String BEIT = "beit";
    private static final String BEIT_YOSEF = "Beit Yosef";
    private static final String BEIN = "Bein";
    private static final String BELIAH = "beliah";
    private static final String BELIAT = "beliat";
    private static final String BELIOT = "beli'ot";
    private static final String BEN = "ben";
    private static final String BERAKHAH_LOWER_CASE = "berakhah";
    private static final String BERAKHAH_CAPITALIZED = "Berakhah";
    private static final String BERAKHOT_LOWERCASE = "berakhot";
    private static final String BERAKHOT_UPPERCASE = "Berakhot";
    private static final String BERABIM = "berabim";
    private static final String BERURAH = "Berurah";
    private static final String BISHUL = "bishul";
    private static final String BITUL = "bitul";
    private static final String BO = "bo";
    private static final String BRIT = "Brit";
    private static final String CHADASH = "Chadash";
    private static final String CHANUKAH = "Chanukah";
    private static final String CHAYIM = "Chayim";
    private static final String CHINUKH = "chinukh";
    private static final String CHOSHEN = "Choshen";
    private static final String CM = "CM";
    private static final String DAAT = "da'at";
    private static final String DEAH = "De'ah";
    private static final String DE_ORAYTA = "de'orayta";
    private static final String DERABANAN = "derabanan";
    private static final String EIDIM = "eidim";
    private static final String EINO = "eino";
    private static final String EH = "EH";
    private static final String FLEISHIG = "fleishig";
    private static final String GOYIM = "goyim";
    private static final String GRAMA = "grama";
    private static final String HACHAMAH = "HaChamah";
    private static final String HADAAT = "hada'at";
    private static final String HAEZER = "HaEzer";
    private static final String HAKOKHAVIM = "HaKokhavim";
    private static final String HALAKHA = "Halakha";
    private static final String HALAKHIC = "halakhic";
    private static final String HALAKHICALLY = "halakhically";
    private static final String HALAKHOT = "halakhot";
    private static final String HALLEL = "Hallel";
    private static final String HANEITZ = "HaNeitz";
    private static final String HASHEM = "HaShem";
    private static final String HASHEMASHOT = "HaShemashot";
    private static final String HASHACHAR = "HaShachar";
    private static final String HASHULCHAN = "HaShulchan";
    private static final String HATORAH = "HaTorah";
    private static final String HATZIBUR = "HaTzibur";
    private static final String HEFSEIK = "hefseik";
    private static final String HEKHSHER = "hekhsher";
    private static final String HETER = "heter";
    private static final String HILKHOT = "hilkhot";
    private static final String KELI = "keli";
    private static final String KEILIM = "keilim";
    private static final String KENESET_LOWERCASE = "keneset";
    private static final String KENESET_UPPERCASE = "Keneset";
    private static final String KERIAH = "keriah";
    private static final String KERIAT = "keriat";
    private static final String KOKHAVIM = "kokhavim";
    private static final String LEHAKEIL = "lehakeil";
    private static final String LEHACHMIR = "lehachmir";
    private static final String LEIN = "lein";
    private static final String LEINED = "leined";
    private static final String LEINING = "leining";
    private static final String LEKHATCHILA = "lekhatchilah";
    private static final String LEMAASEH = "lema'aseh";
    private static final String IGGROT_MOSHE = "Iggrot Moshe";
    private static final String ISSUR = "issur";
    private static final String MEGILLAH = "Megillah";
    private static final String MILA = "Mila";
    private static final String MILKHIG = "milkhig";
    private static final String MUSAF = "Musaf";
    private static final String MUTAR = "mutar";
    private static final String MISHNAH = "Mishnah";
    private static final String MISHNAH_BERURAH = "Mishnah Berurah";
    private static final String OC = "OC";
    private static final String OMER_LOWERCASE = "omer";
    private static final String OMER_UPPERCASE = "Omer";
    private static final String ORACH = "Orach";
    private static final String PAREVE = "pareve";
    private static final String PARASHAH = "parashah";
    private static final String PESACHIM = "Pesachim";
    private static final String PESAK = "pesak";
    private static final String PLAG = "Plag";
    private static final String POSKIM = "poskim";
    private static final String PRI = "Pri";
    private static final String RISHONIM = "Rishonim";
    private static final String SEIF = "se'if";
    private static final String SHABBAT = "Shabbat";
    private static final String SHACHARIT = "Shacharit";
    private static final String SHAKH = "Shakh";
    private static final String SHALIACH_LOWERCASE = "shaliach";
    private static final String SHALIACH_UPPERCASE = "Shaliach";
    private static final String SHEINI = "sheini";
    private static final String SHEKIAH = "Shekiah";
    private static final String SHEKIAT = "Shekiat";
    private static final String SHELISHI = "shelishi";
    private static final String SHETAR = "shetar";
    private static final String SHITAH = "shitah";
    private static final String SHITOT = "shitot";
    private static final String SHIVA = "shiva";
    private static final String SHLITA = "shlita";
    private static final String SHULCHAN = "Shulchan";
    private static final String SHULCHAN_ARUKH = "Shulchan Arukh";
    private static final String SILUK = "siluk";
    private static final String SIMCHAH = "simchah";
    private static final String SKHAR = "skhar";
    private static final String SNIF = "snif";
    private static final String SOLEDET = "soledet";
    private static final String TAAM = "ta'am";
    private static final String TALLIT = "tallit";
    private static final String TEFILAH = "tefilah";
    private static final String TEFILLIN = "tefillin";
    private static final String TESHUVA = "teshuva";
    private static final String TEVILAH = "tevilah";
    private static final String TEVILAT = "tevilat";
    private static final String TESHUVOT = "teshuvot";
    private static final String TOSAFOT = "Tosafot";
    private static final String TOVEL = "tovel";
    private static final String TREIF = "treif";
    private static final String TUR = "Tur";
    private static final String TZEIT = "Tzeit";
    private static final String TZIBUR = "tzibur";
    private static final String YABIA = "Yabia";
    private static final String YD = "YD";
    private static final String YEISH = "yeish";
    private static final String YOREH = "Yoreh";
    private static final String ZARAH_UNDERCASE = "zarah";
    private static final String ZARAH_UPPERCASE = "Zarah";

    protected static final HashSet<String> italicizedHashSet() {
        String[] italicizedArr = { ACHRONIM, AKUM, ALOT, ARUKH, ASSUR, AVEIL, AVODAH_UNDERCASE, AVODAH_UPPERCASE, BATEL,
                BEDIEVED, BEIN, BEIT, BEIT_YOSEF, BELIAH, BELIAT, BELIOT, BEN, "bentch", BERAKHAH_LOWER_CASE,
                BERAKHAH_CAPITALIZED, BERAKHOT_LOWERCASE, BERAKHOT_UPPERCASE, BERABIM, BERURAH, BITUL, BISHUL, BO,
                CHADASH, CHAYIM, CHINUKH, CHOSHEN, CM, DAAT, DEAH, DE_ORAYTA, DERABANAN, EIDIM, EINO, EH, "Even",
                FLEISHIG, "frum", GOYIM, GRAMA, HACHAMAH, HADAAT, HAEZER, HAKOKHAVIM, HALAKHA, HALAKHOT, HANEITZ,
                HASHACHAR, HASHEMASHOT, HASHULCHAN, HATORAH, HATZIBUR, HEFSEIK, HEKHSHER, HETER, HILKHOT, IGGROT_MOSHE,
                ISSUR, "kashrut", "Kashrut", KELI, KEILIM, KENESET_LOWERCASE, KENESET_UPPERCASE, KERIAH, KERIAT, "klaf",
                KOKHAVIM, LEHACHMIR, LEHAKEIL, LEIN, LEKHATCHILA, LEMAASEH, MEGILLAH, "mikdash", "Mikdash", MILA,
                MILKHIG, "minyan", "Minyan", MISHNAH, MISHNAH_BERURAH, "mishnayot", "Mishnayot", "Mishpat", MUTAR, OC,
                OMER_LOWERCASE, OMER_UPPERCASE, ORACH, PARASHAH, PAREVE, PESACHIM, PESAK, PLAG, POSKIM, PRI, "rishon",
                RISHONIM, SEIF, SHAKH, SHALIACH_LOWERCASE, SHALIACH_UPPERCASE, "shas", "Shas", SHEINI, SHEKIAH, SHEKIAT,
                SHELISHI, SHETAR, SHITAH, SHITOT, SHIVA, "shul", SHULCHAN, SHULCHAN_ARUKH, SHLITA, SILUK, SIMCHAH,
                SKHAR, SNIF, SOLEDET, "sugyot", "Sugyot", TAAM, TALLIT, TEFILAH, TEFILLIN, TESHUVA, TESHUVOT, TEVILAH,
                TEVILAT, TOSAFOT, TOVEL, TREIF, TUR, TZEIT, TZIBUR, YABIA, "yad", YD, YEISH, "yomo", YOREH, "yotzei",
                ZARAH_UNDERCASE, ZARAH_UPPERCASE };
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, italicizedArr);
        return set;
    }

    static String makeReplacement(String word) {
        switch (word) {
            case "achronim":
            case "akhronim":
            case "Akhronim":
                return ACHRONIM;
            case "alot":
                return ALOT;
            case "Aruch":
                return ARUKH;
            case "asur":
                return ASSUR;
            case "avel":
                return AVEIL;
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
            case "b'racha":
            case "b'rachah":
            case "b'rakha":
            case "b'rakhah":
                return BERAKHAH_LOWER_CASE;
            case "berachot":
            case "brachot":
            case "brakhot":
            case "b'rachot":
            case "b'rakhot":
                return BERAKHOT_LOWERCASE;
            case "Berachot":
            case "Brachot":
            case "Brakhot":
            case "B'rachot":
            case "B'rakhot":
                return BERAKHOT_UPPERCASE;
            case "b'rabbim":
            case "b'rabim":
            case "berabbim":
            case "be'rabbim":
            case "be'rabim":
            case "birabbim":
            case "birabim":
            case "bi'rabbim":
            case "bi'rabim":
                return BERABIM;
            case "bayt":
                return BEIT;
            case "BY":
                return BEIT_YOSEF;
            case "bittul":
                return BITUL;
            case "berit":
            case "beris":
            case "Beris":
            case "brit":
            case "bris":
            case "Bris":
            case "b'rit":
            case "B'rit":
            case "b'ris":
            case "B'ris":
                return BRIT;
            case "Khadash":
                return CHADASH;
            case "channuka":
            case "Channuka":
            case "channukah":
            case "Channukah":
            case "channukka":
            case "Channukka":
            case "channukkah":
            case "Channukkah":
            case "chanuka":
            case "Chanuka":
            case "chanukah":
            case "chanukka":
            case "Chanukka":
            case "chanukkah":
            case "Chanukkah":
            case "hannuka":
            case "Hannuka":
            case "hannukah":
            case "Hannukah":
            case "hannukka":
            case "Hannukka":
            case "hannukkah":
            case "Hannukkah":
            case "hanuka":
            case "Hanuka":
            case "hanukah":
            case "Hanukah":
            case "hanukka":
            case "Hanukka":
            case "hanukkah":
            case "Hanukkah":
                return CHANUKAH;
            case "Chayyim":
            case "Hayim":
            case "Hayyim":
                return CHAYIM;
            case "chinnuch":
            case "chinnukh":
            case "chinuch":
                return CHINUKH;
            case "Hoshen":
                return CHOSHEN;
            case "HM":
                return CM;
            case "daat":
                return DAAT;
            case "Deah":
            case "Dea":
            case "De'a":
                return DEAH;
            case "de'oraita":
            case "de'oraitta":
            case "de'oraytta":
            case "di'oraita":
            case "di'oraitta":
            case "di'orayta":
            case "di'oraytta":
            case "d'oraita":
            case "d'oraitta":
            case "d'orayta":
            case "d'oraytta":
                return DE_ORAYTA;
            case "de'rabanan":
            case "di'rabanan":
            case "d'rabanan":
                return DERABANAN;
            case "edim":
                return EIDIM;
            case "ayno":
                return EINO;
            case "flayshic":
            case "flayshig":
            case "flayshik":
            case "fleishic":
            case "fleishik":
                return FLEISHIG;
            case "gerama":
            case "geramah":
            case "gramah":
                return GRAMA;
            case "hachama":
            case "hachamah":
            case "Hachama":
            case "HaChama":
            case "Hachamah":
                return HACHAMAH;
            case "hadaat":
                return HADAAT;
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
            case "Halachik":
            case "Halakhic":
            case "Halakhik":
            case "halachic":
            case "halachik":
            case "halakhik":
                return HALAKHIC;
            case "Halachically":
            case "Halakhically":
            case "halachically":
                return HALAKHICALLY;
            case "halachot":
                return HALAKHOT;
            case "hallel":
                return HALLEL;
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
            case "ha'Torah":
            case "Ha'Torah":
            case "ha'torah":
            case "hatorah":
                return HATORAH;
            case "hatzibbur":
            case "haTzibbur":
            case "Hatzibbur":
            case "HaTzibbur":
            case "hatzibur":
            case "Hatzibur":
            case "haTzibur":
                return HATZIBUR;
            case "hefsek":
            case "hephseik":
            case "hephsek":
                return HEFSEIK;
            case "hechsheir":
            case "hechsher":
            case "hekhsheir":
                return HEKHSHER;
            case "hetter":
                return HETER;
            case "hilchot":
                return HILKHOT;
            case "IM":
            case "Igrot Moshe":
                return IGGROT_MOSHE;
            case "isur":
                return ISSUR;
            case "kelim":
                return KEILIM;
            case "kli":
                return KELI;
            case "Kenesset":
                return KENESET_UPPERCASE;
            case "kenesset":
                return KENESET_LOWERCASE;
            case "keriyah":
            case "keri'ah":
            case "kriyah":
            case "kriah":
            case "kri'ah":
            case "k'riya":
            case "k'riyah":
                return KERIAH;
            case "keriyat":
            case "keri'at":
            case "kriyat":
            case "kriat":
            case "kri'at":
            case "k'riyat":
                return KERIAT;
            case "cochavim":
            case "cokhavim":
            case "kochavim":
                return KOKHAVIM;
            case "lehakhmir":
            case "le'hachmir":
            case "le'hakhmir":
            case "l'hachmir":
            case "l'hakhmir":
                return LEHACHMIR;
            case "lehakel":
            case "le'hakeil":
            case "le'hakel":
            case "l'hakel":
            case "l'hakeil":
                return LEHAKEIL;
            case "layn":
                return LEIN;
            case "layned":
                return LEINED;
            case "layning":
                return LEINING;
            case "lechatchila":
            case "lechatkhila":
            case "lekhatkhila":
            case "lichatchila":
            case "lichatkhila":
            case "likhatchila":
            case "likhatkhila":
            case "l'chatchila":
            case "l'chatkhila":
            case "l'khatchila":
            case "l'khatkhila":
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
            case "l'maase":
            case "l'maaseh":
            case "l'ma'ase":
            case "l'ma'aseh":
                return LEMAASEH;
            case "Maariv":
            case "maariv":
                return "Ma'ariv";
            case "megila":
            case "Megila":
            case "megilah":
            case "Megilah":
            case "megillah":
            case "megilla":
            case "Megilla":
                return MEGILLAH;
            case "milchic":
            case "milchik":
            case "milchig":
            case "milkhic":
            case "milkhik":
                return MILKHIG;
            case "mincha":
            case "minchah":
            case "minha":
                return "Mincha";
            case "minhag":
                return "Minhag";
            case "Mishna":
            case "Mishne":
            case "Mishneh":
                return MISHNAH;
            case "MB":
                return MISHNAH_BERURAH;
            case "mitzva":
                return "mitzvah";
            case "musaf":
            case "mussaf":
            case "Mussaf":
                return MUSAF;
            case "muttar":
                return MUTAR;
            case "OH":
                return OC;
            case "Orakh":
                return ORACH;
            case "parasha":
            case "parsha":
            case "parshah":
                return PARASHAH;
            case "parve":
                return PAREVE;
            case "psak":
            case "p'sak":
                return PESAK;
            case "pesachim":
            case "pesahim":
            case "Pesahim":
            case "pesakhim":
            case "Pesakhim":
            case "psachim":
            case "Psachim":
            case "psahim":
            case "Psahim":
            case "psakhim":
            case "Psakhim":
            case "p'sachim":
            case "P'sachim":
            case "p'sakhim":
            case "P'sakhim":
            case "p'sahim":
            case "P'sahim":
                return PESACHIM;
            case "plag":
                return PLAG;
            case "rishonim":
                return RISHONIM;
            case "seif":
                return SEIF;
            case "shabbat":
            case "shabbos":
            case "Shabbos":
                return SHABBAT;
            case "shacharit":
            case "shacharis":
            case "shakharis":
            case "shakharit":
            case "Shakharit":
            case "Shakharis":
                return SHACHARIT;
            case "shaliakh":
            case "sheliach":
            case "sheliakh":
            case "shliach":
            case "shliakh":
            case "sh'liach":
            case "sh'liakh":
                return SHALIACH_LOWERCASE;
            case "Shaliakh":
            case "Sheliach":
            case "Sheliakh":
            case "Shliach":
            case "Shliakh":
            case "Sh'liach":
            case "Sh'liakh":
                return SHALIACH_UPPERCASE;
            case "Shach":
                return SHAKH;
            case "sheni":
                return SHEINI;
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
            case "sh'kia":
            case "sh'kiah":
            case "sh'kiya":
            case "sh'kiyah":
            case "sh'ki'a":
            case "sh'ki'ah":
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
            case "Sh'kia":
            case "Sh'kiah":
            case "Sh'kiya":
            case "Sh'kiyah":
            case "Sh'ki'a":
            case "Sh'ki'ah":
                return SHEKIAH;
            case "shekiat":
            case "shekiyat":
            case "sheki'at":
            case "shkiat":
            case "shkiyat":
            case "shki'at":
            case "sh'kiat":
            case "sh'kiyat":
            case "sh'ki'at":
            case "Shekiyat":
            case "Sheki'at":
            case "Shkiat":
            case "Shkiyat":
            case "Shki'at":
            case "Sh'kiat":
            case "Sh'kiyat":
            case "Sh'ki'at":
                return SHEKIAT;
            case "shlishi":
                return SHELISHI;
            case "shtar":
            case "sh'tar":
                return SHETAR;
            case "Shulkhan":
                return SHULCHAN;
            case "SA":
                return SHULCHAN_ARUKH;
            case "sechar":
            case "sekhar":
            case "schar":
            case "s'char":
            case "s'khar":
                return SKHAR;
            case "soleddet":
                return SOLEDET;
            case "taam":
                return TAAM;
            case "talis":
            case "talit":
            case "tallis":
                return TALLIT;
            case "tefila":
            case "tefilla":
            case "tefillah":
            case "tfila":
            case "tfilah":
            case "tfilla":
            case "tfillah":
            case "t'fila":
            case "t'filah":
            case "t'filla":
            case "t'fillah":
                return TEFILAH;
            case "tefilin":
            case "t'filin":
            case "t'fillin":
                return TEFILLIN;
            case "tshuva":
            case "tshuvah":
            case "t'shuva":
            case "t'shuvah":
            case "teshuvah":
                return TESHUVA;
            case "tshuvot":
            case "t'shuvot":
                return TESHUVOT;
            case "tevila":
            case "tevilla":
            case "tevillah":
            case "tvila":
            case "tvilah":
            case "tvilla":
            case "tvillah":
            case "t'vila":
            case "t'vilah":
            case "t'villa":
            case "t'villah":
                return TEVILAH;
            case "tevillat":
            case "tvilat":
            case "tvillat":
            case "t'vilat":
            case "t'villat":
                return TEVILAT;
            case "Tosfot":
            case "Tosphot":
            case "Tosefot":
            case "Tosephot":
            case "Tosfos":
            case "Tosafos":
                return TOSAFOT;
            case "toivel":
            case "toveil":
                return TOVEL;
            case "trayf":
                return TREIF;
            case "tzeis":
            case "Tzeis":
            case "tzeit":
                return TZEIT;
            case "tzibbur":
                return TZIBUR;
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
}
