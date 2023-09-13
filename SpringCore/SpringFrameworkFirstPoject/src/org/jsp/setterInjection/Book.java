package org.jsp.setterInjection;

public class Book 
{
	private String bookId;
	private String bookName;
	private double price;
	private Author author;
	public Book()
	{
		System.out.println("Default constructor of Book Class\nObject Created.");
	}
	public String getBookId() 
	{
		return bookId;
	}
	public void setBookId(String bookId) 
	{
		this.bookId = bookId;
		System.out.println("\nSetter Method of Book ID.");
	}
	public String getBookName() 
	{
		return bookName;
	}
	public void setBookName(String bookName) 
	{
		this.bookName = bookName;
		System.out.println("\nSetter Method of Book Name.");
	}
	public double getPrice() 
	{
		return price;
	}
	public void setPrice(double price) 
	{
		this.price = price;
		System.out.println("\nSetter Method of Book Price.");
	}
	public Author getAuthor() 
	{
		return author;
	}
	public void setAuthor(Author author) 
	{
		this.author = author;
		System.out.println("\nSetter Method of Author.");
	}
	public void getAuthorInfo()
	{
		author.displayInfo();
	}
	public Book(String bookId, String bookName, double price, Author author) 
	{
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.price = price;
		this.author = author;
	}
	public Book(Author author) 
	{
		super();
		this.author = author;
	}
	@Override
	public String toString() 
	{
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", price=" + price + "]";
	}
}
