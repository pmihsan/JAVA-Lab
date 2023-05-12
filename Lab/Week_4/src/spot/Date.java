package spot;

public class Date {
	private int d, m, y;
	
	Date(){
		d = 0;
		m = 0;
		y = 0;
	}
	
	Date(int d, int m, int y){
		this.d = d;
		this.m = m;
		this.y = y;
	}
	
	Date(Date s){
		d = s.d;
		m = s.m;
		y = s.y;
	}
	
	public void display(){
		System.out.println("Date: " + d + "/" + m + "/" + y);
	}
	
	public static void recentDate(Date[] dt){
		Date max = dt[0];
		for(int i=1;i<dt.length;i++){
			if(dt[i].y > max.y){
				max = dt[i];
			}
			else if(dt[i].y == max.y){
				if(dt[i].m > max.m){
					max = dt[i];
				}
				else if(dt[i].m == max.m && dt[i].d > max.d){
					max = dt[i];
				}
			}
		}
		max.display();
	}
}
