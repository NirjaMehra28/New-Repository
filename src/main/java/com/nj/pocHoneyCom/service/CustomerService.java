package com.nj.pocHoneyCom.service;

import com.nj.pocHoneyCom.entity.Customer;

public interface CustomerService {

	public void saveCustomer( Customer customer);
	
	public Customer loginCustomer(Customer customer);
}
