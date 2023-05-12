package execution;

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class WordCount implements Runnable {

	String s;
	
	WordCount(String s){
		this.s = s;
	}
	
	public void run(){
		try{
			File f = new File("D:\\Users\\sfl41\\Desktop\\Java-Lab-3540\\Week_13\\src\\execution\\" + s);
			Scanner in = new Scanner(f);
			int c = 0;
			while(in.hasNext()){
				String str = in.nextLine();
				String[] arr = str.split(" ");
				c += arr.length;
			}
			System.out.println(f.getName() + ": " + c);
		}
		catch(IOException ie){
			System.out.println(ie.getMessage());
		}
	}
	
	public static void main(String[] args) {
		
		
		for(int i=0;i<args.length;i++){
			WordCount wc = new WordCount(args[i]);
			Thread t = new Thread(wc);
		
			t.start();
		}
	}

}
