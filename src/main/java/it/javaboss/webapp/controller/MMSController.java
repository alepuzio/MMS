package it.javaboss.webapp.controller;

import java.util.List;

import org.slf4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import it.javaboss.webapp.mms.NumberToDecodify;

@Controller
public class MMSController {
	
	private Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());

	@RequestMapping(value = "/string", method = RequestMethod.GET)
	public ModelAndView decodifica(@RequestParam String number) {
		ModelAndView mav = new ModelAndView();
		logger.info(String.format(">decodifica(%s)",number));
		if ((null == number)) {
			mav.addObject("errorMessage", "No value!");
		} else {
			number = number.trim();
			if (number.isEmpty()) {
				mav.addObject("errorMessage", "Empty value!");
			} else {
				if (1 == (number.length() % 2)) {
					number = "0" + number;
				}
				List<String> images = new NumberToDecodify(number).listImage();
				logger.info(String.format("<decodifica(%s):%s",number, images));
				mav.addObject("words", images);
			}
		}
		mav.setViewName("string");
		return mav;	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView home() {
		logger.info("In the application...forward to index.html");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index");
		return mav;
	}

}
