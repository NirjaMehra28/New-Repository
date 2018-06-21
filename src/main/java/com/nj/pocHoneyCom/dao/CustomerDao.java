package com.nj.pocHoneyCom.dao;

import com.nj.pocHoneyCom.entity.Customer;

public interface CustomerDao {

	public void saveCustomer( Customer customer);
	
	public Customer loginCustomer(Customer customer);
}
