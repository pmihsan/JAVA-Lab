package execution;

public class SleepTime implements Runnable{
	
	long s;
	SleepTime(long sec){
		s = sec;
	}
	
	public void run(){
		try{
			Thread.sleep(s);
			System.out.println("Sleep Time: " + s/1000.0 + " sec");
		} 
		catch(InterruptedException ie){
			System.out.println(ie.getMessage());
		}
	}
	
	public static void main(String[] args){
		long l = (long)(Math.random()* 10000);
		System.out.println("Milli Seconds: " + l);
		SleepTime st = new SleepTime(l);
		Thread t = new Thread(st);
		
		t.start();
	}
}
