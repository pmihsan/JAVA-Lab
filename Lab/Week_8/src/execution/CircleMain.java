package execution;

public class CircleMain {
	public static void main(String[] args){
		Circles c0 = new Circles(6);
		Circles c1 = new Circles(4.3);
		Circles c2 = new Circles(6);
		
		c1.print();c2.print();
		
		if(c1.equals(c2)){
			System.out.println("Both c1 and c2 are same");
		}
		else{
			System.out.println("Both c1 and c2 are not same");
		}
		System.out.println();
		
		c0.print();c2.print();
		if(c0.equals(c2)){
			System.out.println("Both c0 and c2 are same");
		}
		else{
			System.out.println("Both c0 and c2 are not same");
		}
		System.out.println();
	}
}

class GeometricObject {
	private double a;
	
	GeometricObject(double a){
		this.a = a;
	}
	
	public double getSize(){
		return a;
	}
	
	public void display(){
		System.out.println("Size: " + a);
	}
	
}

class Circles extends GeometricObject implements Comparable<Circles>{
	
	Circles(double a){
		super(a);
	}
	
	public boolean equals(Circles o){
		if(this.getSize() == o.getSize()) return true;
		return false;
	}
	
	public int compareTo(Circles o) {
		return (int)(this.getSize() - o.getSize());
	}
	
	public void print(){
		super.display();
		System.out.println("Area: " + Math.PI * Math.pow(super.getSize(), 2));
		System.out.println();
	}
}
