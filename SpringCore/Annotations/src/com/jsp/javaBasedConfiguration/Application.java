package com.jsp.javaBasedConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
		Sample sample = context.getBean("sample", Sample.class);
		sample.run();
		System.out.println(sample);
		System.out.println(sample.getTest());
	}
}
