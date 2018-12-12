package com.priti.springproject.application_bank;



import org.priti.springframework.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testassignment1 {
public static void main(String[] args) {
 ApplicationContext content=new ClassPathXmlApplicationContext("spring.xml");
 Customer customer1=content.getBean(Customer.class);
 System.out.println(customer1);
}
}