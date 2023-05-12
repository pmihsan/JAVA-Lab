package observation;

import java.util.Scanner;

public class ProductsMain {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter no of products");
        int n = in.nextInt();
        Products[] p = new Products[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter pdt.available count, sold count, amount");
            int c = in.nextInt();
            int s = in.nextInt();
            double amt = in.nextDouble();
            p[i] = new Products(c,s,amt);
        }
        Products freq = Products.freqSold(p);
        System.out.println("Frequently Sold Product is");
        freq.display();
        in.close();
    }
}
