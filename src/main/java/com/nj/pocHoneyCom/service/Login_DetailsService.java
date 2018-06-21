package com.nj.pocHoneyCom.service;


import com.nj.pocHoneyCom.entity.Login_Details;

public interface Login_DetailsService {
	
	 public boolean login(String username, String password);
		 
		 public String registration(Login_Details user) ;
			 
		 

}
