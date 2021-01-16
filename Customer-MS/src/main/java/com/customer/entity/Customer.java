package com.customer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class Customer {

	
	long customerId;
	String customeName;
	long mobileNumber;
	//String address;
}
