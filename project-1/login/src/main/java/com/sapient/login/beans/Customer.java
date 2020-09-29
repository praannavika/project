package com.sapient.login.beans;


import java.util.Date;
import java.util.List;

import com.sapient.login.util.Gender;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Customer {
	
	private String username;
	private String password;
	private List<CreditCard> creditCard;
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private Gender gender;
	

}