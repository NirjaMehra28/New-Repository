package com.nj.pocHoneyCom.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.nj.pocHoneyCom.entity.Login_Details;

@Repository
public class Login_DetailsDaoImpl implements Login_DetailsDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	
    public boolean login(String username, String password) {
    	  Session session = sessionFactory.getCurrentSession();
    	  if (session != null) {
    	   try {
    		   Login_Details user = (Login_Details) session.get(Login_Details.class, username);
    		   if (password.equals(user.getPassword())) {
    			   System.out.println("User: " + user.toString());
    			   return true;
    		   }
    	   } catch (Exception exception) {
    	    System.out.println("Exception occured while reading user data: "
    	      + exception.getMessage());
    	    return false;
    	   }

    	  } else {
    	   System.out.println("DB server down.....");
    	  }
    	  return false;
    	 }
    
  
    public String register(Login_Details user) {
    	 String msg=null;
    	Session session = sessionFactory.getCurrentSession();
    	  if (session != null) {
    	   try {
    	    if (user != null) {
    	     String username = (String) session.save(user);
    	     session.beginTransaction().commit();
    	      msg = "User " + username
    	       + " created successfully, please login...";
    	    }
    	   } catch (Exception exception) {
    	    System.out.println("Exception occred while creating user data: "
    	      + exception.getMessage());
    	   }

    	  } else {
    	   System.out.println("DB server down.....");
    	  }
    	  System.out.println("msg:" + msg);
    	  return msg;
    	 }
    
   
   
	
    
}
