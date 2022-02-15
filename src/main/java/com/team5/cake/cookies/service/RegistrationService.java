package com.team5.cake.cookies.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.team5.cake.cookies.dao.RegistrationRepository;
import com.team5.cake.cookies.entity.User;

@Service
public class RegistrationService {
	 @Autowired 
 private  RegistrationRepository registationRespository;
 
	 public User saveUser(User registation) {
		 return  registationRespository.save(registation);
	 }

         public User  fetchUserByEmailId(String email) { 
		 return registationRespository.findByEmailId(email);
		 }
	
         public User  fetchUserByEmailIdAndPassword(String email, String password) { 
    		 return registationRespository.findByEmailIdAndPassword(email, password);
    		 }
    	
}
