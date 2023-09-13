package com.jsp.usageOfAnnotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Showroom 
{
	@Value("101")
	private int id;
	@Value("Apple")
	private String name;
	public Showroom()
	{
		System.out.println("Default Constructor of Showroom.");
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
}