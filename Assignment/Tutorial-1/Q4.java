public class Q4{
	public static void main(String[] args){
	// method 1
		print("pm", 12, 34 ,56);
		System.out.println();	
	
	// method 2
		print("hello world", 1, 2, 3, 4, 5, 6);
		System.out.println();	

	// method 3	
 		double[] numbers = print(2.33,4.90);	
		for(double d: numbers){
			System.out.println(d);
		}	
		System.out.println();	
 		double[] nums = print(2.33,2.33);	
		for(double d: nums){
			System.out.println(d);
		}	
		System.out.println();	
	}

	// Method 1
	/* Only one VarArgs possible and also var arg should be at last
	public static void print(String... strings, double... numbers){
		for(String s: strings){
			System.out.println(s);
		}
		for(double d: numbers){
			System.out.println(d);
		}
	}
	*/
	public static void print(String s, double... numbers){
		System.out.println(s);
		for(double d: numbers){
			System.out.println(d);
		}	
	}

	// Method 2
	/* VarArg should be at last of the parameters
	public static void print(double... numbers, String name){
		for(double d: numbers){
			System.out.println(d);
		}
		System.out.println(name);
	}
	*/

	// Method 3
	/* Not possible to give return type as varargs
  	public static double... print(double d1, double d2){
		if(d1 == d2) return new double[] {1.45,2.23,3.12,4.78};
		return new double[] {1.45,2.56};
	}
	*/
  	public static double[] print(double d1, double d2){
		if(d1 == d2) return new double[] {1.45,2.23,3.12,4.78};
		return new double[] {1.45,2.56};
	}
}
