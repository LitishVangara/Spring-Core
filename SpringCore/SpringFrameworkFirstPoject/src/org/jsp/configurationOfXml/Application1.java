package org.jsp.configurationOfXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application1 
{
	public static void main(String[] args) 
	{
		//IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
		//To access object which is created by IOC container
		Employee employee = (Employee) context.getBean("emp1");
		employee.salaryStatus();
		System.out.println("************************************");
		
		//avoid down casting - by using class name
		//Employee employee1 = context.getBean(Employee.class);
		//employee1.salaryStatus();
		
		//avoid down casting - by using class name and id
		Employee employee2 = context.getBean("emp1", Employee.class);
		employee2.salaryStatus();
	}
}
