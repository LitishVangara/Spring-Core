package com.jsp.javaBasedConfiguration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test 
{
	@Value("Litish")
	private String name;
	@Override
	public String toString() 
	{
		return "Test [name=" + name + "]";
	}
}
