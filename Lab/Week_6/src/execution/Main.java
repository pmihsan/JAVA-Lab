package execution;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryMember lm1 = new LibraryMember("Ihsan");
		LibraryMember lm2 = new LibraryMember("Gautham");
		
		Book b1 = new Book("Wimpy Kid", "Charles", 500.00, 2);	
		Book b2 = new Book("Harry Potter", "Xavier", 1500.00, 3);	
		Book b3 = new Book("Maze Runner", "Lucifer", 700.00, 7);
		
		Book b4 = new Book("Avengers", "Stan Lee", 650.00, 5);	
		Book b5 = new Book("TVD", "Klaus", 500.00, 4);
		
		lm1.borrowBook(new Book[]{b1, b2, b3});
		lm2.borrowBook(new Book[]{b4, b5});
		
		System.out.println("Member 1");
		lm1.display();
		System.out.println();
		
		System.out.println("Member 2");
		lm2.display();
		System.out.println();
		
		
		System.out.println("Return Books ");
		lm2.returnBook(new Book[]{b4});
		System.out.println("Library Memeber 2 BOOKS after returning");
		lm2.getBooks();
		System.out.println();
		
		System.out.println("Searching for book Maze Runner(BOOK NO: 7) in memeber 1");
		if(lm1.search(7)){
			System.out.println();
			System.out.println("Book Found");
		}
		else{
			System.out.println();
			System.out.println("Book Not Found");
		}
		
		System.out.println();
		System.out.println("Searching for book Avengers(BOOK NO: 5) in member 2");
		if(lm1.search(5)){
			System.out.println();
			System.out.println("Book Found");
		}
		else{
			System.out.println();
			System.out.println("Book Not Found");
		}	
	}

}
