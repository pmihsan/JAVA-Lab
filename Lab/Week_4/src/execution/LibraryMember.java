package execution;

public class LibraryMember {
	private String name;
	private int memberShipNo, numberOfBooks;
	private double memberShipFee;
	
	LibraryMember(){
		name = "Default";
		memberShipNo = 1;
		numberOfBooks = 0;
		memberShipFee = 0;
	}
	
	LibraryMember(String n, int m, int f){
		name = n;
		memberShipNo = m;
		numberOfBooks = 0;
		memberShipFee = f;
	}
	
	public String getName(){
		return name;
	}
	
	public void borrow(int n){
		if(numberOfBooks+n > 5){
			System.out.println("You can't BORROW");
			return;
		}
		numberOfBooks += n;
		System.out.println("Book BORROWED");
	}
	
	public void returnBook(int n){
		if(n-numberOfBooks > 0){
			System.out.println("You can't RETURN");
			return;
		}
		numberOfBooks -= n;
		System.out.println("Book RETURNED");
	}
	
	public static void searchDetails(int mn, LibraryMember[] lm){
		for(int i=0;i<lm.length;i++){
			if(lm[i].memberShipNo == mn){
				lm[i].display();
				return;
			}
		}
		System.out.println("No Member Found");
	}
	
	public void display(){
		System.out.println("Library Member");
		System.out.println("Name: " + name);
		System.out.println("MemberShipNumber: " + memberShipNo);
		System.out.println("NoOfBooksBorrowed: " + numberOfBooks);
		System.out.println("memberShipFee: " + memberShipFee);
		System.out.println();
	}
}
