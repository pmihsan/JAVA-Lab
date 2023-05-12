package execution;

public class TimeMain {
	public static void main(String[] args){
		Time t1 = new Time(12, 23, 52);
		System.out.println("1)" + t1.toString());
		
		Time t2 = new Time(7, 14, 34);
		System.out.println("2)" + t2.toString());
		System.out.println();
		
		try{
			t1.setHrs(24);
			t1.setMin(24);
			t1.setSeconds(40);
			System.out.println(t1.toString());
		}
		catch(IllegalArgumentException iae){
			System.out.println("IllegalArgumentException: " + iae.getMessage());
		}
		finally{
			System.out.println("Exception Handled");
		}
		System.out.println();
		try{
			t2.setHrs(15);
			t2.setMin(62);
			t2.setSeconds(40);
			System.out.println(t2.toString());
		}
		catch(IllegalArgumentException iae){
			System.out.println("IllegalArgumentException: " + iae.getMessage());
		}
		finally{
			System.out.println("Exception Handled");
		}
		System.out.println();
		try{
			t1.setHrs(9);
			t1.setMin(24);
			t1.setSeconds(-2);
			System.out.println(t1.toString());
		}
		catch(IllegalArgumentException iae){
			System.out.println("IllegalArgumentException: " + iae.getMessage());
		}
		finally{
			System.out.println("Exception Handled");
		}
		System.out.println();
		System.out.println("Program Terminated");
	}
}

class Time{
	int seconds, min, hrs;
	
	Time(int h, int m, int s){
		seconds = s;
		min = m;
		hrs = h;
	}

	public void setSeconds(int seconds) {
		if(seconds < 0 || seconds > 59){
			throw new IllegalArgumentException("Seconds Invalid");
		}
		this.seconds = seconds;
	}

	public void setMin(int min) {
		if(min < 0 || min > 59){
			throw new IllegalArgumentException("Minutes Invalid");
		}
		this.min = min;
	}

	public void setHrs(int hrs) {
		if(hrs < 0 || hrs > 23){
			throw new IllegalArgumentException("Hour Invalid");
		}
		this.hrs = hrs;
	}
	
	public String toString(){
		return "Time -> " + hrs + ":" + min + ":" + seconds;
	}
}
