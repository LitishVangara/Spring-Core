package org.jsp.configurationOfXml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application 
{
	public static void main(String[] args) 
	{
		//IOC container
		ApplicationContext context = new ClassPathXmlApplicationContext("Configuration.xml");
		//To access object which is created by IOC container
		Employee employee = (Employee) context.getBean("emp1");
		employee.salaryStatus();
	}
}
