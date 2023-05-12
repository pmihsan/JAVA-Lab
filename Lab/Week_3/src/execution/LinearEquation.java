package execution;

public class LinearEquation {
	private double a,b,c,d,e,f;
	
	LinearEquation(double a, double b, double c, double d, double e, double f){
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}
	
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	public double getD(){
		return d;
	}
	public double getE(){
		return e;
	}
	public double getF(){
		return f;
	}
	
	public boolean isSolvable(){
		return (a * d) - (b * c) != 0;
	}
	
	public double getX(){
		double res = (e * d) - (b * f);
		res /= (a * d) - (b * c);
		return res;
	}
	
	public double getY(){
		double res = (a * f) - (e * c);
		res /= (a * d) - (b * c);
		return res;
	}
}
