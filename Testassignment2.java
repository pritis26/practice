package com.priti.springproject.application_bank;



import org.priti.springframework.Question;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testassignment2 {
 public static void main(String[] args) {
	ApplicationContext queans=new ClassPathXmlApplicationContext("spring.xml");
	Question question1=queans.getBean(Question.class);
	System.out.println(question1);
	
}
}
