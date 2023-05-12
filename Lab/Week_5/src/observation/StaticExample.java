package observation;

public class StaticExample {
    public static void main(String[] args) {
        Calc c = new Calc();
        c.addition(1,2,3,4,5,56,67,7,8,9,9,-1);
        Calc.display();
    }
}
class Calc {
    static int res = 0;
    int numAdded;

    Calc(){
        numAdded = 0;
    }
    public void addition(int... a) {
        for (int i : a) {
            res += i;
            numAdded++;
        }
        System.out.println("Total Numbers: " + numAdded);
    }
    public static void display(){
        System.out.println("Sum: " + res);
    }
}
