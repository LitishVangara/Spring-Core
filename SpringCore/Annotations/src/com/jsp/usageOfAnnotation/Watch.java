package com.jsp.usageOfAnnotation;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("w1")
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Watch 
{
	//@Value("Apple")
	private String brand;
	//@Value("30000")
	private double price;
	//@Autowired
	private Showroom showroom;
	@Autowired
	@Qualifier("analog")
	private WatchType watchType;
	@Autowired
	@Qualifier("digital")
	private WatchType typeWatch;
//	public Watch() 
//	{
//		super();
//		System.out.println("Default Constructor of Watch Class\nObject Created\n");
//	}
	public void showWatchDetails()
	{
		watchType.printDetails();
		typeWatch.printDetails();
	}
	public void showRoomDetails()
	{
		System.out.println("Showroom id is : "+showroom.getId());
		System.out.println("Showroom Nmae is : "+showroom.getName());
	}
	public Watch(@Value("Apple") String brand, @Value("30000") double price) 
	{
		super();
		this.brand = brand;
		this.price = price;
		System.out.println("Constructor with two arguments of Watch Class");
	}
	@Override
	public String toString() 
	{
		return "Watch [brand=" + brand + ", price=" + price + "]";
	}
	public void displayTime()
	{
		Date date = new Date();
		SimpleDateFormat sm = new SimpleDateFormat("hh:mm:ss");
		System.out.println("Time : "+sm.format(date));
	}
	public Showroom getShowroom() 
	{
		return showroom;
	}
	@Autowired
	public void setShowroom(Showroom showroom) 
	{
		this.showroom = showroom;
	}
	
}
