package execution;

import java.util.ArrayList;

public class LibraryMember extends Book{
	static int id = 1;
	private String name;
	ArrayList<Book> books;
	private int mem_id;
	
	LibraryMember(String name){
		this.name = name;
		this.mem_id = id++;
		this.books = new ArrayList<>();;
	}
	
	public String getName(){
		return name;
	}
	
	public void borrowBook(Book[] b){
		for(int i=0;i<b.length;i++){
			books.add(b[i]);
		}
	}
	
	public void returnBook(Book[] b){
		for(int i=0;i<b.length;i++){
			books.remove(b[i]);
		}
	}
	
	public void tooString(){
		System.out.println("Name: "+ name);
		System.out.println("MemberShip-ID: " + mem_id);
	}
	
	public void getBooks(){
		for(int i=0;i<books.size();i++){
			books.get(i).details();
			System.out.println();
		}
	}
	
	public boolean search(int book_no){
		for(int i=0;i<books.size();i++){
			if(books.get(i).getBookNo() == book_no){
				books.get(i).details();
				return true;
			}
		}
		return false;
	}
	
	public void display(){
		tooString();
		System.out.println("Books");
		System.out.println();
		for(int i=0;i<books.size();i++){
			books.get(i).details();
			System.out.println();
		}
	}
}
