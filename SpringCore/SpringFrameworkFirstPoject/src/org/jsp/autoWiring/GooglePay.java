package org.jsp.autoWiring;

public class GooglePay implements Payment
{
	private String balanceGooglePay;
	public GooglePay(String balanceGooglePay) 
	{
		super();
		this.balanceGooglePay = balanceGooglePay;
	}
	public void paymentInfo()
	{
		System.out.println("Your GooglePay Balance is : "+balanceGooglePay);
	}
}
