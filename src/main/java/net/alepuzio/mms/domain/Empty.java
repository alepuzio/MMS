package net.alepuzio.mms.domain;

import java.util.List;

import net.alepuzio.mms.domain.enumeration.EnumImage;

public class Empty implements ToDecodify {

	private ToDecodify origin;
	
	public Empty(ToDecodify newOrigin){
		this.origin = newOrigin;
	}
	
	@Override
	public List<EnumImage> listImage() {
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
