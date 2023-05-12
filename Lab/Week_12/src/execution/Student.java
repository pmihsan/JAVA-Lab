package execution;

import java.io.*;
import java.util.Scanner;

public class Student implements  Serializable {
    int age;
    String name;
    double cgpa;
    long roll_no;

    Student(int a, String n, double c, long r){
        age = a;
        name = n;
        cgpa = c;
        roll_no = r;
    }

    public void display(){
        System.out.println("Name: " + name + "\n"
                + "Age: " + age + "\n"
                + "CGPA: " + cgpa + "\n"
                + "Roll number: " + roll_no
        );
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter name, age, cgpa, roll number");
        String n = in.next();
        int a = in.nextInt();
        double c = in.nextDouble();
        long r = in.nextLong();
        Student s1 = new Student(a, n, c, r);

        try{
            File f = new File("D:\\Users\\sfl41\\Desktop\\Java-Lab-3540\\Week_12\\src\\execution\\Student.data");
            
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(f));
            os.writeObject(s1);
            System.out.println("Object Written to file Student.data");
            
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(f));
            Student s2 = (Student) is.readObject();
            System.out.println("Object Read from file Student.data");
            System.out.println("Displaying Info");
            s2.display();
        }
        catch (IOException ioe){
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
