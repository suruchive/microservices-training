package com.customer.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.customer.entity.Customer;

@SpringBootApplication
@EnableDiscoveryClient
public class CustomerMsApplication {

		
	public static void main(String[] args) {
		SpringApplication.run(CustomerMsApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
	
	@Bean
	public Customer ramesh() {
		
		return new Customer(110,"Ramesh Patil",4505050);
	}
}
