package com.alkaf.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyAppSpring {
	public static void main(String[] args) {
		
		// load the spring configuration file
		ClassPathXmlApplicationContext applicationContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*
		// Retrieve bean from spring container
	
		Retailer walmart = applicationContext.getBean("walmartBean", Retailer.class);	
		
		//call methods on the bean
		System.out.println(walmart.geAddress());*/
		
		Retailer loblaws = applicationContext.getBean("loblawsBean", Retailer.class);
		
		System.out.println( (loblaws.giveDontationByCustomer(10)));
		//close the context
		

		applicationContext.close();
	}
}
