package net.alepuzio.mms.controller;

import org.springframework.web.servlet.ModelAndView;

public interface Decorator {
	public void execute();
}

class Empty implements  Decorator {
	private String number;
	private ModelAndView mav;
	private Decorator decorator;
	
	Empty (String number, ModelAndView mav, Decorator decorator){
		this.number = number;
		this.mav = mav;
		this.decorator = decorator;
	}
	
	@Override
	public void execute(){
		 if (number.isEmpty()) {
				mav.addObject("errorMessage", "Empty value!");
		} else{
			this.decorator.execute();
		}
	}
}
class Null implements  Decorator {
	private String number;
	private ModelAndView mav;
	private Decorator decorator;
	
	Null(String number, ModelAndView mav, Decorator decorator){
		this.number = number;
		this.mav = mav;
		this.decorator = decorator;
	}
	
	@Override
	public void execute(){
		if ((null == number)) {
			mav.addObject("errorMessage", "No value!");
		} else{
			this.decorator.execute();
		}
	}
}

//class OddLength implements Decorator {
//
//	private String number;
//	private ModelAndView mav;
//	private Decorator decorator;
//
//	OddLength (String number, ModelAndView mav, Decorator decorator){
//		this.number = number;
//		this.mav = mav;
//		this.decorator = decorator;
//	}
//
//	@Override
//	public void execute(){
//		if (1 == (number.length() % 2)) {
//			number = "0" + number;
//		}
//	}
//	
//}