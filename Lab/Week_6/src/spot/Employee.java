package spot;

public class Employee {
	private static int num = 1;
	private String name, designation;
	private int id;
	private double salary;
	
	Employee(String n, String d){
		name = n;
		designation = d;
		id = num++;
		salary = 0;
	}
	
	public String getName(){
		return name;
	}
	
	public String getDesignation(){
		return designation;
	}
	
	public double getSalary(){
		return salary;
	}
	
	public int getId(){
		return id;
	}
	
	public void setSalary(double s){
		salary += s;
	}
	
	public void display(){
		System.out.println("Name: " + name);
		System.out.println("Id:" + id);
		System.out.println("Designation: " + designation);
		System.out.println("Salary " + salary);
	}
	
	public void computeSalary(){
		if(designation.equalsIgnoreCase("Manager")){
			setSalary(50000);
		}
		else if(designation.equalsIgnoreCase("Executive")){
			setSalary(40000);
		}
		else if(designation.equalsIgnoreCase("Technician")){
			setSalary(30000);
		}
	}
	

}
