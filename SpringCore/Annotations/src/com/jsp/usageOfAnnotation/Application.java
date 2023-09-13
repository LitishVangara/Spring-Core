package com.jsp.usageOfAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("Configure.xml");
		Watch watch = context.getBean("w1", Watch.class);
		System.out.println(watch);
		watch.displayTime();
		watch.showRoomDetails();
		watch.showWatchDetails();
		System.out.println("**********************************");
		Watch watch1 = context.getBean("w1", Watch.class);
		System.out.println(watch1);
		watch1.displayTime();
		watch1.showRoomDetails();
		watch1.showWatchDetails();
		System.out.println("**********************************");
	}
}
