package com.nj.pocHoneyCom.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name = "Cust_Id", length = 11 )
	private Long Cust_Id;
	
	@Column(name = "Cust_First_Name", length = 50, nullable = false)
	private String Cust_First_Name;
	
	@Column(name = "Cust_Last_Name", length = 50)
	private String Cust_Last_Name;
	
	
	@Column(name = "Cust_City", length = 50, nullable = false)
	private String Cust_City;
	
	@Column(name = "Cust_Country", length = 50, nullable = false)
	private String Cust_Country;
	
	@Column(name = "Cust_Address", length =100, nullable = false)
	private String Cust_Address;
	
	@Column(name = "Cust_Email",  unique=true)
	@Email(message = "{user.email.invalid}")
	@NotEmpty(message="Please Enter your email")
	private String Cust_Email;
	
	@Column(name = "Cust_Phone_No", length = 15)
	private String Cust_Phone_No;
	
	@Column(name = "Cust_Mobile_No", length = 10, nullable=false)
	private String Cust_Mobile_No;
	
	@Column(name = "Contract_Type")
	private String Contract_Type;
	
	@Column(name = "Contract_Start_Date")
	private Date Contract_Start_Date;
	
	@Column(name = "Contract_End_Date")
	private Date Contract_End_Date;
	
	@Column(name = "Created_By")
	private String Created_By;

	public Long getCust_Id() {
		return Cust_Id;
	}

	public void setCust_Id(Long cust_Id) {
		Cust_Id = cust_Id;
	}

	public String getCust_First_Name() {
		return Cust_First_Name;
	}

	public void setCust_First_Name(String cust_First_Name) {
		Cust_First_Name = cust_First_Name;
	}

	public String getCust_Last_Name() {
		return Cust_Last_Name;
	}

	public void setCust_Last_Name(String cust_Last_Name) {
		Cust_Last_Name = cust_Last_Name;
	}

	public String getCust_City() {
		return Cust_City;
	}

	public void setCust_City(String cust_City) {
		Cust_City = cust_City;
	}

	public String getCust_Country() {
		return Cust_Country;
	}

	public void setCust_Country(String cust_Country) {
		Cust_Country = cust_Country;
	}

	public String getCust_Address() {
		return Cust_Address;
	}

	public void setCust_Address(String cust_Address) {
		Cust_Address = cust_Address;
	}

	public String getCust_Email() {
		return Cust_Email;
	}

	public void setCust_Email(String cust_Email) {
		Cust_Email = cust_Email;
	}

	public String getCust_Phone_No() {
		return Cust_Phone_No;
	}

	public void setCust_Phone_No(String cust_Phone_No) {
		Cust_Phone_No = cust_Phone_No;
	}

	public String getCust_Mobile_No() {
		return Cust_Mobile_No;
	}

	public void setCust_Mobile_No(String cust_Mobile_No) {
		Cust_Mobile_No = cust_Mobile_No;
	}

	public String getContract_Type() {
		return Contract_Type;
	}

	public void setContract_Type(String contract_Type) {
		Contract_Type = contract_Type;
	}

	public Date getContract_Start_Date() {
		return Contract_Start_Date;
	}

	public void setContract_Start_Date(Date contract_Start_Date) {
		Contract_Start_Date = contract_Start_Date;
	}

	public Date getContract_End_Date() {
		return Contract_End_Date;
	}

	public void setContract_End_Date(Date contract_End_Date) {
		Contract_End_Date = contract_End_Date;
	}

	public String getCreated_By() {
		return Created_By;
	}

	public void setCreated_By(String created_By) {
		Created_By = created_By;
	}

	@Override
	public String toString() {
		return "Customer [Cust_Id=" + Cust_Id + ", Cust_First_Name=" + Cust_First_Name + ", Cust_Last_Name="
				+ Cust_Last_Name + ", Cust_City=" + Cust_City + ", Cust_Country=" + Cust_Country + ", Cust_Address="
				+ Cust_Address + ", Cust_Email=" + Cust_Email + ", Cust_Phone_No=" + Cust_Phone_No + ", Cust_Mobile_No="
				+ Cust_Mobile_No + ", Contract_Type=" + Contract_Type + ", Contract_Start_Date=" + Contract_Start_Date
				+ ", Contract_End_Date=" + Contract_End_Date + ", Created_By=" + Created_By + "]";
	}

	public Customer() {
	}
	
	
	
}


