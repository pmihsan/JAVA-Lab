package spot;

public class SalesPerson {
	private int age;
	private String name;
	private int noOfSales;
	private double saleAmount;
	private double salary;
	
	SalesPerson(){
		noOfSales = 0;
		saleAmount = 0;
	}
	
	SalesPerson(String name, int age, double salary){
		this.age = age;
		this.name = name;
		this.salary = salary;
	}
		
	public int getSales(){
		return noOfSales;
	}
	
	
	public void addSales(){
		noOfSales++;
		if(noOfSales >= 10 && noOfSales <= 20){
			saleAmount = 1000;
		}
		else if(noOfSales >= 20 && noOfSales <= 40){
			saleAmount = 2000;
		}
		else if(noOfSales > 40){
			saleAmount = 5000;
		}
	}
	
	public double getBonus(){
		return saleAmount;
//		salary += saleAmount;
//		return salary + saleAmount;
	}
	
	public void display(){
		System.out.println();
		System.out.println("Sales person details:");
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
		System.out.println("Sales Made: " + noOfSales);
		System.out.println("Salary: " + salary);
	}
	
}
