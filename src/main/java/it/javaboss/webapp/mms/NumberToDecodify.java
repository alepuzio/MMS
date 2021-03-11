package it.javaboss.webapp.mms;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class NumberToDecodify implements ToDecodify {
		
	private String number;
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	public NumberToDecodify(String newNumber){
		this.number = newNumber;
	}
	
	private String image(String coupleDigit) {
		logger.debug(String.format("image(%s)", coupleDigit));
		String result = null;
		if ("00".equals(coupleDigit)) {
			result = "sasso";
		} else if ("24".equals(coupleDigit)) {
			result = "Nero (Wolfe)";
		}else {
			result = String.format("Undefined number[%s]", coupleDigit);
		}
		return result;
	}
	
	@Override
	public List<String> listImage(){
		System.out.println(String.format("images(%s)", this.number));
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < number.length(); i = i+2){
			logger.debug(String.format("coppia(%s)", number.substring(i, i+2)));
			result.add(image(number.substring(i, i+2)));
		}
		return result;
	}

	
	@Override
	public String value() {
		return this.number;
	}
}
