package observation;

public class RunInterface implements Runnable {

    static int n;

    public void run(){
        int sum = 0;
        System.out.println("VALUES");
        for(int i=1;i<=n;i++){
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println(" -> " + sum);
    }

    public static void main(String[] args) throws InterruptedException {
        RunInterface ri = new RunInterface();
        Thread t1 = new Thread(ri);
        Thread t2 = new Thread(ri);
        n = 5;
        t1.start();
        t1.join();
        n = 10;
        t2.start();
    }
}
