package execution;

import java.util.Scanner;
public class TestLibrary {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int id = 1;
		
		// Default
		LibraryMember lm1 = new LibraryMember();
		System.out.println("Name " + lm1.getName());
		
		// Test Objects
		LibraryMember lm2 = new LibraryMember("pm", id++, 100);
		
		lm2.display();
		lm2.borrow(3);
		lm2.display();
		lm2.returnBook(1);
		lm2.display();
		
		System.out.println("Enter n for members");
		int n = in.nextInt();
		
		LibraryMember[] libArr = new LibraryMember[n];
		System.out.println("Enter name, membershipfee");
		for(int i=0;i<n;i++){
			String s = in.next();
			int fee = in.nextInt();
			libArr[i] = new LibraryMember(s, id++, fee);
		}
		System.out.println("Enter number of books borrowed for each member");
		for(int i=0;i<n;i++){
			int books = in.nextInt();
			libArr[i].borrow(books);
		}
		
		System.out.println("Enter number of books returned for each member");
		for(int i=0;i<n;i++){
			int books = in.nextInt();
			libArr[i].returnBook(books);
		}
		
		System.out.println("Enter the membership number you want to search(1-" + (n+1) + ")");
		int mn = in.nextInt();
		LibraryMember.searchDetails(mn, libArr);
		in.close();
	}
}
