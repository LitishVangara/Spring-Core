package org.jsp.configurationOfXml;

public class BankAccount 
{
	private String accNo;
	private double balance;
	public BankAccount(String accNo, double balance) 
	{
		super();
		this.accNo = accNo;
		this.balance = balance;
		System.out.println("Dependency Class Constructor with two Arguments of BankAccount Class.");
		System.out.println("Variables Initialized...");
	}
	public void displayBalance()
	{
		System.out.println("Your Bank Account Number is : "+accNo+" and Balance is : "+balance+".");
	}
}
