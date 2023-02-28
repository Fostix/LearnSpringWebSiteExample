package com.learn.webapp.login;

//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
//import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name") // For all controller can use this attribute!!
public class LoginController {
	
	private AuthenticationService authenticationService;
	
	
	
//	private Logger logger = LoggerFactory.getLogger(getClass());
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}

	// http://localhost:8090/login?name=Ranga
	// Model
	// @RequestMapping("login")
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String gotoLoginPage() { // (@RequestParam String name, ModelMap model)
		
//		model.put("name", name); // put in model important!
//		logger.debug("Request param is {}", name);
//		logger.info("I want this printed at info level");
//		logger.warn("I want this printed at warn level");
//		
//		System.out.println("Request param is " + name); // NOT RECOMMENDED FOR PROD CODE
		
		return "login";
	}
	
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String gotoWelcomePage(@RequestParam String name,
			@RequestParam String password, ModelMap model) {
		
		if(authenticationService.authentication(name, password)) {
		
			model.put("name", name);
			
			return "welcome"; // return name method
		}
		model.put("errorMessage", "Invalid Credentials! Please try again.");
		return "login";
	}
}
