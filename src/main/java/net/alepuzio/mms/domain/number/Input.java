package net.alepuzio.mms.domain.number;

public class Input implements Number {
	private String value;
	
	Input(String newValue){
		this.value = newValue;
	}

	@Override
	public String value() {
		// TODO Auto-generated method stub
		return value;
	}

}
