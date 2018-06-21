package com.nj.pocHoneyCom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nj.pocHoneyCom.dao.Login_DetailsDao;
import com.nj.pocHoneyCom.entity.Customer;
import com.nj.pocHoneyCom.entity.Login_Details;

@Service

public class Login_DetailsServiceImpl implements Login_DetailsService{

	@Autowired
	Login_DetailsDao loginDao;
	
	
	  @Transactional
	 public boolean login(String username, String password) {
	  return loginDao.login(username, password);
	 }

	  @Transactional
	 public String registration(Login_Details user) {
	  return loginDao.register(user);
	 }
	 
	 
}
