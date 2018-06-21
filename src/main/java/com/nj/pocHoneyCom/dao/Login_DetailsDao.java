package com.nj.pocHoneyCom.dao;

import com.nj.pocHoneyCom.entity.Login_Details;

public interface Login_DetailsDao {

	public boolean login(String username, String password) ;
	 public String register(Login_Details user);
	 
		

}
