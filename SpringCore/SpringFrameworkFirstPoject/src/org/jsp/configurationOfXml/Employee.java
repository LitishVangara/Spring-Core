package org.jsp.configurationOfXml;

//Description of bean

public class Employee 
{
	private int empId;
	private String ename;
	private double salary;
	private BankAccount account; 
	public Employee()
	{
		System.out.println("IoC Container called Default Constructor");
		System.out.println("Object Created...");
	}
	public Employee(int empId) 
	{
		super();
		this.empId = empId;
		System.out.println("IoC Container called Constructor with one Argument");
		System.out.println("Object Created...");
		System.out.println("Variable Initialized...");
	}
	public Employee(int empId, String ename) 
	{
		super();
		this.empId = empId;
		this.ename = ename;
		System.out.println("IoC Container called Constructor with two Arguments");
		System.out.println("Object Created...");
		System.out.println("Variables Initialized...");
	}
	public Employee(int empId, String ename, double salary) 
	{
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
		System.out.println("IoC Container called Constructor with three Arguments");
		System.out.println("Object Created...");
		System.out.println("Variables Initialized...");
	}
	public Employee(int empId, String ename, double salary, BankAccount account) {
		super();
		this.empId = empId;
		this.ename = ename;
		this.salary = salary;
		this.account = account;
		System.out.println("IoC Container called Constructor with four Arguments");
		System.out.println("Variables Initialized...");
	}
	public void salaryStatus()
	{
		System.out.println(salary+"Rs is Credited...");
	}
	public void getBalance()
	{
		account.displayBalance();
	}
	@Override
	public String toString() 
	{
		return "Employee [empId=" + empId + ", ename=" + ename + "]";
	}
}
