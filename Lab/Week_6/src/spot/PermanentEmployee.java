package spot;

public class PermanentEmployee extends Employee{
	Date DOJ; 
	
	PermanentEmployee(String n, String d, int day, int m, int y){
		super(n,d);
		super.computeSalary();
		DOJ = new Date(day, m, y);
	}
	
	
	public void computeSalary(PermanentEmployee[] emps){
		emps[getSenior(emps)].setSalary(2000);
	}
	
	public int getSenior(PermanentEmployee[] emps) {
		int max_year = emps[0].DOJ.y;
		int max_mon = emps[0].DOJ.m;
		int max_day = emps[0].DOJ.d;
		int maxIndex = 0;
		for(int i=1;i<emps.length;i++){
			if(max_year > emps[i].DOJ.y){
				max_year = emps[i].DOJ.y;
				max_mon = emps[i].DOJ.m;
				max_day = emps[i].DOJ.d;
				maxIndex = i;
			}
			else continue;
			if(max_mon > emps[i].DOJ.m){
				max_year = emps[i].DOJ.y;
				max_mon = emps[i].DOJ.m;
				max_day = emps[i].DOJ.d;
				maxIndex = i;
			}
			else continue;
			if(max_day > emps[i].DOJ.d){
				max_year = emps[i].DOJ.y;
				max_mon = emps[i].DOJ.m;
				max_day = emps[i].DOJ.d;
				maxIndex = i;
			}
		}
		return maxIndex;
	}
	
}

class Date{
	int d,m,y;
	Date(int d, int m, int y){
		this.d = d;
		this.m = m;
		this.y = y;
	}
}
