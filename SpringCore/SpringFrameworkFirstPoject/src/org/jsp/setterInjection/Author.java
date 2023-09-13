package org.jsp.setterInjection;

public class Author 
{
	private String authorName;
	private String mobile;
	public Author(String authorName, String mobile) 
	{
		super();
		this.authorName = authorName;
		this.mobile = mobile;
		System.out.println("Constructor with two arguments of Author Class\nObject Created.");
	}
	public void displayInfo()
	{
		System.out.println("The Author Name is : "+authorName+" and the Mobile Number is : "+mobile+".");
	}
}
