package observation;

public class AbstractMain {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        System.out.println("AREA: " + circle.getArea());
        System.out.println("PERIMETER: " + circle.getPerimeter());

        Shape square = new Square(4);
        System.out.println("AREA: " + square.getArea());
        System.out.println("PERIMETER: " + square.getPerimeter());
    }
}

abstract class Shape{
    public abstract double getPerimeter();
    public abstract double getArea();
}

class Circle extends Shape {
    private double r;

    public Circle(double r){
        this.r = r;
    }

    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    public double getArea() {
        return Math.PI * r * r;
    }
}

class Square extends Shape {
    private double a;

    public Square(double a){
        this.a = a;
    }

    public double getPerimeter() {
        return 4 * a;
    }

    public double getArea() {
        return a * a;
    }
}
