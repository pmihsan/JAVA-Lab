package spot;

public class DailyWages extends Employee{
	
	private double wagePerHour, HoursWorked;

	DailyWages(String n, String d, double wage, double hw) {
		super(n, d);
		super.computeSalary();
		setWGPH(wage);
		setHRS(hw);
	}	
	
	private void setWGPH(double wage){
		this.wagePerHour = wage;
	}
	
	private void setHRS(double hw){
		this.HoursWorked = hw;
	}
	
	public void computeSalary(){
		double s = (wagePerHour) * (HoursWorked);
		super.setSalary(s);
	}
}
