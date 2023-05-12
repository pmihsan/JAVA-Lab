package execution;

import java.util.Arrays;
import java.util.Scanner;

public class Distinct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = 10;
		System.out.println("Enter " + n + " elements");
		int[] arr = new int[n];
		int k = 0;
		int flag = 0;
		for(int i=0;i<n;i++){
			int a = in.nextInt();
			for(int j=0;j<n;j++){
				if(arr[j] == a){
					flag = 0;
					break;
				}
				flag = 1;
			}
			if(flag == 1){
				arr[k] = a;
				k++;
			}
		}
		System.out.println(Arrays.toString(Arrays.copyOf(arr, k)));
		in.close();
	}

}
