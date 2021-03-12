


package it.javaboss.webapp.mms;

public enum EnumImage {

	 DIECI(10,"TZ","TAZZE")
	, UNDICI(11,"DD","DADI")
	, DODICI(12,"DN","DNA")
	, TREDICI(13,"DM","DAMA")
	, QUATTORDICI(14,"TR","TORRE")
	, QUINDI(15,"DL","DUELLO")
	, SEDICI(16,"DC","DUCE")
	, DICIASETTE(17,"DGH","DIGA")
	, DICIOTTO(18,"TF","TUFFO")
	, DICIANNOVE(19,"TP","TAPPI")
	, VENTI(20,"NS","NASO")
	
	, VENTIUNO(21,"ND","NUDO")
	, VENTIDUE(22,"NN","NONNA")
	, VENTITRE(23,"NM","ANIMA")
	, VENTIQUATTRO(24,"NR","NERO")
	, VENTICINQUE(25,"NL","ANELLO")
	, VENTISEI(26,"NC","NOCI")
	, VENTISETTE(27,"GNCH","GNOCCHI")
	, VENTIOTTO(28," NV"," NEVE")
	, VENTINOVE(29,"NB","NUBI")
	, TRENTA(30," MS"," MASSAIA")
	
	, TRENTAUNO(31,"MT","MOTO")
	, TRENTADUE(32,"MN","MANO")
	, TRENTATRE(33,"MM","MUMMIA")
	, TRENTAQUATTRO(34,"MR","MURO")
	, TRENTACINQUE(35,"ML","MELA")
	, TRENTASEI(36,"MC","MICIO")
	, TRENTASETTE(37,"MCH","MUCCA")
	, TRENTOTTO(38,"MF","MAFIA")
	, TRENTANOVE(39,"MB","AMBO")
	, QUARANTA(40,"RS","RASOIO")

	, QUARANTAUNO(41,"RD","RODEO")
	, QUARANTADUE(42,"RN","RANA")
	, QUARANTATRE(43,"RM","ROMA")
	, QUARANTAQUATTRO(44,"RR","ORRORE")
	, QUARANTACINQUE(45,"RL","RALLY")
	, QUARANTASEI(46,"RC","ROCCIA")
	, QUARANTASETTE(47,"RCH","ORCA")
	, QUARANTOTTO(48,"RV","ROVI")
	, QUARANTANOVA(49,"RB","RABBIA")
	, CINQUANTA(50,"LSC","LISCIO")

	, CINQUANTUNO(51,"LT","LETTO")
	, CINQUANTADUE(52,"LN","LEONE")
	, CINQUANTATRE(53,"LM","LAMA")
	, CINQUANTAQUATTRO(54,"LR","LIRE")
	, CINQUANTACINQUE(55,"LL","LILLY")
	, CINQUANTASEI(56,"LC","LACCI")
	, CINQUANTASETTE(57,"LGH","LAGO")
	, CINQUANTAOTTO(58,"LV","LAVA")
	, CINQUANTANOVA(59,"LP","LUPO")
	, SESSANTA(60,"CS","CESSO")



	,	SESSANTUNO (61,"CD","CD")
	,	SESSANTADUE (62,"CGN","CIGNO")
	,	SESSANTATRE (63,"CM","CIME")
	,	SESSANTAQUATTRO (64,"CR","CERO")
	,	SESSANTACINQUE (65,"GGL","GIGLIO")
	,	SESSANTASEI (66,"CC","CIUCCIO")
	,	SESSANTASETTE (67,"CCH","CICCHE")
	,	SESSANTOTTO (68,"GV","GIOVE")
	,	SESSANTANOVA (69,"CP","CIP - di Ciop")
	,	SETTANTA (70,"CHS","CASSA")
	
	,	SETTANTUNO  (71,"CHD","CHIODI")
	,	SETTANTADUE  (72,"CHN","CANE")
	,	SETTANTATRE  (73,"GHM","GOMMA")
	,	SETTANTAQUATTRO  (74,"GHR","GUERRA")
	,	SETTANTACINQUE  (75,"QL","AQUILA")
	,	SETTANTASEI  (76,"GHC","GHIACCIO")
	,	SETTANTASETTE  (77,"CHCH","COCCO")
	,	SETTANTOTTO  (78,"CHV","CHIAVE")
	,	SETTANTANOVE  (79,"CHP","COPPE") 
	,	OTTANTA (80,"VS","VASO")
	,	OTTANTUNO (81,"FT","FETO")
	,	OTTANTADUE (82,"FN","FÒN")
	,	OTTANTATRE (83,"FM","FIUME")
	,	OTTANTAQUATTRO (84,"FR","FARO")
	,	OTTANTACINQUE (85,"FGL","FOGLIE")
	,	OTTANTASEI (86,"FC","FACCIA")
	,	OTTANTASETTE (87,"FCH","FUOCO")
	,	OTTANTOTTO (88,"FV","FAVE")
	,	OTTANTANOVE (89,"VP","VIP")
	,	NOVANTA (90,"PZ","PIZZA")

	,	NOVANTUNO(91,"PD","PIEDE")   
	,	NOVANTADUE(92,"PN","PANE ")
	,	NOVANTATRE(93,"PM","PIUMA")   
	,	NOVANTAQUATTRO(94,"PR","PERA")
	,	NOVANTACINQUE(95,"BGL","BIGLIA")
	,	NOVANTASEI(96,"BC","BICI ")
	,	NOVANTASETTE(97,"PCH","PACCO")
	//,	NOVANTOTTO(98,"PF","PUFFO") to allow the test UNKONW NUMBER
	,	NOVANTANOVE(99,"PP","PIPPO")


	
	
	, CENTO(00,"SASSO", "SASSO")
	
	
	;
/*
	*/
	private int number;
	private String phonetic;//TODO print the associated sound
	private String image;
	
	private EnumImage(int newNumber, String newPhonetic, String newImage  ){
		this.number = newNumber;
		this.phonetic = newPhonetic;
		this.image = newImage;
	}

	public int number() {
		return number;
	}

	public String image() {
		return image;
	}
	
	
	
	
}

