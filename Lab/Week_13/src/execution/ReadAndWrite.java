package execution;

import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadAndWrite implements Runnable{
	
	String s;
	boolean read;
	
	ReadAndWrite(String s, boolean read){
		this.s = s;
		this.read = read;
	}
	
	public void run(){
		if(read){
			readFile(s);
		}
		else{
			WriteFile(s);
		}
	}
	
	synchronized void readFile(String s){
		try{
			File f = new File("D:\\Users\\sfl41\\Desktop\\Java-Lab-3540\\Week_13\\src\\execution\\" + s);
			Scanner in = new Scanner(f);
			System.out.println(f.getName() + ": Contents");
			while(in.hasNext()){
				String str = in.nextLine();
				System.out.println(str);	
			}
			System.out.println();
		}
		catch(IOException ie){
			System.out.println(ie.getMessage());
		}
	}
	
	 synchronized void WriteFile(String s) {
		try{
			File f = new File("D:\\Users\\sfl41\\Desktop\\Java-Lab-3540\\Week_13\\src\\execution\\" + s);
			PrintWriter pr = new PrintWriter(f);
			pr.write("Hello World\n");
			pr.write("Written using Threads\n");
			pr.close();
			System.out.println(f.getName() + ": Data Written");
			System.out.println();
		}
		catch(IOException ie){
			System.out.println(ie.getMessage());
		}
	}
	
	public static void main(String[] args){
		ReadAndWrite read = new ReadAndWrite("sample.txt", true);
		ReadAndWrite write = new ReadAndWrite("sample.txt", false);
		
		Thread t = new Thread(read);
		Thread t1 = new Thread(write);
		
		t.start();
		t1.start();
		
	}
}


