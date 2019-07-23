package com.complaintresolver.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;



//@SpringBootApplication(exclude=HibernateJpaAutoConfiguration.class)
@SpringBootApplication(scanBasePackages =
{ "com.complaintResolver" })
public class ComplaintResolverProjectApplication {
	public static void main(String[] args) {
		
		SpringApplication.run(ComplaintResolverProjectApplication.class, args);
	}

}
