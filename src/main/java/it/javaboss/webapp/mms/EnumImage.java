


package it.javaboss.webapp.mms;

public enum EnumImage {

	DIECI(10,"TZ","TAZZE"),
	UNDICI(11,"DD","DADI"),
	DODICI(12,"DN","DNA"),
	TREDICI(13,"DM","DAMA"),
	QUATTORDICI(14,"TR","TORRE"),
	QUINDI(15,"DL","DUELLO"),
	SEDICI(16,"DC","DUCE"),
	DICIASETTE(17,"DGH","DIGA"),
	DICIOTTO(18,"TF","TUFFO"),
	DICIANNOVE(19,"TP","TAPPI"),
	VENTI(20,"NS","NASO"),
	VENTIUNO(21,"ND","NUDO"),
	VENTIDUE(22,"NN","NONNA"),
	VENTITRE(23,"NM","ANIMA"),
	VENTIQUATTRO(24,"NR","NERO"),
	VENTICINQUE(25,"NL","ANELLO"),
	VENTISEI(26,"NC","NOCI"),
	VENTISETTE(27,"GNCH","GNOCCHI"),
	VENTIOTTO(28," NV"," NEVE"),
	VENTINOVE(29,"NB","NUBI"),
	TRENTA(30," MS"," MASSAIA"),

	
	
	CENTO(00,"SASSO", "SASSO")
	
	
	;
/*
	*/
	private int number;
	private String phonetic;
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

