package spot;

public class MultiThread implements Runnable {

	 int number;
	 long sec;
	
	MultiThread(){
		number = 0;
		sec = 0;
	}
	
	public void run(){
		try{
				while(sec < 5000){
					if(Thread.currentThread().getName() == "t1"){
						number = (int)(Math.random() * 10);
						System.out.println("Thread 1: " + number);
						sec += 1000;
					}
					if(Thread.currentThread().getName() == "t2"){
						if(number != 0 && number % 2 == 0){
							System.out.println("Thread 2: " + number * number);
						}
					}
					if(Thread.currentThread().getName() == "t3"){
						if(number != 0 && number % 2 != 0){
							System.out.println("Thread 3: " + number * number * number);
						}
					}
					Thread.sleep(1000);
//					System.out.println();
				}
		}
			
		catch(InterruptedException ie){
			System.out.println(ie.getMessage());
		}
	}
	

	public static void main(String[] args)  throws InterruptedException {
		MultiThread mt = new MultiThread();
		Thread t1 = new Thread(mt, "t1");
		Thread t2 = new Thread(mt, "t2");
		Thread t3 = new Thread(mt, "t3");
		
		t1.start();
		t2.start();
		t3.start();
		
	}

}
