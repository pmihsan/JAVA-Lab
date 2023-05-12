package observation;

class Car {
    private int speed, year;
    private String name, model, color;

    Car(){
        speed = 100;
        name = "Default";
        model= "HV";
        color = "black";
    }

    Car(int s, String n, String m, String c){
        speed = s;
        name = n;
        model = m;
        color = c;
    }

    Car(String n, String m, int y){
        name = n;
        model = m;
        year = y;
    }
    public void display(){
        System.out.println("CAR FEATURES DETAILS");
        System.out.println("Name: " + name);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

class CarAppearance extends Car{
    private int speed;
    private String color;

    CarAppearance(){
        super();
    }

    CarAppearance(int s, String name, String model, String c, int y){
        super(name, model, y);
        speed = s;
        color = c;
    }

    public void display(){
        super.display();
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }
}

class CarYear extends CarAppearance{
    private int year;

    CarYear(){
        super();
        year = 1864;
    }

    CarYear(int speed, String name, String model, String color, int year){
        super(speed, name, model, color, year);
    }

    public void display(){
        super.display();
    }
}

public class CarMain {
    public static void main(String[] args) {
        CarYear cy1 = new CarYear(200, "AUDI", "A300", "RED", 2010);
        CarYear cy2 = new CarYear(500, "Benz", "BX", "WHITE", 2014);

        cy2.display();
        System.out.println();
        cy1.display();
    }
}
