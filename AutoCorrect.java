import java.util.Collections;
import java.util.HashSet;

public class AutoCorrect {
    private static final String ACHRONIM__TITLECASE = "Achronim";
    private static final String AGUDAH = "agudah";
    private static final String AGUDAH__TITLECASE = "Agudah";
    private static final String AHAVAH = "ahavah";
    private static final String AKHILAH = "akhilah";
    private static final String AKUM = "akum";
    private static final String ALEF = "alef";
    private static final String ALEINU = "Aleinu";
    private static final String ALIYAH = "aliyah";
    private static final String ALOT__TITLECASE = "Alot";
    private static final String AMIRAH = "amirah";
    private static final String ANINUT = "aninut";
    private static final String ARAYOT = "arayot";
    private static final String ARUKH__TITLECASE = "Arukh";
    private static final String ASAR__TITLECASE = "Asar";
    private static final String ASHKENAZ__TITLECASE = "Ashkenaz";
    private static final String ASHKENAZI__TITLECASE = "Ashkenazi";
    private static final String ASHREI__TITLECASE = "Ashrei";
    private static final String ASIYAH = "asiyah";
    private static final String ASSUR = "assur";
    private static final String ASSUROT = "assurot";
    private static final String ASSUROT__TITLECASE = "Assurot";
    private static final String ATZERET__TITLECASE = "Atzeret";
    private static final String AVADIM = "avadim";
    private static final String AVINU__TITLECASE = "Avinu";
    private static final String AVEIL = "aveil";
    private static final String AVEILUT = "aveilut";
    private static final String AVODAH = "avodah";
    private static final String AVODAH__TITLECASE = "Avodah";
    private static final String AVOT__TITLECASE = "Avot";
    private static final String BA_AL = "ba'al";
    private static final String BAKASHAH = "bakashah";
    private static final String BAREKHU__TITLECASE = "Barekhu";
    private static final String BARUKH__TITLECASE = "Barukh";
    private static final String BATEIL = "bateil";
    private static final String BAVLI__TITLECASE = "Bavli";
    private static final String BEAV__BE_TITLECASE = "BeAv";
    private static final String BEDIEVED = "bedieved";
    private static final String BEDIKAH = "bedikah";
    private static final String BEDIKAT = "bedikat";
    private static final String BEKISNIM = "bekisnim";
    private static final String BEIT = "beit";
    private static final String BEIT___YOSEF__TITLECASE = "Beit Yosef";
    private static final String BEIN = "Bein";
    private static final String BELIAH = "beliah";
    private static final String BELIAT = "beliat";
    private static final String BELIOT = "beliot";
    private static final String BEN = "ben";
    private static final String BERAKHAH = "berakhah";
    private static final String BERAKHAH__TITLECASE = "Berakhah";
    private static final String BERAKHOT = "berakhot";
    private static final String BERAKHOT__TITLECASE = "Berakhot";
    private static final String BERABIM = "berabim";
    private static final String BERIOT = "beriot";
    private static final String BERURAH__TITLECASE = "Berurah";
    private static final String BESAMIM = "besamim";
    private static final String BETAMMUZ__BE_TITLECASE = "BeTammuz";
    private static final String BETZIBUR = "betzibur";
    private static final String BIRKAT__TITLECASE = "Birkat";
    private static final String BISHUL = "bishul";
    private static final String BITUL = "bitul";
    private static final String BIUR__TITLECASE = "Biur";
    private static final String BO = "bo";
    private static final String BOREI = "borei";
    private static final String BOREI__TITLECASE = "Borei";
    private static final String B_SHEVAT__B_TITLECASE = "B'Shevat";
    private static final String BRIT__TITLECASE = "Brit";
    private static final String CHADASH__TITLECASE = "Chadash";
    private static final String CHAGIM__TITLECASE = "Chagim";
    private static final String CHAMEITZ = "chameitz";
    private static final String CHANUKAH__TITLECASE = "Chanukah";
    private static final String CHATAN = "chatan";
    private static final String CHAYIM = "chayim";
    private static final String CHAYIM__TITLECASE = "Chayim";
    private static final String CHAZAL__TITLECASE = "Chazal";
    private static final String CHESED = "chesed";
    private static final String CHILUL = "chilul";
    private static final String CHILUL__TITLECASE = "Chilul";
    private static final String CHINUKH = "chinukh";
    private static final String CHIYUV = "chiyuv";
    private static final String CHODESH = "chodesh";
    private static final String CHODESH__TITLECASE = "Chodesh";
    private static final String CHOL__TITLECASE = "Chol";
    private static final String CHOLEH = "choleh";
    private static final String CHOSHEN = "Choshen";
    private static final String CHULLIN__TITLECASE = "Chullin";
    private static final String CHUMASH = "chumash";
    private static final String CHUPPAH = "chuppah";
    private static final String CHUTZ = "chutz";
    private static final String CM__UPPERCASE = "CM";
    private static final String DA_AT = "da'at";
    private static final String DARKHEI__TITLECASE = "Darkhei";
    private static final String DARKHEI = "darkhei";
    private static final String DE_AH__TITLECASE = "De'ah";
    private static final String DE_ORAYTA = "de'orayta";
    private static final String DERABANAN = "derabanan";
    private static final String DERABBI__DE_TITLECASE = "DeRabbi";
    private static final String DEREKH = "derekh";
    private static final String DEVARIM = "devarim";
    private static final String DEVARIM__TITLECASE = "Devarim";
    private static final String DEZIMRAH__DE_TITLECASE = "DeZimrah";
    private static final String DODI__TITLECASE = "Dodi";
    private static final String DRASHA__TITLECASE = "Drasha";
    private static final String EDEN__TITLECASE = "Eden";
    private static final String EIDAH = "eidah";
    private static final String EIDIM = "eidim";
    private static final String EIKHAH__TITLECASE = "Eikhah";
    private static final String EIN = "ein";
    private static final String EINO = "eino";
    private static final String EIRUV = "eiruv";
    private static final String EIRUVIN__TITLECASE = "Eiruvin";
    private static final String EISH = "eish";
    private static final String EH__UPPERCASE = "EH";
    private static final String EMET = "emet";
    private static final String ERETZ__TITLECASE = "Eretz";
    private static final String EREV__TITLECASE = "Erev";
    private static final String ESREI__TITLECASE = "Esrei";
    private static final String ETROG = "etrog";
    private static final String EVED = "eved";
    private static final String FLEISHIG = "fleishig";
    private static final String GE_ONIM__TITLECASE = "Ge'onim";
    private static final String GEZEIRAH = "gezeirah";
    private static final String GITTIN__TITLECASE = "Gittin";
    private static final String GRAMA = "grama";
    private static final String HAATZMA_UT__HA_TITLECASE = "HaAtzma'ut";
    private static final String HABAT__HA_TITLECASE = "HaBat";
    private static final String HABA_AH = "haba'ah";
    private static final String HABEN__HA_TITLECASE = "HaBen";
    private static final String HABERIOT__HA_TITLECASE = "HaBeriot";
    private static final String HACHAMAH__HA_TITLECASE = "HaChamah";
    private static final String HACHANAH = "hachanah";
    private static final String HACHODESH__HA_TITLECASE = "HaChamah";
    private static final String HADA_AT = "hada'at";
    private static final String HADECHAK = "hadechak";
    private static final String HADECHAK__TITLECASE = "Hadechak";
    private static final String HAEISH__HA_TITLECASE = "HaEish";
    private static final String HAEZER__HA_TITLECASE = "HaEzer";
    private static final String HAFTARAH = "haftarah";
    private static final String HAGBAHAH = "hagbahah";
    private static final String HAGGADAH__TITLECASE = "Haggadah";
    private static final String HAGGADOT = "haggadot";
    private static final String HAKADOSH__HA_TITLECASE = "HaKadosh";
    private static final String HAKAFOT__TITLECASE = "Hakafot";
    private static final String HAKOKHAVIM__HA_TITLECASE = "HaKokhavim";
    private static final String HALAKHA = "halakha";
    private static final String HALAKHA__TITLECASE = "Halakha";
    private static final String HALAKHIC = "halakhic";
    private static final String HALAKHICALLY = "halakhically";
    private static final String HALAKHOT = "halakhot";
    private static final String HALLEL__TITLECASE = "Hallel";
    private static final String HAMAFSEKET__HA_TITLECASE = "HaMafseket";
    private static final String HAMAVDIL__HA_TITLECASE = "HaMavdil";
    private static final String HAMIKRA = "hamikra";
    private static final String HAMITZVAH__HA_TITLECASE = "HaMitzvah";
    private static final String HAMITZVOT__HA_TITLECASE = "HaMitzvot";
    private static final String HAMAZON__HA_TITLECASE = "HaMazon";
    private static final String HAMIKDASH__HA_TITLECASE = "HaMikdash";
    private static final String HAMINCHAH__HA_TITLECASE = "HaMinchah";
    private static final String HAMOTZI__HA_TITLECASE = "HaMotzi";
    private static final String HANA_AH = "hana'ah";
    private static final String HANACHAH = "hanachah";
    private static final String HANEITZ__HA_TITLECASE = "HaNeitz";
    private static final String HAOMER__HA_TITLECASE = "HaOmer";
    private static final String HAPOSKIM = "haposkim";
    private static final String HAPOSKIM__HA_TITLECASE = "HaPoskim";
    private static final String HASHACHAR__HA_TITLECASE = "HaShachar";
    private static final String HASHANAH__HA_TITLECASE = "HaShanah";
    private static final String HASHEM__HA_TITLECASE = "HaShem";
    private static final String HASHEMASHOT__HA_TITLECASE = "HaShemashot";
    private static final String HASHEVACH__HA_TITLECASE = "HaShevach";
    private static final String HASHULCHAN__HA_TITLECASE = "HaShulchan";
    private static final String HATORAH__HA_TITLECASE = "HaTorah";
    private static final String HATZIBUR__HA_TITLECASE = "HaTzibur";
    private static final String HAVDALAH__TITLECASE = "Havdalah";
    private static final String HAZIKARON__HA_TITLECASE = "HaZikaron";
    private static final String HEFSEIK = "hefseik";
    private static final String HEKHSHER = "hekhsher";
    private static final String HETER = "heter";
    private static final String HILKHOT = "hilkhot";
    private static final String HODA_AH = "hoda'ah";
    private static final String HOSHANAH__TITLECASE = "Hoshanah";
    private static final String HOSHANOT__TITLECASE = "Hoshanot";
    private static final String IGGROT__TITLECASE = "Iggrot";
    private static final String IGGROT___MOSHE__TITLECASE = "Iggrot Moshe";
    private static final String IRUY = "iruy";
    private static final String ISHAH = "ishah";
    private static final String ISHAH__TITLECASE = "Ishah";
    private static final String ISSUR = "issur";
    private static final String ISSUREI = "issurei";
    private static final String ISSURIM = "issurim";
    private static final String IYAR__TITLECASE = "Iyar";
    private static final String KABBALAH__TITLECASE = "Kabbalah";
    private static final String KABBALAT__TITLECASE = "Kabbalat";
    private static final String KADDISH__TITLECASE = "Kaddish";
    private static final String KADOSH = "kadosh";
    private static final String KAMATZ = "kamatz";
    private static final String KAPAROT = "kaparot";
    private static final String KAREIT = "kareit";
    private static final String KATAN = "katan";
    private static final String KATAN__TITLECASE = "Katan";
    private static final String KAVANAH = "kavanah";
    private static final String KAHAL = "kahal";
    private static final String KALLAH = "kallah";
    private static final String KEBEITZAH = "kebeitzah";
    private static final String KEBEITZIM = "kebeitzim";
    private static final String KEDUSHAH = "kedushah";
    private static final String KEDUSHAT = "kedushat";
    private static final String KEDUSHOT = "kedushot";
    private static final String KELI = "keli";
    private static final String KEILIM = "keilim";
    private static final String KENAS = "kenas";
    private static final String KENESET = "keneset";
    private static final String KENESET__TITLECASE = "Keneset";
    private static final String KERIAH = "keriah";
    private static final String KERIAT = "keriat";
    private static final String KEVIAT = "keviat";
    private static final String KEZAYIT = "kezayit";
    private static final String KEZEITIM = "kezeitim";
    private static final String KIDDUSH__TITLECASE = "Kiddush";
    private static final String KIDDUSHIN = "kiddushin";
    private static final String KIDDUSHIN__TITLECASE = "Kiddushin";
    private static final String KINOT = "kinot";
    private static final String KIPPUR__TITLECASE = "Kippur";
    private static final String KITTEL = "kittel";
    private static final String KIYUM = "kiyum";
    private static final String KOHEN = "kohen";
    private static final String KOKHAVIM = "kokhavim";
    private static final String KOL = "kol";
    private static final String KOL__TITLECASE = "Kol";
    private static final String KOLEINU__TITLECASE = "Koleinu";
    private static final String KORBAN = "korban";
    private static final String KORBAN__TITLECASE = "Korban";
    private static final String KOREI = "korei";
    private static final String KOVEI_A = "kovei'a";
    private static final String LE_AKUM = "le'akum";
    private static final String LEHAKEIL = "lehakeil";
    private static final String LEHACHMIR = "lehachmir";
    private static final String LEGOY = "legoy";
    private static final String LEIH = "leih";
    private static final String LEIN = "lein";
    private static final String LEINED = "leined";
    private static final String LEINING = "leining";
    private static final String LEKHA__TITLECASE = "Lekha";
    private static final String LEKHATCHILAH = "lekhatchilah";
    private static final String LEMA_ASEH = "lema'aseh";
    private static final String LENOKHRI = "lenokhri";
    private static final String LEVATALAH = "levatalah";
    private static final String LULAV = "lulav";
    private static final String MA_ASEH = "ma'aseh";
    private static final String MA_ASER = "ma'aser";
    private static final String MA_ASROT = "ma'asrot";
    private static final String MACHLOKET = "machloket";
    private static final String MAFSEKET__TITLECASE = "Mafseket";
    private static final String MAFTIR = "maftir";
    private static final String MALKEINU__TITLECASE = "Malkeinu";
    private static final String MAROR = "maror";
    private static final String MATZAH = "matzah";
    private static final String MAZON = "mazon";
    private static final String MEGILLAH = "megillah";
    private static final String MEGILLAH__TITLECASE = "Megillah";
    private static final String MEGILLOT = "megillot";
    private static final String MELAKHAH = "melakhah";
    private static final String ME_OREI__TITLECASE = "Me'orei";
    private static final String MESORAH = "mesorah";
    private static final String MESORAH__TITLECASE = "mesorah";
    private static final String MEZONOT = "mezonot";
    private static final String MEZONOT__TITLECASE = "Mezonot";
    private static final String MIDRASH__TITLECASE = "Midrash";
    private static final String MIKVEH = "mikveh";
    private static final String MILA__TITLECASE = "Mila";
    private static final String MILKHIG = "milkhig";
    private static final String MINEI__TITLECASE = "Minei";
    private static final String MITZVAT = "mitzvat";
    private static final String MITZVOT = "mitzvot";
    private static final String MO_ADIM__TITLECASE = "Mo'adim";
    private static final String MO_ED__TITLECASE = "Moed";
    private static final String MUKTZEH = "muktzeh";
    private static final String MUSAF__TITLECASE = "Musaf";
    private static final String MUTAR = "mutar";
    private static final String MISHKAH__TITLECASE = "Mishkah";
    private static final String MISHNAH__TITLECASE = "Mishnah";
    private static final String MISHNAH___BERURAH__TITLECASE = "Mishnah Berurah";
    private static final String MITZA_EIR = "mitzta'eir";
    private static final String NATAN__TITLECASE = "Natan";
    private static final String NE_ILAH__TITLECASE = "Ne'ilah";
    private static final String NEFESH = "nefesh";
    private static final String NEGIAH = "negiah";
    private static final String NESHAMAH = "neshamah";
    private static final String NICHA = "nicha";
    private static final String NIDDAH = "niddah";
    private static final String NIDDAH__TITLECASE = "Niddah";
    private static final String NISUIN = "nisuin";
    private static final String NISHMAT__TITLECASE = "Nishmat";
    private static final String NOKHRI = "nokhri";
    private static final String NOY = "noy";
    private static final String NUSACH = "nusach";
    private static final String OC__UPPERCASE = "OC";
    private static final String OMER = "omer";
    private static final String OMER__TITLECASE = "Omer";
    private static final String ONAH = "onah";
    private static final String ONEIN = "onein";
    private static final String ORACH__TITLECASE = "Orach";
    private static final String OVEID = "oveid";
    private static final String OVEDEI = "ovedei";
    private static final String OVEDIM = "ovedim";
    private static final String PAGUM = "pagum";
    private static final String PAREVE = "pareve";
    private static final String PARASHAH = "parashah";
    private static final String PASUK = "pasuk";
    private static final String PASUK__TITLECASE = "Pasuk";
    private static final String PAT = "pat";
    private static final String PEREK = "perek";
    private static final String PEREK__TITLECASE = "Perek";
    private static final String PESACH__TITLECASE = "Pesach";
    private static final String PESACHIM__TITLECASE = "Pesachim";
    private static final String PESAK = "pesak";
    private static final String PESAK__TITLECASE = "Pesak";
    private static final String PESUKEI__TITLECASE = "Pesukei";
    private static final String PIDYON__TITLECASE = "Pidyon";
    private static final String PIKUACH = "pikuach";
    private static final String PIRKEI__TITLECASE = "Pirkei";
    private static final String PITCHEI__TITLECASE = "Pitchei";
    private static final String PLAG__TITLECASE = "Plag";
    private static final String POSEK = "posek";
    private static final String POSKIM = "poskim";
    private static final String PURIM__TITLECASE = "Purim";
    private static final String PRI__TITLECASE = "Pri";
    private static final String RABBAH__TITLECASE = "Rabbah";
    private static final String RABBI__TITLECASE = "Rabbi";
    private static final String RABIM = "rabim";
    private static final String REFUAH = "refuah";
    private static final String REISH__TITLECASE = "Reish";
    private static final String REISHA = "reisha";
    private static final String RISHONIM__TITLECASE = "Rishonim";
    private static final String ROSH_TITLECASE = "Rosh";
    private static final String SEIF = "se'if";
    private static final String SEFER = "sefer";
    private static final String SEFER__TITLECASE = "Sefer";
    private static final String SEFARIM = "sefarim";
    private static final String SEFIRAT__TITLECASE = "Sefirat";
    private static final String SEGOL__TITLECASE = "Segol";
    private static final String SEKILAH = "sekilah";
    private static final String SELICHOT__TITLECASE = "Selichot";
    private static final String SHEMIRAH = "shemirah";
    private static final String SHEMIRAT = "shemirat";
    private static final String SEPHARDI__TITLECASE = "Sephardi";
    private static final String SEPHARDIM__TITLECASE = "Sephardim";
    private static final String SEUDAH = "seudah";
    private static final String SEUDAH__TITLECASE = "Seudah";
    private static final String SEUDAT = "seudat";
    private static final String SEUDAT__TITLECASE = "Seudat";
    private static final String SEUDOT = "seudot";
    private static final String SEUDOT__TITLECASE = "Seudot";
    private static final String SHA_AH = "sha'ah";
    private static final String SHA_AH__TITLECASE = "Sha'ah";
    private static final String SHA_AT = "sha'at";
    private static final String SHA_AT__TITLECASE = "Sha'at";
    private static final String SHABBAT__TITLECASE = "Shabbat";
    private static final String SHACHARIT__TITLECASE = "Shacharit";
    private static final String SHAKH__TITLECASE = "Shakh";
    private static final String SHALIACH = "shaliach";
    private static final String SHALIACH__TITLECASE = "Shaliach";
    private static final String SHAVUOT__TITLECASE = "Shavuot";
    private static final String SHEBALEIV = "shebaleiv";
    private static final String SHEBIKDUSHAH = "shebikdushah";
    private static final String SHEHAKOL__SHE_TITLECASE = "SheHakol";
    private static final String SHEINI = "sheini";
    private static final String SHEKHINAH__TITLECASE = "Shekhinah";
    private static final String SHEKIAH__TITLECASE = "Shekiah";
    private static final String SHEKIAT__TITLECASE = "Shekiat";
    private static final String SHELISHI = "shelishi";
    private static final String SHELISHIT__TITLECASE = "Shelishit";
    private static final String SHELITA = "שליט\"א";
    private static final String SHEMA__TITLECASE = "Shema";
    private static final String SHEMINI__TITLECASE = "Shemini";
    private static final String SHEMONEH__TITLECASE = "Shemoneh";
    private static final String SHEMOT__TITLECASE = "Shemot";
    private static final String SHETAR = "shetar";
    private static final String SHEVA__TITLECASE = "Sheva";
    private static final String SHINUY = "shinuy";
    private static final String SHITAH = "shitah";
    private static final String SHITOT = "shitot";
    private static final String SHIVA = "shiva";
    private static final String SHIVA__TITLECASE = "Shiva";
    private static final String SHOKHEIN__TITLECASE = "Shokhein";
    private static final String SHULCHAN__TITLECASE = "Shulchan";
    private static final String SHULCHAN___ARUKH__TITLECASE = "Shulchan Arukh";
    private static final String SIDDUR = "siddur";
    private static final String SIDDUR__TITLECASE = "Siddur";
    private static final String SIFREI = "sifrei";
    private static final String SIFREI__TITLECASE = "Sifrei";
    private static final String SIFRI__TITLECASE = "Sifri";
    private static final String SIMAN = "siman";
    private static final String SIMCHAH = "simchah";
    private static final String SIMCHAT__TITLECASE = "Simchat";
    private static final String SKHAR = "skhar";
    private static final String SNIF = "snif";
    private static final String SOLEDET = "soledet";
    private static final String SOTAH__TITLECASE = "Sotah";
    private static final String SUKKAH__TITLECASE = "Sukkah";
    private static final String SUKKOT__TITLECASE = "Sukkot";
    private static final String TA_AM = "ta'am";
    private static final String TA_AMEI = "ta'amei";
    private static final String TA_ANIT = "ta'anit";
    private static final String TA_ANIT__TITLECASE = "Ta'anit";
    private static final String TACHANUN__TITLECASE = "Tachanun";
    private static final String TAKANAH = "takanah";
    private static final String TAKANAT = "takanat";
    private static final String TAKANAT__TITLECASE = "Takanat";
    private static final String TALLIT = "tallit";
    private static final String TAMMUZ__TITLECASE = "Tammuz";
    private static final String TASHLIKH__TITLECASE = "Tashlikh";
    private static final String TAVLIN = "tavlin";
    private static final String TAVSHILIN__TITLECASE = "Tavshilin";
    private static final String TAVSHIL = "tavshil";
    private static final String TAZ__TITLECASE = "Taz";
    private static final String TEFILAH = "tefilah";
    private static final String TEFILLIN = "tefillin";
    private static final String TEKIAH = "tekiah";
    private static final String TEKIOT = "tekiot";
    private static final String TEKUFAH = "tekufah";
    private static final String TEKUFAT = "tekufat";
    private static final String TEREIFAH = "tereifah";
    private static final String TEREIFOT = "tereifot";
    private static final String TERUMAH = "terumah";
    private static final String TERUMOT = "terumot";
    private static final String TESHUVA = "teshuva";
    private static final String TESHUVA__TITLECASE = "Teshuva";
    private static final String TESHUVOT = "teshuvot";
    private static final String TESHUVOT__TITLECASE = "Teshuvot";
    private static final String TEVILAH = "tevilah";
    private static final String TEVILAT = "tevilat";
    private static final String TISHA__TITLECASE = "Tisha";
    private static final String TISHREI__TITLECASE = "Tishrei";
    private static final String TOSAFOT__TITLECASE = "Tosafot";
    private static final String TORAH__TITLECASE = "Torah";
    private static final String TOVEL = "tovel";
    private static final String TREIF = "treif";
    private static final String TUR__TITLECASE = "Tur";
    private static final String TZEIT__TITLECASE = "Tzeit";
    private static final String TZIBUR = "tzibur";
    private static final String TZITZIT = "tzitzit";
    private static final String USHPIZIN__TITLECASE = "Ushpizin";
    private static final String VIDUY__TITLECASE = "Viduy";
    private static final String YABIA__TITLECASE = "Yabia";
    private static final String YD__UPPERCASE = "YD";
    private static final String YEISH = "yeish";
    private static final String YERUSHALAYIM__TITLECASE = "Yerushalayim";
    private static final String YERUSHALMI__TITLECASE = "Yerushalmi";
    private static final String YEVAMOT__TITLECASE = "Yevamot";
    private static final String YISHTABACH__TITLECASE = "Yishtabach";
    private static final String YISRAEL__TITLECASE = "Yisrael";
    private static final String YIZKOR__TITLECASE = "Yizkor";
    private static final String YOM___TOV__TITLECASE = "Yom Tov";
    private static final String YOREH__TITLECASE = "Yoreh";
    private static final String ZARAH = "zarah";
    private static final String ZARAH__TITLECASE = "Zarah";
    private static final String ZEMIROT = "zemirot";
    private static final String ZEMIROT__TITLECASE = "Zemirot";
    private static final String ZERA = "zera";
    private static final String ZONAH = "zonah";
    private static final String ZIMMUN__TITLECASE = "Zimmun";

