package execution;

public class FiboSeq implements Runnable {
	
	int n;
	FiboSeq(int n){
		this.n = n;
	}
	
	public void run(){
		System.out.println("Fibonacci: " + n);
		int a = 0;
		int b = 1;
		int c = a + b;
		System.out.println(a);
		System.out.println(b);
		for(int i=2;i<=n;i++){
			System.out.println(c);
			a = b;
			b = c;
			c = a + b;
		}
		System.out.println();
	}
	
	public static void main(String[] args) throws InterruptedException {
		FiboSeq fs = new FiboSeq(5);
		Thread t = new Thread(fs);
		
		FiboSeq fs1 = new FiboSeq(10);
		Thread t1 = new Thread(fs1);
		
		FiboSeq fs2 = new FiboSeq(12);
		Thread t2 = new Thread(fs2);
		
		
		t.start();
		t.join();
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		
		
	}
}
