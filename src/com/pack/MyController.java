package com.pack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com.model.Calculation;

@org.springframework.stereotype.Controller
public class MyController {
@RequestMapping("/hey")
	public ModelAndView calculate(@ModelAttribute Calculation c) throws Exception {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("index");
		
		
		
		
       mv.addObject("addition",c.getAdd());

		
		return mv;
		
	}

}
