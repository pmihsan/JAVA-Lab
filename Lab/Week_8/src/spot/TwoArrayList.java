package spot;

import java.util.ArrayList;

public class TwoArrayList {
	public static void main(String[] args){
		ArrayList<Integer> l1 = new ArrayList<>();
		for(int i=1;i<=5;i++){
			l1.add(i*2);
		}
		ArrayList<Integer> l2 = new ArrayList<>();
		for(int i=1;i<=5;i++){
			l2.add(i*5);
		}
		ArrayList<Integer> l3 = (ArrayList<Integer>)l2.clone();
		System.out.println("List 1");
		System.out.println(l1 + "\n");
		System.out.println("List 2");
		System.out.println(l2 + "\n");
		System.out.println("List 3");
		System.out.println(l3 + "\n");
		
		
		for(int i=0;i<5;i+=2){
			l2.set(i, l2.get(i)+2);
		}
		System.out.println("List 2 after updating alternate index");
		System.out.println(l2 + "\n");
		
		System.out.println("List 3 has no changes");
		System.out.println(l3 + "\n");
		
		l1.addAll(l2);
		l1.addAll(l3);
		
		System.out.println("List after concatenating");
		System.out.println(l1 + "\n");
		
	}
}

class ArrayLists {
	
}
