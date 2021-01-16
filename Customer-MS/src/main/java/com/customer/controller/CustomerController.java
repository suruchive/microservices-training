package com.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.customer.entity.Customer;

@RestController
@CrossOrigin(origins = "*")
//@RequestMapping(path="/customers/v1/")
public class CustomerController
{

	@Autowired
	private Customer customer;
	
	@GetMapping(path="{/customerId}")
	@ResponseBody
	private Customer getcustomer(@PathVariable("customerId") Long customerId)
	{
		
		return this.customer;
	}
	@GetMapping(path = "/api/v1/customers")
	public Customer getCustomer() {
		
		
		return this.customer;
	}
}
