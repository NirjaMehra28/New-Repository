package com.nj.pocHoneyCom.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="login_details")
public class Login_Details {

	@Id
	@Column(name = "User_Name")
	private String User_Name ;
	@Column(name = "Password")
	private String Password ;
	@Column(name = "User_Role")
	private String User_Role ;
	@Column(name = "Email_Id")
	private String Email_Id ;
	
	
	
	public Login_Details() {
		}
	
	
	public Login_Details(String user_Name, String password, String user_Role, String email_Id) {
		super();
		User_Name = user_Name;
		Password = password;
		User_Role = user_Role;
		Email_Id = email_Id;
	}


	public String getUser_Name() {
		return User_Name;
	}
	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getUser_Role() {
		return User_Role;
	}
	public void setUser_Role(String user_Role) {
		User_Role = user_Role;
	}
	public String getEmail_Id() {
		return Email_Id;
	}
	public void setEmail_Id(String email_Id) {
		Email_Id = email_Id;
	}
	
	
}
