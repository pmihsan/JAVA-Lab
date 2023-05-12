package execution;

public class ComparableCircleMain {
	public static void main(String[] args){
		ComparableCircle c1 = new ComparableCircle(4.5);
		ComparableCircle c2 = new ComparableCircle(4.5);
		
		if(c1.compareTo(c2) == 1){
			System.out.println("Greater Object is having");
			c1.display();
		}
		else if(c1.compareTo(c2) == -1){
			System.out.println("Greater Object is having");
			c2.display();
		}
		else{
			System.out.println("Both are same");
		}
	}
}

class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
	

	ComparableCircle(double r){
		super(r);
	}

	public int compareTo(ComparableCircle o) {
		if(this.getArea() > o.getArea()) return 1;
		else if(this.getArea() < o.getArea()) return -1;
		return 0;
	}
	
}

class Circle {
	private double r;
	
	Circle(double r){
		this.r = r;
	}

	public double getArea(){
		return Math.PI * r * r;
	}
	
	public void display(){
		System.out.println("Radius: " + r);
		System.out.println("Area: " + getArea());
	}
	
}