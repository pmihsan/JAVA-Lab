package execution;

public class ComparableEmployeeMain {
	public static void main(String[] args){
		ComparableEmployee c1 = new ComparableEmployee("Ihsan", 450000);
		ComparableEmployee c2 = new ComparableEmployee("Ram", 60000);
		
		System.out.println("Employee having high salary");
		if(c1.compareTo(c2) == 1){
			c1.display();
		}
		else if(c1.compareTo(c2) == -1){
			c2.display();
		}
		else{
			System.out.println("Both have same salary");
		}
	}
}

class ComparableEmployee extends Employee implements Comparable<ComparableEmployee> {
	

	ComparableEmployee(String n, double s){
		super(n ,s);
	}

	public int compareTo(ComparableEmployee o) {
		if(this.getSalary() > o.getSalary()) return 1;
		else if(this.getSalary() < o.getSalary()) return -1;
		return 0;
	}
	
}

class Employee {
	private String name;
	private double salary;
	
	Employee(String n, double s){
		name = n;
		salary = s;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public void display(){
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
	
}