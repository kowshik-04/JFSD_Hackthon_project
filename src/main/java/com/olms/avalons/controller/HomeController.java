package com.olms.avalons.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@GetMapping("/")
	public ModelAndView home(Model model) {

		return new ModelAndView("login");
	}
	
	@GetMapping("/login")
    public String showLoginPage() {
        return "index";  
    }
}
