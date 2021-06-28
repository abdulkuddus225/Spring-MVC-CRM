package com.CRM.springbootcrud.CRM;

import com.CRM.springbootcrud.CRM.controller.CustomerController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.CRM.springbootcrud.CRM"})
public class CrmApplication {

	public static void main(String[] args) {
		SpringApplication.run(CrmApplication.class, args);
		CustomerController cust = new CustomerController();
		cust.test();
	}

}
