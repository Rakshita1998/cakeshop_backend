package com.team5.cake.cookies.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.team5.cake.cookies.entity.User;
import com.team5.cake.cookies.service.RegistrationService;

@RestController
public class RegistrationController {
	
	@Autowired 
	private RegistrationService service;
	
	
	@PostMapping("/registration")
	@CrossOrigin(origins = "http://localhost:4200")
	public User registation(@RequestBody User registation) {
		
		String temp=registation.getEmailId();
			if(temp!=null && "".equals(temp)) {}
		User userObj =null;
		userObj =service.saveUser(registation);
		 return userObj;
	}
	@PostMapping("/login")
	@CrossOrigin(origins = "http://localhost:4200")
	public User loginUser(@RequestBody User user) throws Exception{
		
		String tempEmailId = user.getEmailId();
		String tempPass = user.getPassword();
		User userObj = null;
		if(tempEmailId !=null && tempPass != null) {
			userObj = service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
		}
		if(userObj ==null) {
			throw new Exception("User does not exist");
		}
		return userObj;
	}

}
