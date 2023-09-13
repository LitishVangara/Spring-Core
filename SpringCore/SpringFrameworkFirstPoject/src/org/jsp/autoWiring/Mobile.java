package org.jsp.autoWiring;

public class Mobile
{
	private String color;
	private String brand;
	private double price;
	private Payment payment;
	private Payment pay;
	private Payment wages;
	public Mobile() {}
	public String getColor() 
	{
		return color;
	}
	public void setColor(String color) 
	{
		this.color = color;
	}
	public String getBrand() 
	{
		return brand;
	}
	public void setBrand(String brand) 
	{
		this.brand = brand;
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
	}
	public Payment getPayment() 
	{
		return payment;
	}
	public void setPayment(Payment payment) 
	{
		this.payment = payment;
	}
	public Payment getPay() 
	{
		return pay;
	}
	public void setPay(Payment pay) 
	{
		this.pay = pay;
	}
	public Payment getWages() 
	{
		return wages;
	}
	public void setWages(Payment wages) 
	{
		this.wages = wages;
	}
	public void paymentStatus()
	{
		payment.paymentInfo();
		pay.paymentInfo();
		wages.paymentInfo();
	}
	public String toString() 
	{
		return "Mobile Phone.\n************************************\ncolor = " + color + ".\nBrand = " + brand + ".\nPrice = " + price + ".\n\n************************************\n";
	}
}
