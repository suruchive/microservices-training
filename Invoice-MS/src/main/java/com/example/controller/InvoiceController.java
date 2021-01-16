package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Invoice;



@RestController
@CrossOrigin(origins = "*")
public class InvoiceController {	
	@Autowired
	private Invoice invoice;	
	

	@org.springframework.beans.factory.annotation.Value("${server.port}")
		private String strPortNumber;
	
	@GetMapping(path ="/api/v1/invoices")
	public Invoice getInvoice() {
	
				int portNumber = Integer.parseInt(strPortNumber);
		
		invoice.setId(portNumber);
		invoice.setItemName("LED TV");
		invoice.setAmount(5000+portNumber);
		
		return invoice;
	}
}				
