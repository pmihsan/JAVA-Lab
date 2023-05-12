package observation;

public class BasicSync implements Runnable {
    Name n;
    BasicSync(String s){
        n = new Name(s);
    }
    public void run() {
        n.printChar();
    }

    public static void main(String[] args) {
        BasicSync bs = new BasicSync("Hello");
        BasicSync bs1 = new BasicSync("World");
        Thread t1 = new Thread(bs);
        Thread t2 = new Thread(bs);
        Thread t3 = new Thread(bs1);
        Thread t4 = new Thread(bs1);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}