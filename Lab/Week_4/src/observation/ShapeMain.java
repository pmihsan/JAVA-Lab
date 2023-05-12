package observation;

import java.util.Scanner;

public class ShapeMain {
        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Enter no of rectangles");
            int n = in.nextInt();
            Shape[] s = new Shape[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter length, breadth");
                int l = in.nextInt();
                int b = in.nextInt();
                s[i] = new Shape(l,b);
            }
            Shape[] similar = Shape.getSame(s);
            System.out.println("Similar Shaped Rectangles");
            for(int i=0;i<2;i++) {
                similar[i].display();
                System.out.println();
            }
            in.close();
       }
}
