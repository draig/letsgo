package com.mycompany.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserManager userManager;
	
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return userManager.getUserDetailsByEmail(username) ;
	}

}