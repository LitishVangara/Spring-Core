package org.jsp.autoWiring;

public class Phonepe implements Payment
{
	private String balancePhonepe;
	public Phonepe(String balancePhonepe) 
	{
		super();
		this.balancePhonepe = balancePhonepe;
	}
	public void paymentInfo()
	{
		System.out.println("Your Phonepe Balance : "+balancePhonepe);
	}
}
