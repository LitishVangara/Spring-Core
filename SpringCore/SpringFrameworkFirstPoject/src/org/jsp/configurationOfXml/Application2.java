package org.jsp.configurationOfXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application2 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
		Employee employee = context.getBean("emp1", Employee.class);
		
		System.out.println("\nObject Address of employee : "+employee);
		System.out.println("****************************************************************");
		
		Employee employee1 = context.getBean("emp1", Employee.class);
		
		System.out.println("\nObject Address of employee1 : "+employee1);
		System.out.println("****************************************************************");
		
		Employee employee2 = context.getBean("emp1", Employee.class);
		
		System.out.println("\nObject Address of employee2 : "+employee2);
		System.out.println("****************************************************************");
	}
}
