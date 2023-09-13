package com.jsp.usageOfAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Analog implements WatchType
{
	public void printDetails()
	{
		System.out.println("This Watch type is Analog.");
	}
	public Analog()
	{
		System.out.println("Default Constructor of Analog.");
	}
}
