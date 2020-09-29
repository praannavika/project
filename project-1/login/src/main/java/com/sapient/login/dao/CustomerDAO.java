package com.sapient.login.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.sapient.login.beans.Customer;
import com.sapient.login.repo.CustomerRepository;

public class CustomerDAO {
	@Autowired
	CustomerRepository repo;
	public Customer findCustomer(String userName,String password)
	{
		return this.repo.find(userName, password);
	}
}
