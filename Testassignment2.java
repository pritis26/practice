package com.priti.springproject.application_bank;

import org.priti.springframework.Customer;
import org.priti.springframework.Question;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testassignment2 {

	public static void main(String[] args) {
		ApplicationContext questionanswers=new ClassPathXmlApplicationContext("assignment2.xml");
	Question c1=questionanswers.getBean(Question.class);
		System.out.println(c1);

	}

}
