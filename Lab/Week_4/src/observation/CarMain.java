package observation;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of cars");
        int n = in.nextInt();
        Car[] cr = new Car[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter model, color, speed");
            String m = in.next();
            String t = in.next();
            int s = in.nextInt();
            cr[i] = new Car(m, t, s);
        }
        Car max = Car.maxSpeed(cr);
        System.out.println("Fastest  Car");
        max.display();
        in.close();
    }
}
