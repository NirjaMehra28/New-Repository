package com.nj.pocHoneyCom.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.nj.pocHoneyCom.dao.Login_DetailsDao;
import com.nj.pocHoneyCom.entity.Customer;
import com.nj.pocHoneyCom.entity.Login_Details;
import com.nj.pocHoneyCom.service.Login_DetailsService;
import com.nj.pocHoneyCom.service.Login_DetailsServiceImpl;

@Controller
public class UserLoginController {

	@Autowired
	Login_DetailsService loginService;
	
	Login_Details login_details;
	
	
		
	@RequestMapping(value="/loginPage",params="openCustomer",method= RequestMethod.POST)
	public String login(@ModelAttribute("login_details") Login_Details login_details, BindingResult result, SessionStatus status)
	{
		boolean error = false;
		boolean flag = false;
		
		
		String userName= login_details.getUser_Name();
		String password= login_details.getPassword();
		
		System.out.println(userName + " :: " + password);
		
         /** Validation Code starts here */
		
		
		if(login_details.getUser_Name().isEmpty()){
	        result.rejectValue("user_Name", "error.userName");
	        error = true;
	    }
		if(login_details.getPassword().isEmpty()){
	        result.rejectValue("Password", "error.Password");
	        error = true;
	    }
		
		if(error) {
	        return "welcome";
	    }else
	    {
	    	 flag = loginService.login(userName, password);
	    }
		if(flag) 
		{
		    System.out.println("Login success!!!");
		}	
		  return "customerMainScreen";
		  
		 /** Validation Code ends here */
		
		  
				
			
	}
		
	
/*
@RequestMapping(method = RequestMethod.POST)
public String processForm(@Valid LoginForm loginForm, BindingResult result,
		Map model) {

	
	if (result.hasErrors()) {
		return "loginform";
	}
	
	
	String userName = "UserName";
	String password = "password";
	loginForm = (LoginForm) model.get("loginForm");
	if (!loginForm.getUserName().equals(userName)
			|| !loginForm.getPassword().equals(password)) {
		return "loginform";
	}
	
	boolean userExists = loginService.checkLogin(loginForm.getUserName(),
            loginForm.getPassword());
	if(userExists){
		model.put("loginForm", loginForm);
		return "loginsuccess";
	}else{
		result.rejectValue("userName","invaliduser");
		return "loginform";
	}

}*/
	
	
	@RequestMapping(value="/loginPage",params="openRegister")
	public String openRegister(@ModelAttribute("login_details") Login_Details login_details) {
		System.out.println("Register Page Requested");
		
		
		return "registerUser";
	}
	
	

	@RequestMapping(value = "/registerNewUser", method = RequestMethod.POST)
	public String registerNewUser(@ModelAttribute("login_details") Login_Details login_details) {
		
		System.out.println(login_details.getUser_Name()+" "+login_details.getPassword()+" "+login_details.getUser_Role()+" "+login_details.getEmail_Id());
		
		String msg = loginService.registration(login_details);
		
		System.out.println("user Registered"+ msg);
		
		return "welcome";
	}
	
	
}


