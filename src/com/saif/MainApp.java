package com.saif;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String [] ans)
	{
		ApplicationContext context  = new ClassPathXmlApplicationContext("Beans.xml");
		Operation op = (Operation)context.getBean("op");
		
		op.msg(); System.out.println(op.k()); System.out.println(op.m());
	}
}
