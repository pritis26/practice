package com.priti.springproject.application_bank;

import org.priti.springframework.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testassignment1 {
public static void main(String[] args) {
	ApplicationContext customerdetails=new ClassPathXmlApplicationContext("assignment1.xml");
	Customer c1=customerdetails.getBean(Customer.class);
	System.out.println(c1);
}
}
