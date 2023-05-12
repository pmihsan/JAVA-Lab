public class Q3{
	public static void main(String[] args){
		double[] r = new double[100];
		/*double[100] r; */

		for(int i=0;i<r.length;i++){
			/* r.length() */
			r[i] = Math.random() * 100;
			/* r(i) and Math.random */
		}
		display(r);
	}
	public static void display(double r[]){
		for(int i=0;i<5;i++){
			System.out.println(r[i]);
		}
	}
}
