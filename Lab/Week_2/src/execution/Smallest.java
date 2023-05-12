package execution;

import java.util.Scanner;

public class Smallest {

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n");
		int n = in.nextInt();
		System.out.println("Enter " + n + " elements");
		double[] arr = new double[n];
		
		for(int i=0;i<n;i++){
			arr[i] = in.nextDouble();
		}
		System.out.println("Smallest Element Index - " + indexOfSmallestElement(arr));
		in.close();
	}
	
	public static int indexOfSmallestElement(double[] array){
		double min = array[0];
		int ind = 0;
		for(int i=1;i<array.length;i++){
			if(array[i] < min){
				min = array[i];
				ind = i;
			}
		}
		return ind;
	}
}
