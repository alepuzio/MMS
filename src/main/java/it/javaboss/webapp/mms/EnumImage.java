package it.javaboss.webapp.mms;

public enum EnumImage {

	UNDICI(11,"DD","DADI"),
	VENTIQUATTRO(24,"NR","NERO"),
	CENTO(00,"SASSO", "SASSO")
	
	
	;
/*
	12,DN,DNA

	13,DM,DAMA

	14,TR,TORRE

	15,DL,DUELLO

	16,DC,DUCE

	17,DGH,DIGA

	18,TF,TUFFO

	19,TP,TAPPI

	20,NS,NASO


	21,ND,NUDO

	22,NN,NONNA

	23,NM,ANIMA

	

	25,NL,ANELLO

	26,NC,NOCI

	27,GNCH,GNOCCHI
	28, NV, NEVE

	29,NB,NUBI

	30, MS, MASSAIA
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
