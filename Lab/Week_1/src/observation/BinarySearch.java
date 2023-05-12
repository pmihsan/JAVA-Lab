package observation;

import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int n = in.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter the array elements");
		System.out.println();
		for(int i=0;i<n;i++){
			arr[i] = in.nextInt();
		}
		
		System.out.println("Enter the target");
		int target = in.nextInt();
		
		int s = 0, e = n - 1;
		while(s <= e){
			int m = (s + (e - s) / 2);
			if(arr[m] == target){
				System.out.println("Found at index " + m);
				break;
			}
			else if(arr[m] < target){
				s = m + 1;
			}
			else{
				e = m - 1;
			}
		}
		if(s > e){
			System.out.println("Target Not found");
		}
		in.close();
	}

}
