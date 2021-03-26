package net.alepuzio.mms.domain;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import net.alepuzio.mms.domain.enumeration.EnumImage;

public class NumberToDecodify implements ToDecodify {
		
	private String number;
	
	private Logger logger = Logger.getLogger(this.getClass());
	
	public NumberToDecodify(String newNumber){
		this.number = newNumber;
	}
	
	private EnumImage image(String coupleDigit) {
		logger.debug(String.format("image(%s)", coupleDigit));
		EnumImage result = null;//TODO using lambda expression
		for(EnumImage tmp : EnumImage.values()){
			if (tmp.number().number().equals (coupleDigit)){
				result = tmp;
			}
		}
		if ( null == result) {//TODO using decorator
			result = EnumImage.UNKOWN;
		}
		return result;
	}
	
	@Override
	public List<EnumImage> listImage(){
		logger.info(">listImage()");
		List<EnumImage> result = new ArrayList<EnumImage>();
		for (int i = 0; i < number.length(); i = i+2){
			logger.debug(String.format("coppia(%s)", number.substring(i, i+2)));
			result.add(image(number.substring(i, i+2)));
		}
		logger.info("<listImage()");
		return result;
	}

	
	public String pad(){
		String res = null;
		if (1 == this.number.length() %2  ){
			res = String.format("0%s", this.number);
		} else {
			res = this.number;
		}
		return res;
	}
	@Override
	public String value() {
		return this.number;
	}
}
