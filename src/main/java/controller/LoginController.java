package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {
	
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public ModelAndView getWelcomePage(){
		return new ModelAndView("welcome");
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView getLoginPage(){
		return new ModelAndView("login");
	}
}
