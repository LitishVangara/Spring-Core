package org.jsp.configurationOfXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application3 
{
	public static void main(String[] args) 
	{
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Configuration.xml");
		Employee employee = applicationContext.getBean("emp2", Employee.class);
		System.out.println(employee);
		System.out.println("*************************************************************************");
		
		Employee employee1 = applicationContext.getBean("emp3", Employee.class);
		System.out.println(employee1);
		System.out.println("*************************************************************************");
		
		Employee employee2 = applicationContext.getBean("emp4", Employee.class);
		System.out.println(employee2);
		employee2.salaryStatus();
		System.out.println("*************************************************************************");
		
		Employee employee3 = applicationContext.getBean("emp5", Employee.class);
		System.out.println(employee3);
		employee3.salaryStatus();
		System.out.println("*************************************************************************");
		
		Employee employee4 = applicationContext.getBean("emp6", Employee.class);
		System.out.println(employee4);
		employee4.salaryStatus();
		employee4.getBalance();
		System.out.println("*************************************************************************");
	}
}
