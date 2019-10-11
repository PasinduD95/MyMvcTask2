package com.java.customer;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CustomerController {
	
	public ModelAndView home(){
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("message", "Hello from Spring Mvc");
		return mav;
	}
}
