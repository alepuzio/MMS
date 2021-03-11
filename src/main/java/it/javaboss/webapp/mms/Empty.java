package it.javaboss.webapp.mms;

import java.util.List;

public class Empty implements ToDecodify {

	private ToDecodify origin;
	
	public Empty(ToDecodify newOrigin){
		this.origin = newOrigin;
	}
	
	@Override
	public List<String> listImage() {
		if ( !valid()){
			throw new RuntimeException("Empty number");
		}
		return origin.listImage();
	}

	//@Override
	public boolean valid() {
		return  (null == this.origin.value()) || this.origin.value().isEmpty();
	}

	@Override
	public String value() {
		return this.origin.value();
	}


}
