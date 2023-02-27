package com.learn.webapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class loginController {
	
	// http://localhost:8090/login?name=Ranga
	// Model
	@RequestMapping("login")
	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
		model.put("name", name); // put in model important!
		System.out.println("Request param is " + name); // NOT RECOMMENDED FOR PROD CODE
		return "login";
	}
}
