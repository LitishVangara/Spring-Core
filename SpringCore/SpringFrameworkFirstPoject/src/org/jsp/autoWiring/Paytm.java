package org.jsp.autoWiring;

public class Paytm implements Payment
{
	private String balancePaytm;
	public Paytm(String balancePaytm) 
	{
		super();
		this.balancePaytm = balancePaytm;
	}
	public void paymentInfo()
	{
		System.out.println("Your Paytm Balance is : "+balancePaytm);
	}
}
