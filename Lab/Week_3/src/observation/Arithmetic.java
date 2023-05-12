package observation;

import java.util.Arrays;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter n");
        int n = in.nextInt();
        
        MathClass mc = new MathClass(n);
        System.out.println("Enter n elements");
        for(int i=0;i<mc.n;i++){
            mc.arr[i] = in.nextInt();
        }
        System.out.println("Minimum and Maximum " + Arrays.toString(mc.getMinMax()));
        
        MathClass mc1 = new MathClass();
        System.out.println("Enter n elements");
        for(int i=0;i<mc1.n;i++){
            mc1.arr[i] = in.nextInt();
        }
        System.out.println("Minimum and Maximum " + Arrays.toString(mc1.getMinMax()));
        in.close();
    }

    public static class MathClass{
        int n;
        int[] arr;
        MathClass(){
            n = 5;
            arr = new int[5];
        }
        MathClass(int n){
            this.n = n;
            arr = new int[n];
        }
        public int[] getMinMax(){
            int [] res = new int[2];
            res[0] = res[1] = arr[0];
            for(int i=1;i<n;i++){
                if(arr[i] < res[0]) res[0] = arr[i];
                if(arr[i] > res[1]) res[1] = arr[i];
            }
            return res;
        }
    }
}