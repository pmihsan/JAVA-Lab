package observation;

public class ThreadClass extends Thread{
    String s;
    ThreadClass(String n){
        s = n;
    }

    public void run(){
        System.out.println("HELLO");
        for(int i=0;i<s.length();i++){
            System.out.println(s.charAt(i));
        }
    }

    public static void main(String[] args) {
        ThreadClass t1 = new ThreadClass("Ihsan");
        ThreadClass t2 = new ThreadClass("Mohamed");
        t1.start();
        t2.start();
    }
}
