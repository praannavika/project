package com.sapient.login.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.sapient.login.beans.Customer;
import com.sapient.login.dao.CustomerDAO;

public class CustomerLoginService {
	@Autowired
	CustomerDAO dao;

	public Customer getUserById(String userName, String password) {
		return this.dao.findCustomer(userName, password);
	}

	public String firstLogin(String userName, String password) {
		Customer findCustomer = this.getUserById(userName, password);

		if (findCustomer != null) {
			return "Congratulations for registration";
		}

		return "Invalid Credentials";

	}
}
