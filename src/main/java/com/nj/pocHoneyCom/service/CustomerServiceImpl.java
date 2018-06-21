package com.nj.pocHoneyCom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nj.pocHoneyCom.dao.CustomerDao;
import com.nj.pocHoneyCom.entity.Customer;

@Service 
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	private CustomerDao customerDao;
	
	
	@Transactional
	public void saveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		customerDao.saveCustomer(customer);
	}


	@Transactional
	public Customer loginCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerDao.loginCustomer(customer);
	}

}
