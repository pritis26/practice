package com.priti.springproject.application_bank;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");
       
       BankAccount acc= context.getBean(BankAccount.class);
       acc.deposit();
    }
}
