package com.sapient.login.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sapient.login.beans.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
public Customer find(String userName,String password);
	

}
