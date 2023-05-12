package spot;

public class Main {
	public static void main(String[] args){
		PermanentEmployee pe1 = new PermanentEmployee("Ihsan", "Manager", 5, 7, 2003);
		PermanentEmployee pe2 = new PermanentEmployee("Gautham", "Technician", 5, 7, 2004);
		PermanentEmployee pe3 = new PermanentEmployee("Kumar", "Executive", 5, 7, 2013);
		
		PermanentEmployee[] emps = {pe1, pe2, pe3};
		
		for(int i=0;i<emps.length;i++){
			emps[i].display();
		}
		System.out.println();
		
		System.out.println("Computing Salary for Permanent Employees");
		pe1.computeSalary(emps);
		for(int i=0;i<emps.length;i++){
			emps[i].display();
		}
		System.out.println();
		
		DailyWages dw1 = new DailyWages("Ihsan", "Manager", 200, 5);
		DailyWages dw2 = new DailyWages("Gautham", "Executive", 100, 20);
		
		dw1.display();
		dw2.display();
		System.out.println();
		
		dw1.computeSalary();
		dw2.computeSalary();
		
		dw1.display();
		dw2.display();
		System.out.println();
		
	}

}
