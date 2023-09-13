package com.jsp.usageOfAnnotation;

import org.springframework.stereotype.Component;

@Component
public class Digital implements WatchType
{
	public void printDetails()
	{
		System.out.println("This Watch type is Digital.");
	}
	public Digital()
	{
		System.out.println("Default Constructor of Digital.");
	}
}
