package net.alepuzio.mms.domain;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

public class NumberToDecodify implements ToDecodify {
		
	private String number;
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	public NumberToDecodify(String newNumber){
		this.number = newNumber;
	}
	
	private String image(int coupleDigit) {
		logger.debug(String.format("image(%d)", coupleDigit));
		String result = null;
		for(EnumImage tmp : EnumImage.values()){
			if (tmp.number() == coupleDigit){
				result = tmp.image();
			}
		}
		if ( null == result) {
			result = String.format("Undefined number[%s]", coupleDigit);
		}
		return result;
	}
	
	@Override
	public List<String> listImage(){
		logger.info(">listImage()");
		List<String> result = new ArrayList<String>();
		
		for (int i = 0; i < number.length(); i = i+2){
			logger.debug(String.format("coppia(%s)", number.substring(i, i+2)));
			result.add(image(Integer.parseInt(number.substring(i, i+2))));
		}
		logger.info("<listImage()");
		return result;
	}

	
	@Override
	public String value() {
		return this.number;
	}
}
