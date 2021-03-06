package com.team5.cake.cookies.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.team5.cake.cookies.entity.User;

public interface RegistrationRepository extends JpaRepository<User,Integer > {

	
	
	public User findByEmailId(String email);
	public User findByEmailIdAndPassword(String email, String password);


}
