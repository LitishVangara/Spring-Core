package org.jsp.setterInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterInjection 
{
	public static void main(String[] args) 
	{
		System.out.println("**************************************************************************");
		ApplicationContext context = new ClassPathXmlApplicationContext("/org/jsp/setterInjection/Config.xml");
		Book book = context.getBean("book1", Book.class);
		System.out.println(book);
		System.out.println("**************************************************************************");
		
		Book book1 = context.getBean("book2", Book.class);
		System.out.println(book1);
		book1.getAuthorInfo();
		System.out.println("**************************************************************************");
	}
}
