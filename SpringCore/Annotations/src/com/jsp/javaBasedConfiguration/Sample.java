package com.jsp.javaBasedConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("sample")
public class Sample 
{
	@Value("10")
	private int id;
	//dependency
	private Test test;
	public void run()
	{
		System.out.println("This is run Method...");
	}
	@Override
	public String toString() 
	{
		return "Sample [id=" + id + "]";
	}
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public Test getTest() 
	{
		return test;
	}
	@Autowired
	public void setTest(Test test) 
	{
		this.test = test;
	}
}
