package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestUser {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		Test t1=context.getBean("test1",Test.class);
		Test t2=context.getBean("test1",Test.class);
		Test t3=context.getBean("test1",Test.class);
		
		
		System.out.println(t1==t2);
		System.out.println(t1==t3);
		
	}

}
