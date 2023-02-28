package com.learn.webapp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
	
	public boolean authentication(String username, String password) {
		
		boolean isValidUserName = username.equalsIgnoreCase("user");
		boolean isValidPassword = password.equalsIgnoreCase("pass");
		
		return isValidUserName && isValidPassword;
	}
}
