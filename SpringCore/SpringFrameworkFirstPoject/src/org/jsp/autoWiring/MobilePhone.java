package org.jsp.autoWiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MobilePhone 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/org/jsp/autoWiring/MobileConfig.xml");
		Mobile mobile = context.getBean("mobile1", Mobile.class);
		System.out.println(mobile);
		mobile.paymentStatus();
		System.out.println("************************************");
	}
}
