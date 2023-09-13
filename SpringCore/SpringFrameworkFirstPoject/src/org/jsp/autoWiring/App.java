package org.jsp.autoWiring;

import org.jsp.setterInjection.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("/org/jsp/autoWiring/AutoWiringConfig.xml");
		Book b1 = context.getBean("book1", Book.class);
		System.out.println(b1);
		b1.getAuthorInfo();
	}
}
