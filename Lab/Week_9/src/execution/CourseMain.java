package execution;

import java.util.Arrays;

public class CourseMain {
	public static void main(String[] args){
		Course c1 = new Course("CS", "John", new String[]{"Programming in C", "C Algorithms"});
		c1.tooString();
		System.out.println();
		
		Course c2 = new Course("DBMS", "Ram", new String[]{"Database",  "MysQL"});
		c2.tooString();
		System.out.println();
		
		Course c3 = new Course("ML", "John", new String[]{"Algorithms Perspective"});
		c3.tooString();
		System.out.println();
		
		if(c1.equals(c2)){
			System.out.println("Course " + c1.courseName + " and " + c2.courseName + " has same instructor");
		}
		else{
			System.out.println("Course " + c1.courseName + " and " + c2.courseName + " has different instructor");
		}
//		System.out.println(c1.compareTo(c2));
		System.out.println();
		if(c1.equals(c3)){
			System.out.println("Course " + c1.courseName + " and " + c3.courseName + " has same instructor");
		}
		else{
			System.out.println("Course " + c1.courseName + " and " + c3.courseName + " has different instructor");
		}
//		System.out.println(c1.compareTo(c3));
	}
}

class Course implements Comparable<Course>{
	String courseName, instructorName;
	Textbook tb;
	
	Course(String cn, String cin, String[] a){
		courseName = cn;
		instructorName = cin;
		tb = new Textbook(a);
	}	
	
	public String getCN(){
		return courseName;
	}
	
	public String getCIN(){
		return instructorName;
	}
	
	public String[] getBooks(){
		return tb.books;
	}
	
	public void tooString(){
		System.out.println("Course Name: " + courseName);
		System.out.println("Instructor Name: " + instructorName);
		System.out.println("TextBooks: " + Arrays.toString(tb.books));
	}

	public int compareTo(Course o) {
		return o.instructorName.compareTo(this.instructorName);
	}
	
	public boolean equals(Course o){
		if(o.instructorName.equals(this.instructorName)) return true;
		return false;
	}
}

class Textbook{
	String[] books;
	int no;
	Textbook(String[] b){
		books = b;
		no = b.length;
	}
}
