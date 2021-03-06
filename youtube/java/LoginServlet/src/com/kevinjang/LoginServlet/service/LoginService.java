package com.kevinjang.LoginServlet.service;

import java.util.HashMap;

import org.kevinjang.LoginServlet.dto.User;

public class LoginService {
	
	HashMap<String, String> users = new HashMap<String, String>();
	
	public LoginService() {
		users.put("kevin", "Kevin Jang");
		users.put("jsmith", "John Smith");
	}
	
	public boolean authenticate(String username, String password) {
		return (password != null && !password.equals("") && users.get(username) != null);
	}
	
	public User getUserInfo(String username) {
		User user = new User();
		
		user.setUsername(username);
		user.setFullName(users.get(username));
		
		return user;
	}
	
}
