package execution;

public class Time {
	private int seconds;
	private int minutes;
	private int hours;
	
	Time(){
		seconds = 0;
		minutes = 0;
		hours = 0;
	}
	
	Time(int h, int m, int s){
		seconds = s;
		minutes = m;
		hours = h;
	}
	
	public void getTime(){
		System.out.println("Time: " + hours + ":" + minutes + ":" + seconds);
	}
	
	public void timeElapsed(int sec){
		int[] time = {0, 0, 0};
		while(sec > 0){
			if(time[2] >= 60){
				time[1]++;
				time[2] = 0;
			}
			else if(time[1] >= 60){
				time[0] = time[0]+1 < 24 ? time[0]+1 : time[0]+1 % 24;
				time[1] = 0;
			}
			else{
				time[2] = (sec > 60) ? 60 : sec;
				sec -= time[2];
			}
		}
		if(time[2] >= 60){
			time[1]++;
			time[2] = 0;
		}
		seconds += time[2];
		minutes += time[1];
		hours += time[0];
		if(seconds >= 60){
			seconds -= 60;
			minutes++;
		}
		if(minutes >= 60){
			minutes -= 60;
			hours++;
		}
		if(hours >= 24){
			hours %= 24;
		}
	}
	
//	public void elapsed(int seconds){
//		int h = (seconds / 3600);
//		int m = (seconds / 60);
//		int s = (seconds - (h * 360) - (m * 60));
//		 System.out.println(h + " " + m);
//	}
}
