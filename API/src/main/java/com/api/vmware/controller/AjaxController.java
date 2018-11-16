package com.api.vmware.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("ajax/*")
public class AjaxController {

	
	@RequestMapping("ajax/ajaxTest.do")
	public ModelAndView ajaxTest( ) {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
}