    protected static final HashSet<String> italicizedHashSet() {
        String[] italicizedArr = { ACHRONIM__TITLECASE, "ad", "Ad", AGUDAH, AGUDAH__TITLECASE, AHAVAH, AKHILAH, AKUM,
                "al", "Al", ALEF, ALIYAH, "aliyot", ALOT__TITLECASE, AMIRAH, "Anim", ANINUT, ARAYOT, ARUKH__TITLECASE,
                ASAR__TITLECASE, ASIYAH, ASHREI__TITLECASE, ASSUR, ASSUROT, ASSUROT__TITLECASE, "av", "avad", AVADIM,
                AVEIL, AVEILUT, AVINU__TITLECASE, AVODAH, AVODAH__TITLECASE, AVOT__TITLECASE, BA_AL, BAKASHAH,
                BAREKHU__TITLECASE, BARUKH__TITLECASE, BATEIL, BAVLI__TITLECASE, BEDIEVED, BEDIKAH, BEDIKAT, BEIN, BEIT,
                BEIT___YOSEF__TITLECASE, BEKISNIM, BELIAH, BELIAT, BELIOT, BEN, "bentch", BERAKHAH, BERAKHAH__TITLECASE,
                BERAKHOT, BERAKHOT__TITLECASE, BERABIM, BERIOT, BERURAH__TITLECASE, BESAMIM, BETAMMUZ__BE_TITLECASE,
                BETZIBUR, BIRKAT__TITLECASE, BISHUL, BITUL, BIUR__TITLECASE, BO, BOREI, BOREI__TITLECASE,
                B_SHEVAT__B_TITLECASE, CHADASH__TITLECASE, CHAGIM__TITLECASE, CHAMEITZ, CHATAN, CHAYIM,
                CHAYIM__TITLECASE, CHAZAL__TITLECASE, CHESED, CHILUL, CHILUL__TITLECASE, CHINUKH, CHIYUV, CHODESH,
                CHOL__TITLECASE, CHOLEH, CHOSHEN, CHULLIN__TITLECASE, CHUMASH, CHUPPAH, CHUTZ, CM__UPPERCASE, DA_AT,
                DARKHEI, DARKHEI__TITLECASE, "davar", "Davar", "davka", DE_AH__TITLECASE, DE_ORAYTA, DERABANAN,
                DERABBI__DE_TITLECASE, DEREKH, DEVARIM, DEVARIM__TITLECASE, DEZIMRAH__DE_TITLECASE, DODI__TITLECASE,
                DRASHA__TITLECASE, EDEN__TITLECASE, EIDAH, EIDIM, EIKHAH__TITLECASE, EIN, EINO, EIRUV,
                EIRUVIN__TITLECASE, EISH, EH__UPPERCASE, EMET, ERETZ__TITLECASE, EREV__TITLECASE, ESREI__TITLECASE,
                ETROG, EVED, FLEISHIG, "frum", GE_ONIM__TITLECASE, GEZEIRAH, GITTIN__TITLECASE, "goy", "goyim", GRAMA,
                HAATZMA_UT__HA_TITLECASE, HABA_AH, HABAT__HA_TITLECASE, HABEN__HA_TITLECASE, HABERIOT__HA_TITLECASE,
                HACHAMAH__HA_TITLECASE, HACHANAH, HACHODESH__HA_TITLECASE, HADA_AT, HADECHAK, HADECHAK__TITLECASE,
                HAEISH__HA_TITLECASE, HAEZER__HA_TITLECASE, HAFTARAH, HAGBAHAH, HAGGADAH__TITLECASE, HAGGADOT,
                HAKADOSH__HA_TITLECASE, HAKAFOT__TITLECASE, HAKOKHAVIM__HA_TITLECASE, HALAKHA, HALAKHA__TITLECASE,
                HALAKHOT, HAMAFSEKET__HA_TITLECASE, HAMAVDIL__HA_TITLECASE, HAMAZON__HA_TITLECASE,
                HAMIKDASH__HA_TITLECASE, HAMIKRA, HAMINCHAH__HA_TITLECASE, HAMITZVAH__HA_TITLECASE,
                HAMITZVOT__HA_TITLECASE, HAMOTZI__HA_TITLECASE, HANA_AH, HANACHAH, HANEITZ__HA_TITLECASE,
                HAOMER__HA_TITLECASE, HAPOSKIM, HAPOSKIM__HA_TITLECASE, HASHACHAR__HA_TITLECASE,
                HASHEMASHOT__HA_TITLECASE, HASHEVACH__HA_TITLECASE, HASHULCHAN__HA_TITLECASE, HATORAH__HA_TITLECASE,
                HATZIBUR__HA_TITLECASE, HAZIKARON__HA_TITLECASE, HEFSEIK, HEKHSHER, HETER, HILKHOT, HODA_AH,
                HOSHANOT__TITLECASE, IRUY, "ish", "Ish", ISHAH, ISHAH__TITLECASE, IGGROT__TITLECASE,
                IGGROT___MOSHE__TITLECASE, ISSUR, ISSUREI, ISSURIM, KABBALAH__TITLECASE, KABBALAT__TITLECASE, KADOSH,
                KAHAL, KALLAH, KAMATZ, KAPAROT, KAREIT, "kashrut", "Kashrut", KATAN, KAVANAH, KEBEITZAH, KEBEITZIM,
                KEDUSHAH, KEDUSHAT, KEDUSHOT, KELI, KEILIM, KENAS, KENESET, KENESET__TITLECASE, KERIAH, KERIAT, KEVIAT,
                KEZAYIT, KEZEITIM, KIDDUSHIN, KIDDUSHIN__TITLECASE, KINOT, KIPPUR__TITLECASE, KITTEL, KIYUM, "klaf",
                KOHEN, KOKHAVIM, KOL, KOL__TITLECASE, KOLEINU__TITLECASE, KORBAN, KORBAN__TITLECASE, KOREI, KOVEI_A,
                LE_AKUM, LEHACHMIR, LEGOY, LEHAKEIL, LEIH, LEIN, LEKHA__TITLECASE, LEKHATCHILAH, LEMA_ASEH, LENOKHRI,
                LEVATALAH, LULAV, MA_ASEH, MA_ASER, MACHLOKET, MAFSEKET__TITLECASE, MAFTIR, "makom",
                MALKEINU__TITLECASE, MAROR, MATZAH, MAZON, MEGILLAH, MEGILLAH__TITLECASE, MEGILLOT, MELAKHAH,
                ME_OREI__TITLECASE, MESORAH, MESORAH__TITLECASE, MEZONOT, MEZONOT__TITLECASE, "mikdash", "Mikdash",
                MIKVEH, MILA__TITLECASE, MILKHIG, MINEI__TITLECASE, "minyan", "Minyan", MISHKAH__TITLECASE,
                MISHNAH__TITLECASE, MISHNAH___BERURAH__TITLECASE, "mishnayot", "Mishnayot", "Mishpat", MITZA_EIR,
                MITZVAT, MITZVOT, MO_ADIM__TITLECASE, MO_ED__TITLECASE, MUKTZEH, MUTAR, "nashim", "Nashim",
                NATAN__TITLECASE, NEFESH, NEGIAH, NE_ILAH__TITLECASE, NESHAMAH, NICHA, NIDDAH, NIDDAH__TITLECASE,
                NISHMAT__TITLECASE, NISUIN, NOKHRI, NOY, NUSACH, OC__UPPERCASE, OMER, OMER__TITLECASE, ONAH, ONEIN,
                ORACH__TITLECASE, OVEDEI, OVEDIM, OVEID, PAGUM, PARASHAH, PAREVE, PASUK, PASUK__TITLECASE, PAT, PEREK,
                PEREK__TITLECASE, PESACH__TITLECASE, PESACHIM__TITLECASE, PESAK, PESAK__TITLECASE, PESUKEI__TITLECASE,
                PIDYON__TITLECASE, PIKUACH, PIRKEI__TITLECASE, PITCHEI__TITLECASE, PLAG__TITLECASE, POSKIM,
                PRI__TITLECASE, RABIM, REFUAH, REISH__TITLECASE, REISHA, "rishon", RISHONIM__TITLECASE, "rov", "Rov",
                SEFER, SEFER__TITLECASE, SEFARIM, SEFIRAT__TITLECASE, SEIF, SEGOL__TITLECASE, SEKILAH,
                SELICHOT__TITLECASE, SEUDAH, SEUDAH__TITLECASE, SEUDAT, SEUDAT__TITLECASE, SEUDOT, SEUDOT__TITLECASE,
                SHAKH__TITLECASE, SHALIACH, SHALIACH__TITLECASE, "shas", "Shas", SHA_AH, SHA_AH__TITLECASE, SHA_AT,
                SHA_AT__TITLECASE, SHEBIKDUSHAH, SHEHAKOL__SHE_TITLECASE, SHEINI, SHEKHINAH__TITLECASE,
                SHEKIAH__TITLECASE, SHEKIAT__TITLECASE, SHELISHI, SHELISHIT__TITLECASE, SHEMIRAH, SHEMIRAT,
                SHEMONEH__TITLECASE, SHETAR, "sheva", SHEVA__TITLECASE, "shevach", "shevakh", SHINUY, SHITAH, SHITOT,
                SHIVA, SHIVA__TITLECASE, SHOKHEIN__TITLECASE, "shul", SHULCHAN__TITLECASE, SHULCHAN___ARUKH__TITLECASE,
                SIFREI, SIFREI__TITLECASE, SIFRI__TITLECASE, "siluk", SIMAN, SIMCHAH, SKHAR, SNIF, SOLEDET,
                SOTAH__TITLECASE, "sugya", "sugyot", "Sugyot", TA_AM, TA_AMEI, TA_ANIT, TA_ANIT__TITLECASE,
                TACHANUN__TITLECASE, TAKANAH, TAKANAT, TAKANAT__TITLECASE, TALLIT, TAMMUZ__TITLECASE,
                TASHLIKH__TITLECASE, TAVLIN, TAVSHIL, TAVSHILIN__TITLECASE, TAZ__TITLECASE, TEFILAH, TEFILLIN, TEKIAH,
                TEKIOT, TEKUFAH, TEKUFAT, TEREIFAH, TEREIFOT, TERUMAH, TERUMOT, TESHUVA, TESHUVA__TITLECASE, TESHUVOT,
                TESHUVOT__TITLECASE, TEVILAH, TEVILAT, TOSAFOT__TITLECASE, "tov", "Tov", TOVEL, TREIF, "Tu",
                TUR__TITLECASE, TZEIT__TITLECASE, TZIBUR, TZITZIT, USHPIZIN__TITLECASE, "Vayigash", VIDUY__TITLECASE,
                YABIA__TITLECASE, "yad", YD__UPPERCASE, YEISH, YERUSHALAYIM__TITLECASE, YERUSHALMI__TITLECASE,
                YEVAMOT__TITLECASE, "yichud", "Yigdal", YISRAEL__TITLECASE, "yom", "yomo", YOREH__TITLECASE, "yotzei",
                ZARAH, ZARAH__TITLECASE, ZEMIROT, ZEMIROT__TITLECASE, "Zeved", ZERA, ZIMMUN__TITLECASE, "Zohar",
                ZONAH };
        HashSet<String> set = new HashSet<>();
        Collections.addAll(set, italicizedArr);
        return set;
    }

