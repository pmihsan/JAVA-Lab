package observation;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableInt {
    public static void main(String[] args) {
        Employee[] empArr = new Employee[5];
        empArr[0] = new Employee(13, "John ", 25, 10000);
        empArr[1] = new Employee(20, "Arun ", 29, 20000);
        empArr[2] = new Employee(50, "Nick ", 35, 50000);
        empArr[3] = new Employee(60, "Kumar", 23, 50000);
        empArr[4] = new Employee(10, "Ihsan", 32, 50000);


        System.out.println(Arrays.toString(empArr));
        // Sort based on salary and then id
        System.out.println("Sort based on salary and then id");
        Arrays.sort(empArr);
        System.out.println(Arrays.toString(empArr));

        // Sort based on Age
        System.out.println("Sort based on age");
        Arrays.sort(empArr, Employee.Age);
        System.out.println(Arrays.toString(empArr));

        // Sort based on Name
        System.out.println("Sort based on name");
        Arrays.sort(empArr, Employee.Name);
        System.out.println(Arrays.toString(empArr));
    }
}

class Employee implements Comparable<Employee>{
    private int id, age;
    private String name;
    private double salary;

    Employee(int i, String n, int a, double s){
        id = i;
        age = a;
        name = n;
        salary = s;
    }

    public String toString(){
        String s = "\nID: " + id + ", ";
        s += "NAME: " + name + ", ";
        s += "AGE: " + age + ", ";
        s += "SALARY: " + salary ;

        return s;
    }

    public int compareTo(Employee o) {
        if(this.salary < o.salary) return 1;
        else if(this.salary > o.salary) return -1;
        return this.id - o.id;
    }

    public static Comparator<Employee> Age = new Comparator<Employee>() {
        public int compare(Employee o1, Employee o2) {
            return (int)(o1.age - o2.age);
        }
    };

    public static Comparator<Employee> Name = new Comparator<Employee>() {
        public int compare(Employee o1, Employee o2) {
            return o1.name.compareTo(o2.name);
        }
    };
}
