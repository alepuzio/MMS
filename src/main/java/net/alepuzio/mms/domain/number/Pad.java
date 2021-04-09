package net.alepuzio.mms.domain.number;


public class Pad   implements Number{

	private Number origin;
	
	Pad(Number newValue){
		this.origin = newValue;
	}
	@Override
	public String value() {
		String res = null;
		if (1 == this.origin.value().length() %2  ){
			res = String.format("0%s", this.origin.value());
		} else {
			res = this.origin.value();
		}
		return res;

	}


}