    static String makeReplacement(String word) {
        switch (word) {
            case "acharonim":
            case "Acharonim":
            case "achronim":
            case "aharonim":
            case "Aharonim":
            case "ahronim":
            case "Ahronim":
            case "akharonim":
            case "akhronim":
            case "Akharonim":
            case "Akhronim":
                return ACHRONIM__TITLECASE;
            case "aguda":
                return AGUDAH;
            case "Aguda":
                return AGUDAH__TITLECASE;
            case "ahava":
                return AHAVAH;
            case "achila":
            case "achilah":
            case "achilla":
            case "achillah":
            case "akhila":
            case "akhilla":
            case "akhillah":
                return AKHILAH;
            case "Alenu":
                return ALEINU;
            case "aliya":
                return ALIYAH;
            case "alot":
                return ALOT__TITLECASE;
            case "amida":
            case "Amida":
            case "amidah":
                return "Amidah";
            case "amira":
                return AMIRAH;
            case "aninus":
                return ANINUT;
            case "arayos":
                return ARAYOT;
            case "Aruch":
                return ARUKH__TITLECASE;
            case "asar":
            case "assar":
            case "Assar":
                return ASAR__TITLECASE;
            case "ashkenaz":
                return ASHKENAZ__TITLECASE;
            case "ashkenazi":
            case "ashkenazic":
            case "Ashkenazic":
                return ASHKENAZI__TITLECASE;
            case "ashrei":
                return ASHREI__TITLECASE;
            case "asiya":
                return ASIYAH;
            case "asur":
                return ASSUR;
            case "assuros":
            case "asuros":
            case "asurot":
                return ASSUROT;
            case "Assuros":
            case "Asuros":
            case "Asurot":
                return ASSUROT__TITLECASE;
            case "Atzeres":
                return ATZERET__TITLECASE;
            case "avaddim":
                return AVADIM;
            case "avel":
                return AVEIL;
            case "aveilus":
            case "avelus":
            case "avelut":
                return AVEILUT;
            case "avinu":
                return AVINU__TITLECASE;
            case "avoda":
                return AVODAH;
            case "Avoda":
                return AVODAH__TITLECASE;
            case "Avos":
                return AVOT__TITLECASE;
            case "baal":
                return BA_AL;
            case "bakasha":
                return BAKASHAH;
            case "barchu":
            case "Barchu":
            case "barechu":
            case "Barechu":
            case "barekhu":
            case "barkhu":
            case "Barkhu":
                return BAREKHU__TITLECASE;
            case "barukh":
            case "baruch":
            case "Baruch":
                return BARUKH__TITLECASE;
            case "batel":
            case "battel":
            case "batteil":
                return BATEIL;
            case "bavli":
                return BAVLI__TITLECASE;
            case "b'av":
            case "b'Av":
            case "B'av":
            case "B'Av":
            case "beAv":
            case "be'av":
            case "be'Av":
            case "Be'av":
            case "Be'Av":
                return BEAV__BE_TITLECASE;
            case "b'dieved":
            case "be'dieved":
            case "bidieved":
            case "bi'dieved":
                return BEDIEVED;
            case "b'dika":
            case "b'dikah":
            case "b'dikka":
            case "b'dikkah":
            case "bedika":
            case "bedikka":
            case "bedikkah":
                return BEDIKAH;
            case "b'dikas":
            case "b'dikat":
            case "b'dikkas":
            case "b'dikkat":
            case "bedikas":
            case "bedikkat":
            case "bedikkas":
                return BEDIKAT;
            case "bein":
            case "bayn":
                return BEIN;
            case "bayt":
                return BEIT;
            case "BY":
                return BEIT___YOSEF__TITLECASE;
            case "b'kisnim":
                return BEKISNIM;
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
            case "bliot":
            case "bli'ot":
            case "beliyot":
            case "beli'ot":
                return BELIOT;
            case "beriyos":
            case "beriyot":
            case "briyos":
            case "briyot":
            case "b'riyos":
            case "b'riyot":
                return BERIOT;
            case "Berura":
            case "Brura":
            case "Brurah":
                return BERURAH__TITLECASE;
            case "Bracha":
            case "Brakha":
            case "Berakha":
            case "Brachah":
            case "Brakhah":
            case "Berachah":
                return BERAKHAH__TITLECASE;
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
                return BERAKHAH;
            case "berachot":
            case "brachot":
            case "brakhot":
            case "b'rachot":
            case "b'rakhot":
                return BERAKHOT;
            case "Berachot":
            case "Brachot":
            case "Brakhot":
            case "B'rachot":
            case "B'rakhot":
                return BERAKHOT__TITLECASE;
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
            case "bisamim":
                return BESAMIM;
            case "beTamuz":
            case "betamuz":
            case "Betamuz":
            case "BeTamuz":
            case "beTammuz":
            case "betammuz":
            case "Betammuz":
            case "biTamuz":
            case "bitamuz":
            case "Bitamuz":
            case "BiTamuz":
            case "biTammuz":
            case "bitammuz":
            case "Bitammuz":
            case "BiTammuz":
            case "b'tamuz":
            case "b'Tamuz":
            case "B'tamuz":
            case "B'Tamuz":
            case "b'tammuz":
            case "b'Tammuz":
            case "B'tammuz":
            case "B'Tammuz":
                return BETAMMUZ__BE_TITLECASE;
            case "betzibbur":
            case "be'tzibur":
            case "be'tzibbur":
            case "b'tzibbur":
            case "b'tzibur":
                return BETZIBUR;
            case "bircat":
            case "Bircat":
            case "birkat":
                return BIRKAT__TITLECASE;
            case "bittul":
                return BITUL;
            case "Beur":
            case "Beiur":
                return BIUR__TITLECASE;
            case "boray":
                return BOREI;
            case "Boray":
                return BOREI__TITLECASE;
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
                return BRIT__TITLECASE;
            case "beshevat":
            case "Beshevat":
            case "beShevat":
            case "BeShevat":
            case "be'shevat":
            case "Be'shevat":
            case "be'Shevat":
            case "Be'Shevat":
            case "bishevat":
            case "Bishevat":
            case "biShevat":
            case "BiShevat":
            case "bi'shevat":
            case "Bi'shevat":
            case "bi'Shevat":
            case "Bi'Shevat":
            case "bShevat":
            case "b'shevat":
            case "B'shevat":
            case "b'Shevat":
            case "beshvat":
            case "Beshvat":
            case "beShvat":
            case "BeShvat":
            case "be'shvat":
            case "Be'shvat":
            case "be'Shvat":
            case "Be'Shvat":
            case "bishvat":
            case "Bishvat":
            case "biShvat":
            case "BiShvat":
            case "bi'shvat":
            case "Bi'shvat":
            case "bi'Shvat":
            case "Bi'Shvat":
            case "bShvat":
            case "b'shvat":
            case "B'shvat":
            case "b'Shvat":
                return B_SHEVAT__B_TITLECASE;
            case "Khadash":
                return CHADASH__TITLECASE;
            case "chaggim":
            case "Chaggim":
            case "chagim":
                return CHAGIM__TITLECASE;
            case "chametz":
                return CHAMEITZ;
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
                return CHANUKAH__TITLECASE;
            case "chattan":
                return CHATAN;
            case "Chayyim":
            case "Hayim":
            case "Hayyim":
                return CHAYIM__TITLECASE;
            case "chayyim":
            case "hayim":
            case "hayyim":
                return CHAYIM;
            case "chazal":
            case "chazzal":
            case "Chazzal":
                return CHAZAL__TITLECASE;
            case "chessed":
            case "hesed":
            case "hessed":
                return CHESED;
            case "chillul":
                return CHILUL;
            case "Chillul":
                return CHILUL__TITLECASE;
            case "chinnuch":
            case "chinnukh":
            case "chinuch":
                return CHINUKH;
            case "chiyyuv":
                return CHIYUV;
            case "hodesh":
                return CHODESH;
            case "Hodesh":
                return CHODESH__TITLECASE;
            case "chol":
            case "Hol":
                return CHOL__TITLECASE;
            case "chole":
            case "cholle":
            case "cholleh":
                return CHOLEH;
            case "Hoshen":
                return CHOSHEN;
            case "hutz":
                return CHUTZ;
            case "HM":
                return CM__UPPERCASE;
            case "Chulin":
            case "Hulin":
            case "Hullin":
                return CHULLIN__TITLECASE;
            case "chummash":
            case "humash":
            case "hummash":
                return CHUMASH;
            case "chupa":
            case "chupah":
            case "chuppa":
            case "hupa":
            case "hupah":
            case "huppa":
            case "huppah":
                return CHUPPAH;
            case "daat":
                return DA_AT;
            case "darchei":
                return DARKHEI;
            case "Darchei":
                return DARKHEI__TITLECASE;
            case "Deah":
            case "Dea":
            case "De'a":
                return DE_AH__TITLECASE;
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
            case "derabbanan":
            case "de'rabanan":
            case "de'rabbanan":
            case "di'rabanan":
            case "di'rabbanan":
            case "d'rabanan":
            case "d'rabbanan":
                return DERABANAN;
            case "DeRebbe":
            case "De'Rabbi":
            case "De'Rebbe":
            case "D'Rabbi":
            case "D'Rebbe":
                return DERABBI__DE_TITLECASE;
            case "derech":
                return DEREKH;
            case "dvarim":
                return DEVARIM;
            case "Dvarim":
                return DEVARIM__TITLECASE;
            case "DeZimra":
            case "De'Zimra":
            case "De'Zimrah":
            case "D'Zimra":
            case "D'Zimrah":
                return DEZIMRAH__DE_TITLECASE;
            case "doddi":
            case "Doddi":
            case "dodi":
                return DODI__TITLECASE;
            case "drasha":
            case "d'rasha":
            case "D'rasha":
            case "derasha":
            case "Derasha":
                return DRASHA__TITLECASE;
            case "eden":
            case "eiden":
            case "Eiden":
                return EDEN__TITLECASE;
            case "ayda":
            case "aydah":
            case "edah":
            case "eida":
                return EIDAH;
            case "edim":
                return EIDIM;
            case "Aycha":
            case "Aychah":
            case "Aykha":
            case "Aykhah":
            case "echah":
            case "Echah":
            case "eichah":
            case "eikhah":
            case "ekhah":
            case "Ekhah":
                return EIKHAH__TITLECASE;
            case "ayn":
                return EIN;
            case "aysh":
                return EISH;
            case "eruv":
                return EIRUV;
            case "Eruvin":
                return EIRUVIN__TITLECASE;
            case "ayno":
                return EINO;
            case "emes":
                return EMET;
            case "eretz":
                return ERETZ__TITLECASE;
            case "erev":
                return EREV__TITLECASE;
            case "esrei":
            case "esray":
            case "Esray":
                return ESREI__TITLECASE;
            case "esrog":
                return ETROG;
            case "evved":
                return EVED;
            case "flayshic":
            case "flayshig":
            case "flayshik":
            case "fleishic":
            case "fleishik":
                return FLEISHIG;
            case "Geonim":
            case "geonim":
            case "ge'onim":
                return GE_ONIM__TITLECASE;
            case "gezeira":
            case "gezera":
            case "gezerah":
            case "g'zeira":
            case "g'zera":
            case "g'zeirah":
            case "g'zerah":
                return GEZEIRAH;
            case "Gitin":
                return GITTIN__TITLECASE;
            case "gerama":
            case "geramah":
            case "gramah":
                return GRAMA;
            case "haatzmaut":
            case "Haatzmaut":
            case "haAtzmaut":
            case "HaAtzmaut":
            case "ha'atzmaut":
            case "Ha'atzmaut":
            case "ha'Atzmaut":
            case "Ha'Atzmaut":
            case "haatzma'ut":
            case "Haatzma'ut":
            case "haAtzma'ut":
            case "ha'atzma'ut":
            case "Ha'atzma'ut":
            case "ha'Atzma'ut":
            case "Ha'Atzma'ut":
                return HAATZMA_UT__HA_TITLECASE;
            case "haba":
            case "habah":
            case "haba'a":
                return HABA_AH;
            case "habas":
            case "haBas":
            case "Habas":
            case "HaBas":
            case "habat":
            case "haBat":
            case "Habat":
            case "ha'bas":
            case "ha'Bas":
            case "Ha'bas":
            case "Ha'Bas":
            case "ha'bat":
            case "ha'Bat":
            case "Ha'bat":
            case "Ha'Bat":
                return HABAT__HA_TITLECASE;
            case "haben":
            case "haBen":
            case "Haben":
            case "ha'ben":
            case "ha'Ben":
            case "Ha'ben":
            case "Ha'Ben":
                return HABEN__HA_TITLECASE;
            case "haberiyos":
            case "haBeriyos":
            case "Haberiyos":
            case "HaBeriyos":
            case "haberiyot":
            case "haBeriyot":
            case "Haberiyot":
            case "HaBeriyot":
            case "haberios":
            case "haBerios":
            case "Haberios":
            case "HaBerios":
            case "haberiot":
            case "haBeriot":
            case "Haberiot":
            case "hab'riyos":
            case "haB'riyos":
            case "Hab'riyos":
            case "HaB'riyos":
            case "hab'riyot":
            case "haB'riyot":
            case "Hab'riyot":
            case "HaB'riyot":
            case "hab'rios":
            case "haB'rios":
            case "Hab'rios":
            case "HaB'rios":
            case "hab'riot":
            case "haB'riot":
            case "Hab'riot":
            case "HaB'riot":
                return HABERIOT__HA_TITLECASE;
            case "hachama":
            case "hachamah":
            case "Hachama":
            case "HaChama":
            case "Hachamah":
                return HACHAMAH__HA_TITLECASE;
            case "hachana":
                return HACHANAH;
            case "hachodesh":
            case "haChodesh":
            case "Hachodesh":
                return HACHODESH__HA_TITLECASE;
            case "hadaat":
                return HADA_AT;
            case "hadchak":
            case "hadekhak":
            case "hadkhak":
                return HADECHAK;
            case "ha'aysh":
            case "ha'Aysh":
            case "Ha'aysh":
            case "Ha'Aysh":
            case "ha'eish":
            case "ha'Eish":
            case "Ha'eish":
            case "Ha'Eish":
            case "haEish":
                return HAEISH__HA_TITLECASE;
            case "haEzer":
            case "Haezer":
            case "Ha'ezer":
            case "Ha'Ezer":
                return HAEZER__HA_TITLECASE;
            case "haftorah":
                return HAFTARAH;
            case "hagba":
            case "hagbah":
            case "hagbaha":
                return HAGBAHAH;
            case "hagada":
            case "Hagada":
            case "hagadah":
            case "Hagadah":
            case "haggada":
            case "Haggada":
            case "haggadah":
                return HAGGADAH__TITLECASE;
            case "hagados":
            case "Hagados":
            case "hagadot":
            case "Hagadot":
            case "haggados":
            case "Haggados":
            case "Haggadot":
                return HAGGADOT;
            case "hakadosh":
            case "haKadosh":
            case "Hakadosh":
            case "hakaddosh":
            case "Hakaddosh":
            case "haKaddosh":
            case "HaKaddosh":
                return HAKADOSH__HA_TITLECASE;
            case "hakafos":
            case "Hakafos":
            case "hakafot":
                return HAKAFOT__TITLECASE;
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
                return HAKOKHAVIM__HA_TITLECASE;
            case "Halacha":
            case "Halachah":
            case "Halakhah":
                return HALAKHA__TITLECASE;
            case "halacha":
            case "halachah":
            case "halakhah":
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
                return HALLEL__TITLECASE;
            case "hamafsekes":
            case "haMafsekes":
            case "Hamafsekes":
            case "HaMafsekes":
            case "hamafseket":
            case "haMafseket":
            case "Hamafseket":
                return HAMAFSEKET__HA_TITLECASE;
            case "hamavdil":
            case "haMavdil":
            case "Hamavdil":
                return HAMAVDIL__HA_TITLECASE;
            case "hamazon":
            case "haMazon":
            case "Hamazon":
                return HAMAZON__HA_TITLECASE;
            case "hamikdash":
            case "haMikdash":
            case "Hamikdash":
            case "hamiqdash":
            case "haMiqdash":
            case "Hamiqdash":
            case "HaMiqdash":
            case "ha'mikdash":
            case "ha'Mikdash":
            case "Ha'mikdash":
            case "Ha'Mikdash":
            case "ha'miqdash":
            case "ha'Miqdash":
            case "Ha'miqdash":
            case "Ha'Miqdash":
                return HAMIKDASH__HA_TITLECASE;
            case "ha'mikra":
            case "hamiqra":
            case "ha'miqra":
                return HAMIKRA;
            case "hamincha":
            case "haminchah":
            case "ha'mincha":
            case "ha'minchah":
            case "Hamincha":
            case "haMincha":
            case "HaMincha":
            case "Haminchah":
            case "haMinchah":
            case "Ha'mincha":
            case "ha'Mincha":
            case "Ha'Mincha":
            case "Ha'minchah":
            case "ha'Minchah":
            case "Ha'Minchah":
                return HAMINCHAH__HA_TITLECASE;
            case "hamitzva":
            case "haMitzva":
            case "Hamitzva":
            case "HaMitzva":
            case "hamitzvah":
            case "haMitzvah":
            case "Hamitzvah":
                return HAMITZVAH__HA_TITLECASE;
            case "hamitzvos":
            case "haMitzvos":
            case "Hamitzvos":
            case "HaMitzvos":
            case "hamitzvot":
            case "haMitzvot":
            case "Hamitzvot":
                return HAMITZVOT__HA_TITLECASE;
            case "hamotzi":
            case "ha'motzi":
            case "Hamotzi":
            case "Ha'motzi":
            case "haMotzi":
                return HAMOTZI__HA_TITLECASE;
            case "hanaa":
            case "hanaah":
            case "hana'a":
                return HANA_AH;
            case "hanacha":
            case "hanakha":
            case "hanakhah":
                return HANACHAH;
            case "hanetz":
            case "haneitz":
            case "Hanetz":
            case "Haneitz":
            case "HaNetz":
            case "Netz":
            case "Neitz":
            case "netz":
            case "neitz":
                return HANEITZ__HA_TITLECASE;
            case "ha'omer":
            case "ha'Omer":
            case "Ha'omer":
            case "Ha'Omer":
            case "haOmer":
                return HAOMER__HA_TITLECASE;
            case "ha'poskim":
                return HAPOSKIM;
            case "haPoskim":
            case "Haposkim":
            case "Ha'Poskim":
            case "ha'Poskim":
                return HAPOSKIM__HA_TITLECASE;
            case "hashachar":
            case "haShachar":
            case "hashakhar":
            case "haShakhar":
            case "HaShakhar":
                return HASHACHAR__HA_TITLECASE;
            case "hashana":
            case "haShana":
            case "Hashana":
            case "HaShana":
            case "hashanah":
            case "haShanah":
            case "Hashanah":
                return HASHANAH__HA_TITLECASE;
            case "Hashem":
            case "haShem":
                return HASHEM__HA_TITLECASE;
            case "hashemashot":
            case "haShemashot":
            case "Hashemashot":
            case "hashmashot":
            case "haShmashot":
            case "Hashmashot":
            case "HaShmashot":
                return HASHEMASHOT__HA_TITLECASE;
            case "hashevach":
            case "haShevach":
            case "Hashevach":
            case "hashevakh":
            case "haShevakh":
            case "Hashevakh":
            case "HaShevakh":
            case "ha'shevach":
            case "ha'Shevach":
            case "Ha'shevach":
            case "Ha'Shevach":
            case "ha'shevakh":
            case "ha'Shevakh":
            case "Ha'shevakh":
            case "Ha'Shevakh":
                return HASHACHAR__HA_TITLECASE;
            case "Hashulchan":
            case "haShulchan":
            case "HaShulkhan":
            case "hashulkhan":
            case "Hashulkhan":
                return HASHULCHAN__HA_TITLECASE;
            case "ha'Torah":
            case "Ha'Torah":
            case "ha'torah":
            case "hatorah":
                return HATORAH__HA_TITLECASE;
            case "hatzibbur":
            case "haTzibbur":
            case "Hatzibbur":
            case "HaTzibbur":
            case "hatzibur":
            case "Hatzibur":
            case "haTzibur":
                return HATZIBUR__HA_TITLECASE;
            case "havdala":
            case "Havdala":
            case "havdalah":
                return HAVDALAH__TITLECASE;
            case "hazikaron":
            case "haZikaron":
            case "Hazikaron":
            case "hazikkaron":
            case "haZikkaron":
            case "Hazikkaron":
            case "HaZikkaron":
            case "ha'zikaron":
            case "ha'Zikaron":
            case "Ha'zikaron":
            case "Ha'Zikaron":
            case "ha'zikkaron":
            case "ha'Zikkaron":
            case "Ha'zikkaron":
            case "Ha'Zikkaron":
                return HAZIKARON__HA_TITLECASE;
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
            case "hodaa":
            case "hodaah":
            case "hoda'a":
                return HODA_AH;
            case "hoshana":
            case "Hoshana":
            case "hoshanah":
                return HOSHANAH__TITLECASE;
            case "hoshanos":
            case "Hoshanos":
            case "hoshanot":
                return HOSHANOT__TITLECASE;
            case "i":
                return "I";
            case "Igrot":
                return IGGROT__TITLECASE;
            case "IM":
                return IGGROT___MOSHE__TITLECASE;
            case "irui":
                return IRUY;
            case "isha":
                return ISHAH;
            case "Isha":
                return ISHAH__TITLECASE;
            case "isur":
                return ISSUR;
            case "isurei":
            case "isurrei":
            case "issurrei":
                return ISSUREI;
            case "isurim":
            case "isurrim":
            case "issurrim":
                return ISSURIM;
            case "iyar":
            case "iyyar":
            case "Iyyar":
                return IYAR__TITLECASE;
            case "kabala":
            case "Kabala":
            case "kabalah":
            case "Kabalah":
            case "kabbala":
            case "Kabbala":
            case "kabbalah":
                return KABBALAH__TITLECASE;
            case "kabalas":
            case "Kabalas":
            case "kabalat":
            case "Kabalat":
            case "kabbalas":
            case "Kabbalas":
            case "kabbalat":
                return KABBALAT__TITLECASE;
            case "kaddish":
            case "kadish":
            case "Kadish":
                return KADDISH__TITLECASE;
            case "kaddosh":
                return KADOSH;
            case "kehal":
                return KAHAL;
            case "kala":
            case "kalah":
            case "kalla":
                return KALLAH;
            case "kammatz":
                return KAMATZ;
            case "kaparos":
            case "Kaparos":
            case "Kaparot":
            case "kapparos":
            case "Kapparos":
            case "kapparot":
            case "Kapparot":
                return KAPAROT;
            case "careis":
            case "careit":
            case "caret":
            case "kares":
            case "kareis":
            case "karet":
                return KAREIT;
            case "kattan":
                return KATAN;
            case "Kattan":
                return KATAN__TITLECASE;
            case "kavana":
            case "kavanna":
            case "kavannah":
            case "kavvana":
            case "kavvanah":
                return KAVANAH;
            case "k'baytza":
            case "k'beitza":
            case "k'beitzah":
            case "k'betza":
            case "k'betzah":
            case "kebaytza":
            case "kebeitza":
            case "kebetza":
            case "kebetzah":
                return KEBEITZAH;
            case "k'baytzim":
            case "k'beitzim":
            case "k'betzim":
            case "kebaytzim":
            case "kebetzim":
                return KEBEITZIM;
            case "kdusha":
            case "kdushah":
            case "kedusha":
            case "k'dusha":
            case "k'dushah":
                return KEDUSHAH;
            case "kdushos":
            case "kdushot":
            case "kedushos":
            case "k'dushos":
            case "k'dushot":
                return KEDUSHOT;
            case "kelim":
                return KEILIM;
            case "kli":
                return KELI;
            case "knas":
                return KENAS;
            case "Kenesset":
                return KENESET__TITLECASE;
            case "kenesset":
                return KENESET;
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
            case "kevias":
            case "kvias":
            case "kviat":
            case "k'vias":
            case "k'viat":
                return KEVIAT;
            case "kazayis":
            case "kazayit":
            case "kezayis":
            case "k'zayis":
            case "k'zayit":
                return KEZAYIT;
            case "kazaytim":
            case "kazeitim":
            case "kazetim":
            case "kezetim":
            case "kezaytim":
            case "k'zaytim":
            case "k'zeitim":
            case "k'zetim":
                return KEZEITIM;
            case "kiddush":
            case "kidush":
            case "Kidush":
                return KIDDUSH__TITLECASE;
            case "kidushin":
                return KIDDUSHIN;
            case "Kidushin":
                return KIDDUSHIN__TITLECASE;
            case "kinos":
                return KINOT;
            case "kipur":
            case "Kipur":
            case "kippur":
                return KIPPUR__TITLECASE;
            case "kitel":
                return KITTEL;
            case "kiyyum":
                return KIYUM;
            case "cohanim":
            case "Cohanim":
            case "kohanim":
                return "Kohanim";
            case "cohein":
            case "cohen":
            case "kohein":
                return KOHEN;
            case "cochavim":
            case "cokhavim":
            case "kochavim":
                return KOKHAVIM;
            case "koll":
                return KOL;
            case "Koll":
                return KOL__TITLECASE;
            case "koleinu":
            case "kolleinu":
            case "Kolleinu":
                return KOLEINU__TITLECASE;
            case "qorban":
                return KORBAN;
            case "Qorban":
                return KORBAN__TITLECASE;
            case "koray":
            case "kore":
            case "koreh":
                return KOREI;
            case "kovei'ah":
            case "koveiya":
            case "koveiyah":
            case "koveya":
            case "koveyah":
                return KOVEI_A;
            case "l'akum":
            case "l'akkum":
            case "leakum":
            case "le'akkum":
                return LE_AKUM;
            case "lehakhmir":
            case "le'hachmir":
            case "le'hakhmir":
            case "l'hachmir":
            case "l'hakhmir":
                return LEHACHMIR;
            case "l'goy":
                return LEGOY;
            case "lehakel":
            case "le'hakeil":
            case "le'hakel":
            case "l'hakel":
            case "l'hakeil":
                return LEHAKEIL;
            case "lay":
                return LEIH;
            case "layn":
                return LEIN;
            case "layned":
                return LEINED;
            case "layning":
                return LEINING;
            case "lecha":
            case "Lecha":
            case "lechah":
            case "Lechah":
            case "lekha":
            case "lekhah":
            case "Lekhah":
                return LEKHA__TITLECASE;
            case "lechatchila":
            case "lechatchilah":
            case "lechatkhila":
            case "lechatkhilah":
            case "lehatchila":
            case "lehatchilah":
            case "lehatkhila":
            case "lehatkhilah":
            case "lekhatkhila":
            case "lekhatkhilah":
            case "lichatchila":
            case "lichatchilah":
            case "lichatkhila":
            case "lichatkhilah":
            case "lihatchila":
            case "lihatchilah":
            case "lihatkhila":
            case "lihatkhilah":
            case "likhatchila":
            case "likhatchilah":
            case "likhatkhila":
            case "likhatkhilah":
            case "li'chatchila":
            case "li'chatchilah":
            case "li'chatkhila":
            case "li'chatkhilah":
            case "li'hatchila":
            case "li'hatchilah":
            case "li'hatkhila":
            case "li'hatkhilah":
            case "li'khatchila":
            case "li'khatchilah":
            case "li'khatkhila":
            case "li'khatkhilah":
            case "l'chatchila":
            case "l'chatchilah":
            case "l'chatkhila":
            case "l'chatkhilah":
            case "l'hatchila":
            case "l'hatchilah":
            case "l'hatkhila":
            case "l'hatkhilah":
            case "l'khatchila":
            case "l'khatchilah":
            case "l'khatkhila":
            case "l'khatkhilah":
                return LEKHATCHILAH;
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
                return LEMA_ASEH;
            case "lenochri":
            case "le'nochri":
            case "le'nokhri":
            case "l'nochri":
            case "l'nokhri":
                return LENOKHRI;
            case "levatala":
            case "le'vatala":
            case "le'vatalah":
            case "livatala":
            case "livatalah":
            case "li'vatala":
            case "li'vatalah":
            case "l'vatala":
            case "l'vatalah":
                return LEVATALAH;
            case "lullav":
                return LULAV;
            case "Maariv":
            case "maariv":
                return "Ma'ariv";
            case "maase":
            case "maaseh":
            case "ma'ase":
            case "mayse":
            case "mayseh":
                return MA_ASEH;
            case "maaser":
            case "mayser":
                return MA_ASER;
            case "maasros":
            case "maasrot":
            case "ma'asros":
            case "maysros":
            case "maysrot":
                return MA_ASROT;
            case "machaloket":
            case "machaloqet":
            case "machloqet":
            case "makhaloket":
            case "makhaloqet":
            case "makhloket":
            case "makhloqet":
                return MACHLOKET;
            case "mafsekes":
            case "Mafsekes":
            case "mafseket":
                return MAFSEKET__TITLECASE;
            case "maphtir":
                return MAFTIR;
            case "Malkenu":
                return MALKEINU__TITLECASE;
            case "marror":
                return MAROR;
            case "matza":
            case "matzo":
            case "matzoh":
                return MATZAH;
            case "mazzon":
                return MAZON;
            case "megila":
            case "megilla":
            case "megilah":
                return MEGILLAH;
            case "Megila":
            case "Megilah":
            case "Megilla":
                return MEGILLAH__TITLECASE;
            case "megilos":
            case "megilot":
            case "megillos":
                return MEGILLOT;
            case "melacha":
            case "melachah":
            case "melakha":
                return MELAKHAH;
            case "meoray":
            case "Meoray":
            case "meorei":
            case "Meorei":
            case "me'oray":
            case "Me'oray":
            case "me'orei":
            case "m'oray":
            case "M'oray":
            case "m'orei":
            case "M'orei":
                return ME_OREI__TITLECASE;
            case "mesora":
            case "mesorra":
            case "mesorrah":
            case "messora":
            case "messorah":
                return MESORAH;
            case "Mesora":
            case "Mesorra":
            case "Mesorrah":
            case "Messora":
            case "Messorah":
                return MESORAH__TITLECASE;
            case "mezonos":
                return MEZONOT;
            case "Mezonos":
                return MEZONOT__TITLECASE;
            case "medrish":
            case "Medrish":
            case "medrash":
            case "Medrash":
            case "midrash":
                return MIDRASH__TITLECASE;
            case "mikva":
            case "mikvah":
            case "mikve":
                return MIKVEH;
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
            case "minay":
            case "Minay":
            case "minei":
                return MINEI__TITLECASE;
            case "minhag":
                return "Minhag";
            case "mishkan":
                return MISHKAH__TITLECASE;
            case "Mishna":
            case "Mishne":
            case "Mishneh":
                return MISHNAH__TITLECASE;
            case "MB":
                return MISHNAH___BERURAH__TITLECASE;
            case "mitzva":
                return "mitzvah";
            case "mitztaeir":
            case "mitztaer":
            case "mitzta'er":
                return MITZA_EIR;
            case "mitzvas":
                return MITZVAT;
            case "mitzvos":
                return MITZVOT;
            case "moadim":
            case "mo'adim":
            case "Moadim":
                return MO_ADIM__TITLECASE;
            case "moed":
            case "Moed":
            case "mo'ed":
                return MO_ED__TITLECASE;
            case "moshe":
            case "Mosheh":
            case "mosheh":
                return "Moshe";
            case "muktzah":
            case "muktza":
            case "muktze":
                return MUKTZEH;
            case "musaf":
            case "mussaf":
            case "Mussaf":
                return MUSAF__TITLECASE;
            case "muttar":
                return MUTAR;
            case "Nasan":
            case "Nassan":
            case "Nattan":
                return NATAN__TITLECASE;
            case "nephesh":
                return NEFESH;
            case "negia":
                return NEGIAH;
            case "neila":
            case "Neila":
            case "neilah":
            case "Neilah":
            case "ne'ila":
            case "Ne'ila":
            case "ne'ilah":
            case "niila":
            case "Niila":
            case "niilah":
            case "Niilah":
            case "ni'ila":
            case "Ni'ila":
            case "ni'ilah":
            case "Ni'ilah":
                return NE_ILAH__TITLECASE;
            case "neshama":
                return NESHAMAH;
            case "nichah":
            case "nikha":
            case "nikhah":
                return NICHA;
            case "nida":
            case "nidah":
            case "nidda":
                return NIDDAH;
            case "Nida":
            case "Nidah":
            case "Nidda":
                return NIDDAH__TITLECASE;
            case "nishmas":
            case "Nishmas":
            case "nishmat":
                return NISHMAT__TITLECASE;
            case "nissuin":
            case "nissu'in":
            case "nisu'in":
                return NISUIN;
            case "nochri":
                return NOKHRI;
            case "noi":
                return NOY;
            case "nusakh":
            case "nussach":
            case "nussakh":
                return NUSACH;
            case "OH":
                return OC__UPPERCASE;
            case "ona":
                return ONAH;
            case "onen":
                return ONEIN;
            case "ommer":
                return OMER;
            case "Ommer":
                return OMER__TITLECASE;
            case "Orah":
            case "Orakh":
                return ORACH__TITLECASE;
            case "oved":
                return OVEID;
            case "ovdei":
                return OVEDEI;
            case "ovdim":
                return OVEDIM;
            case "p'gum":
                return PAGUM;
            case "parasha":
            case "parsha":
            case "parshah":
                return PARASHAH;
            case "parve":
                return PAREVE;
            case "pasuq":
                return PASUK;
            case "Pasuq":
                return PASUK__TITLECASE;
            case "pas":
                return PAT;
            case "pereq":
                return PEREK;
            case "Pereq":
                return PEREK__TITLECASE;
            case "psak":
            case "p'sak":
                return PESAK;
            case "Psak":
            case "P'sak":
                return PESAK__TITLECASE;
            case "pesach":
            case "pesakh":
            case "Pesakh":
                return PESACH__TITLECASE;
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
                return PESACHIM__TITLECASE;
            case "psukai":
            case "Psukai":
            case "psukei":
            case "Psukei":
            case "pesukai":
            case "Pesukai":
            case "pesukei":
            case "pisukai":
            case "Pisukai":
            case "pisukei":
            case "Pisukei":
            case "p'sukai":
            case "P'sukai":
            case "p'sukei":
            case "P'sukei":
                return PESUKEI__TITLECASE;
            case "pidyon":
            case "pidyyon":
            case "Pidyyon":
                return PIDYON__TITLECASE;
            case "pekuach":
                return PIKUACH;
            case "Pische":
            case "Pischei":
            case "Pischay":
            case "Pishei":
            case "Pishay":
            case "Pitchay":
            case "Pithei":
            case "Pithay":
                return PITCHEI__TITLECASE;
            case "Pirkai":
            case "Pirkay":
                return PIRKEI__TITLECASE;
            case "plag":
                return PLAG__TITLECASE;
            case "poseik":
                return POSEK;
            case "purim":
            case "purrim":
            case "Purrim":
                return PURIM__TITLECASE;
            case "raba":
            case "Raba":
            case "rabah":
            case "Rabah":
            case "rabba":
            case "Rabba":
            case "rabbah":
                return RABBAH__TITLECASE;
            case "Rabi":
                return RABBI__TITLECASE;
            case "rabbim":
                return RABIM;
            case "refua":
            case "rfua":
            case "rfuah":
            case "r'fua":
            case "r'fuah":
                return REFUAH;
            case "resh":
            case "Resh":
            case "reish":
                return REISH__TITLECASE;
            case "resha":
            case "reshah":
            case "reishah":
                return REISHA;
            case "rishonim":
                return RISHONIM__TITLECASE;
            case "rosh":
                return ROSH_TITLECASE;
            case "sefeir":
                return SEFER;
            case "Sefeir":
                return SEFER__TITLECASE;
            case "seforim":
                return SEFARIM;
            case "Sefiras":
            case "Sfiras":
            case "Sfirat":
            case "S'firas":
            case "S'firat":
                return SEFIRAT__TITLECASE;
            case "seif":
                return SEIF;
            case "segol":
            case "seggol":
            case "Seggol":
                return SEGOL__TITLECASE;
            case "sekila":
            case "sekilla":
            case "sekillah":
            case "skila":
            case "skilla":
            case "skilah":
            case "skillah":
            case "s'kila":
            case "s'killa":
            case "s'kilah":
            case "s'killah":
                return SEKILAH;
            case "slichos":
            case "Slichos":
            case "slichot":
            case "Slichot":
            case "selichos":
            case "Selichos":
            case "selichot":
            case "s'lichos":
            case "S'lichos":
            case "s'lichot":
            case "S'lichot":
                return SELICHOT__TITLECASE;
            case "sefardi":
            case "Sefardi":
            case "sefardic":
            case "Sefardic":
            case "sephardi":
            case "sephardic":
            case "Sephardic":
                return SEPHARDI__TITLECASE;
            case "sefardim":
            case "Sefardim":
            case "sephardim":
                return SEPHARDIM__TITLECASE;
            case "seuda":
            case "se'uda":
            case "se'udah":
                return SEUDAH;
            case "Seuda":
            case "Se'uda":
            case "Se'udah":
                return SEUDAH__TITLECASE;
            case "seudas":
            case "se'udas":
            case "se'udat":
                return SEUDAT;
            case "Seudas":
            case "Se'udas":
            case "Se'udat":
                return SEUDAT__TITLECASE;
            case "seudos":
            case "se'udos":
            case "se'udot":
                return SEUDOT;
            case "Seudos":
            case "Se'udos":
            case "Se'udot":
                return SEUDOT__TITLECASE;
            case "shaa":
            case "shaah":
            case "sha'a":
                return SHA_AH;
            case "Shaa":
            case "Shaah":
            case "Sha'a":
                return SHA_AH__TITLECASE;
            case "shaat":
                return SHA_AT;
            case "Shaat":
                return SHA_AT__TITLECASE;
            case "shabbat":
            case "shabbos":
            case "Shabbos":
                return SHABBAT__TITLECASE;
            case "shacharit":
            case "shacharis":
            case "shakharis":
            case "shakharit":
            case "Shakharit":
            case "Shakharis":
                return SHACHARIT__TITLECASE;
            case "shaliakh":
            case "sheliach":
            case "sheliakh":
            case "shliach":
            case "shliakh":
            case "sh'liach":
            case "sh'liakh":
                return SHALIACH;
            case "Shaliakh":
            case "Sheliach":
            case "Sheliakh":
            case "Shliach":
            case "Shliakh":
            case "Sh'liach":
            case "Sh'liakh":
                return SHALIACH__TITLECASE;
            case "Shach":
                return SHAKH__TITLECASE;
            case "Shavuos":
                return SHAVUOT__TITLECASE;
            case "shebalev":
            case "shibaleiv":
            case "shibalev":
            case "sh'baleiv":
            case "sh'balev":
                return SHEBALEIV;
            case "sh'bikdusha":
            case "sh'bikdushah":
            case "shebikdusha":
                return SHEBIKDUSHAH;
            case "shehakol":
            case "sheHakol":
            case "Shehakol":
            case "shehakkol":
            case "sheHakkol":
            case "Shehakkol":
            case "sh'hakol":
            case "Sh'hakol":
            case "Sh'Hakol":
            case "sh'hakkol":
            case "Sh'hakkol":
            case "Sh'Hakkol":
                return SHEHAKOL__SHE_TITLECASE;
            case "sheni":
                return SHEINI;
            case "Shechina":
            case "Shekhina":
            case "Shechinah":
            case "Sh'china":
            case "Sh'khina":
            case "Sh'chinah":
            case "Sh'khinah":
                return SHEKHINAH__TITLECASE;
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
                return SHEKIAH__TITLECASE;
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
                return SHEKIAT__TITLECASE;
            case "shlishi":
                return SHELISHI;
            case "shelishis":
            case "Shelishis":
            case "shelishit":
            case "shlishis":
            case "Shlishis":
            case "shlishit":
            case "Shlishit":
            case "sh'lishis":
            case "Sh'lishis":
            case "sh'lishit":
            case "Sh'lishit":
                return SHELISHIT__TITLECASE;
            case "shlita":
            case "Shlita":
            case "shlitah":
            case "Shlitah":
            case "shalita":
            case "Shalita":
            case "shalitah":
            case "Shalitah":
            case "shelita":
            case "Shelita":
            case "shelitah":
            case "Shelitah":
            case "sh'lita":
            case "Sh'lita":
            case "sh'litah":
            case "Sh'litah":
                return SHELITA;
            case "shema":
            case "shma":
            case "Shma":
            case "sh'ma":
            case "Sh'ma":
                return SHEMA__TITLECASE;
            case "shemini":
            case "shmini":
            case "Shmini":
            case "sh'mini":
            case "Sh'mini":
                return SHEMINI__TITLECASE;
            case "shemone":
            case "Shemone":
            case "shemoneh":
            case "shmone":
            case "Shmone":
            case "shmoneh":
            case "Shmoneh":
            case "sh'mone":
            case "Sh'mone":
            case "sh'moneh":
            case "Sh'moneh":
                return SHEMONEH__TITLECASE;
            case "Shemos":
            case "Shmos":
            case "Shmot":
            case "Sh'mos":
            case "Sh'mot":
                return SHEMOT__TITLECASE;
            case "shtar":
            case "sh'tar":
                return SHETAR;
            case "sheva":
            case "shevah":
            case "Shevah":
                return SHEVA__TITLECASE;
            case "shinnuy":
                return SHINUY;
            case "shivah":
                return SHIVA;
            case "Shivah":
                return SHIVA__TITLECASE;
            case "shochein":
            case "Shochein":
            case "shokhein":
            case "shochen":
            case "Shochen":
            case "shokhen":
            case "Shokhen":
                return SHOKHEIN__TITLECASE;
            case "Shulkhan":
                return SHULCHAN__TITLECASE;
            case "SA":
                return SHULCHAN___ARUKH__TITLECASE;
            case "sidur":
                return SIDDUR;
            case "Sidur":
                return SIDDUR__TITLECASE;
            case "sifrai":
            case "sifray":
                return SIFREI;
            case "Sifrai":
            case "Sifray":
                return SIFREI;
            case "sifri":
                return SIFRI__TITLECASE;
            case "simin":
                return SIMAN;
            case "Simchas":
                return SIMCHAT__TITLECASE;
            case "sechar":
            case "sekhar":
            case "schar":
            case "s'char":
            case "s'khar":
                return SKHAR;
            case "soleddet":
                return SOLEDET;
            case "Sota":
            case "Sotta":
            case "Sottah":
                return SOTAH__TITLECASE;
            case "Sukah":
            case "Sukka":
                return SUKKAH__TITLECASE;
            case "Sukkos":
            case "Sukos":
            case "Sukot":
                return SUKKOT__TITLECASE;
            case "taam":
                return TA_AM;
            case "taamei":
            case "taamay":
            case "ta'amai":
                return TA_AMEI;
            case "taanis":
            case "taanit":
                return TA_ANIT;
            case "Taanit":
            case "Taynis":
                return TA_ANIT__TITLECASE;
            case "tachanun":
            case "takhanun":
            case "Takhanun":
                return TACHANUN__TITLECASE;
            case "takana":
            case "takanna":
            case "takannah":
                return TAKANAH;
            case "takanas":
            case "takannas":
            case "takannat":
                return TAKANAT;
            case "Takanas":
            case "Takannas":
            case "Takannat":
                return TAKANAT;
            case "talis":
            case "talit":
            case "tallis":
                return TALLIT;
            case "tammuz":
            case "tamuz":
            case "Tamuz":
                return TAMMUZ__TITLECASE;
            case "tashlich":
            case "Tashlich":
            case "tashlikh":
                return TASHLIKH__TITLECASE;
            case "tavllin":
                return TAVLIN;
            case "tavshill":
                return TAVSHIL;
            case "tavshilin":
            case "tavshillin":
            case "Tavshillin":
                return TAVSHILIN__TITLECASE;
            case "taz":
                return TAZ__TITLECASE;
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
            case "tfilin":
            case "tfillin":
            case "t'filin":
            case "t'fillin":
                return TEFILLIN;
            case "tekia":
                return TEKIAH;
            case "tekios":
                return TEKIOT;
            case "tekufa":
            case "tekupha":
            case "tekuphah":
            case "t'kufa":
            case "t'kufah":
            case "t'kupha":
            case "t'kuphah":
                return TEKUFAH;
            case "tekufas":
            case "tekuphas":
            case "tekuphat":
            case "t'kufas":
            case "t'kufat":
            case "t'kuphas":
            case "t'kuphat":
                return TEKUFAT;
            case "trefos":
            case "trefot":
            case "treifot":
            case "treifos":
            case "t'refos":
            case "t'refot":
            case "t'reifot":
            case "t'reifos":
            case "terefos":
            case "terefot":
            case "tereifos":
                return TEREIFOT;
            case "tshuva":
            case "tshuvah":
            case "t'shuva":
            case "t'shuvah":
            case "teshuvah":
                return TESHUVA;
            case "Tshuva":
            case "Tshuvah":
            case "T'shuva":
            case "T'shuvah":
            case "Teshuvah":
                return TESHUVA__TITLECASE;
            case "tshuvot":
            case "t'shuvot":
                return TESHUVOT;
            case "teruma":
            case "truma":
            case "trumah":
            case "t'ruma":
            case "t'rumah":
                return TERUMAH;
            case "terumos":
            case "trumos":
            case "trumot":
            case "t'rumos":
            case "t'rumot":
                return TERUMOT;
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
            case "tisha":
            case "Tishah":
                return TISHA__TITLECASE;
            case "tishrei":
            case "tishray":
            case "Tishray":
                return TISHREI__TITLECASE;
            case "Tosfot":
            case "Tosphot":
            case "Tosefot":
            case "Tosephot":
            case "Tosfos":
            case "Tosafos":
                return TOSAFOT__TITLECASE;
            case "Toyre":
            case "Toreh":
                return TORAH__TITLECASE;
            case "toivel":
            case "toveil":
                return TOVEL;
            case "trayf":
                return TREIF;
            case "tzeis":
            case "Tzeis":
            case "tzeit":
                return TZEIT__TITLECASE;
            case "tzibbur":
                return TZIBUR;
            case "tzitzis":
                return TZITZIT;
            case "ushpizin":
            case "ushpizzin":
            case "Ushpizzin":
                return USHPIZIN__TITLECASE;
            case "Vidui":
                return VIDUY__TITLECASE;
            case "yesh":
                return YEISH;
            case "yerushalmi":
                return YERUSHALMI__TITLECASE;
            case "Yerushallayim":
                return YERUSHALAYIM__TITLECASE;
            case "yigdal":
                return "Yigdal";
            case "Yishtabakh":
                return YISHTABACH__TITLECASE;
            case "yisrael":
            case "yisroel":
            case "Yisroel":
                return YISRAEL__TITLECASE;
            case "Yiskor":
                return YIZKOR__TITLECASE;
            case "Yore":
                return YOREH__TITLECASE;
            case "Yuntif":
            case "Yuntiv":
                return YOM___TOV__TITLECASE;
            case "Zara":
                return ZARAH__TITLECASE;
            case "zara":
                return ZARAH;
            case "zemiros":
            case "zmiros":
            case "zmirot":
            case "z'miros":
            case "z'mirot":
                return ZEMIROT;
            case "Zemiros":
            case "Zmiros":
            case "Zmirot":
            case "Z'miros":
            case "Z'mirot":
                return ZEMIROT__TITLECASE;
            case "Zimun":
                return ZIMMUN__TITLECASE;
            default:
                return word;
        }
    }
}
