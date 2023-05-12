package execution;

public class Book {
	private String title, authorName;
	private double price;
	private int bookNo;
	
	Book(){
		title = "Wimpy Kid";
		authorName = "Charles";
		price = 450;
		bookNo = 1;
	}
	
	Book(String t, String a, double p, int b){
		title = t;
		authorName = a;
		price = p;
		bookNo = b;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String getAuthor(){
		return authorName;
	}
	
	public double getPrice(){
		return price;
	}
	
	public int getBookNo(){
		return bookNo;
	}
	
	public void details(){
		System.out.println("Title: " + title);
		System.out.println("Book No: " + bookNo);
		System.out.println("Author: " + authorName);
		System.out.println("Price: " + price);
	}
}
