package com.nj.pocHoneyCom.validation;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.nj.pocHoneyCom.entity.Customer;

public class CustomerValidation implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		// TODO Auto-generated method stub
		return Customer.class.equals(arg0);
	}

	@Override
	public void validate(Object arg0, Errors arg1) {
		// TODO Auto-generated method stub

	}

}
