package net.alepuzio.mms.domain.enumeration;

public enum EnumNumber {
	UNKOWN("-1"),
	ZERO("00")
	, UNO("01") 
	, DUE("02")
	, TRE("03")
	, QUATTRO("04")
	, CINQUE("05")
	, SEI("06")
	, SETTE("07")
	, OTTO("08") 
	 , NOVE("09")
	 /*Error : The literal 08 of type int is out of range.
	 * Solution in different type like String , 
	 * read https://stackoverflow.com/questions/970039/09-is-not-recognized-where-as-9-is-recognized */	
	, DIECI("10")
	, UNDICI("11")
	, DODICI("12")
	, TREDICI("13")
	, QUATTORDICI("14")
	, QUINDI("15")
	, SEDICI("16")
	, DICIASETTE("17")
	, DICIOTTO("18")
	, DICIANNOVE("19")
	, VENTI("20")
	
	, VENTIUNO("21")
	, VENTIDUE("22")
	, VENTITRE("23")
	, VENTIQUATTRO("24")
	, VENTICINQUE("25")
	, VENTISEI("26")
	, VENTISETTE("27")
	, VENTIOTTO("28")
	, VENTINOVE("29")
	, TRENTA("30")
	
	, TRENTAUNO("31")
	, TRENTADUE("32")
	, TRENTATRE("33")
	, TRENTAQUATTRO("34")
	, TRENTACINQUE("35")
	, TRENTASEI("36")
	, TRENTASETTE("37")
	, TRENTOTTO("38")
	, TRENTANOVE("39")
	, QUARANTA("40")

	, QUARANTAUNO("41")
	, QUARANTADUE("42")
	, QUARANTATRE("43")
	, QUARANTAQUATTRO("44")
	, QUARANTACINQUE("45")
	, QUARANTASEI("46")
	, QUARANTASETTE("47")
	, QUARANTOTTO("48")
	, QUARANTANOVA("49")
	, CINQUANTA("50")

	, CINQUANTUNO("51")
	, CINQUANTADUE("52")
	, CINQUANTATRE("53")
	, CINQUANTAQUATTRO("54")
	, CINQUANTACINQUE("55")
	, CINQUANTASEI("56")
	, CINQUANTASETTE("57")
	, CINQUANTAOTTO("58")
	, CINQUANTANOVA("59")
	, SESSANTA("60")



	,	SESSANTUNO ("61")
	,	SESSANTADUE ("62")
	,	SESSANTATRE ("63")
	,	SESSANTAQUATTRO ("64")
	,	SESSANTACINQUE ("65")
	,	SESSANTASEI ("66")
	,	SESSANTASETTE ("67")
	,	SESSANTOTTO ("68")
	,	SESSANTANOVA ("69 - di Ciop")
	,	SETTANTA ("70")
	
	,	SETTANTUNO  ("71")
	,	SETTANTADUE  ("72")
	,	SETTANTATRE  ("73")
	,	SETTANTAQUATTRO  ("74")
	,	SETTANTACINQUE  ("75")
	,	SETTANTASEI  ("76")
	,	SETTANTASETTE  ("77")
	,	SETTANTOTTO  ("78")
	,	SETTANTANOVE  ("79") 
	,	OTTANTA ("80")
	,	OTTANTUNO ("81")
	,	OTTANTADUE ("82ÒN")
	,	OTTANTATRE ("83")
	,	OTTANTAQUATTRO ("84")
	,	OTTANTACINQUE ("85")
	,	OTTANTASEI ("86")
	,	OTTANTASETTE ("87")
	,	OTTANTOTTO ("88")
	,	OTTANTANOVE ("89")
	,	NOVANTA ("90")

	,	NOVANTUNO("91")   
	,	NOVANTADUE("92 ")
	,	NOVANTATRE("93")   
	,	NOVANTAQUATTRO("94")
	,	NOVANTACINQUE("95")
	,	NOVANTASEI("96 ")
	,	NOVANTASETTE("97")
	,	NOVANTOTTO("98") 
	,	NOVANTANOVE("99")
	
	;
	private String number;
	
	private EnumNumber(String newNumber){
		this.number = newNumber;
	}

public String number() {
		return this.number;
	}

public String unkown(String unkwonNumber) {
	String res = null;
	if(unkwonNumber.equals(this.number)){
		res = unkwonNumber;
	}
	return res;
}

}
