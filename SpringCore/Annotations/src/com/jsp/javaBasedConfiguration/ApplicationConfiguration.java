package com.jsp.javaBasedConfiguration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

//Specify Configuration of Object by Using Class - to provide object for Spring Framework
@Configurable
//to enable AutoScanning
@ComponentScan(basePackages = "com.jsp")
public class ApplicationConfiguration 
{
	/*//Method which will give respective class object for spring framework.
	@Bean("sample")
	public Sample sample()
	{
		Sample sample = new Sample();
		//To inject Dependency explicitly
		//sample.setTest(test());
		return sample;
	}
	@Bean
	public Test test()
	{
		Test test = new Test();
		return test;
	}*/
}
