package execution;

import java.util.Scanner;

public class Consecutive {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter n");
		int n = in.nextInt();
		System.out.println("Enter you "+ n + "x" + n + " elements");
		int[][] arr = new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				arr[i][j] = in.nextInt();
			}
		}
//		int[][] arr1 = {
//				{1, 0, 0, 1},
//				{0, 1, 1, 1},
//				{0, 0, 0, 1},
//				{1, 1, 0, 1}
//		};
		if(isConsecutiveFour(arr)){
			System.out.println("Consecutive Four Number Exists");
		}
		else{
			System.out.println("Consecutive Four Number Not Exists");
		}
	
		in.close();
	}
	
	public static boolean isConsecutiveFour(int[][] val){
		if(val.length <= 3) return false;
		int i = 0;
		int j = 0;
		int c = 1;
		while(i < val.length-1 && j < val.length-1){
			if(val[i][j] == val[i+1][j+1]) c++;
			else c = 1;
			i++;
			j++;
		}
		if(c == 4) {
			System.out.println("Diagonal Forward");
			return true;
		}
		c = 1;i = 0;j = val.length-1;
		while(i < val.length - 1 && j > 0){
			if(val[i][j] == val[i+1][j-1]) c++;
			else c = 1;
			i++;
			j--;
		}
		if(c == 4) {
			System.out.println("Diagonal Backward");
			return true;
		}
		c = 1;
		for(i=0;i<val.length;i++){
			for(j=0;j<val.length-1;j++){
				if(val[i][j] == val[i][j+1]) c++;
				else c = 1;
			}
			if(c == 4) {
				System.out.println("Row " + i);
				return true;
			}
			c = 1;
		}
		c = 1;
		for(i=0;i<val.length;i++){
			for(j=0;j<val.length-1;j++){
				if(val[j][i] == val[j][i+1]) c++;
				else c = 1;
			}
			if(c == 4) {
				System.out.println("Column " + j);
				return true;
			}
			c = 1;
		}

		return false;
	}
}
