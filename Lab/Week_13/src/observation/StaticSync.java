package observation;

public class StaticSync implements Runnable {
    Name n;
    StaticSync(String s){
        n = new Name(s);
    }
    public void run() {
        Name.printLetters(n.name);
    }

    public static void main(String[] args) {
    	StaticSync bs = new StaticSync("Hello");
    	StaticSync bs1 = new StaticSync("World");
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