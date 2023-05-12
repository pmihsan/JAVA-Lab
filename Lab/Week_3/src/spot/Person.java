package spot;

import java.util.Scanner;
public class Person {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of sales person");
		int n = in.nextInt();
		for(int i=0;i<n;i++){
			System.out.println("Enter name, age and salary of sales person");
			String name = in.next();
			int age = in.nextInt();
			double salary = in.nextDouble();
			
			SalesPerson sp = new SalesPerson(name, age, salary);
			
			sp.display();
			System.out.println();
			System.out.println("Enter number of sales");
			int sales = in.nextInt();
			for(int j=0;j<sales;j++){
				sp.addSales();
			}
			System.out.println("No of sales made: " + sp.getSales());
			
			System.out.println("Bonus: " + sp.getBonus());
			System.out.println();
		}
		
		in.close();
	}
}
