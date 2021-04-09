package net.alepuzio.mms.domain.number;

public class Trim implements Number {
	private Number origin;
	
	Trim(Number newValue){
		this.origin = newValue;
	}

	@Override
	public String value() {
		return this.origin.value().trim();
	}

}
