package observation;

public class InterfaceMain2 {
    public static void main(String[] args) {
        Vehicle car = new Car(230, 4);
        Vehicle bicycle = new Cycle(70, 2);

        System.out.println("CAR:");
        System.out.println("\tmax speed: " + car.getMaxSpeed());
        System.out.println("\tnumber of wheels: " + car.getNumWheels());

        System.out.println("BICYCLE:");
        System.out.println("\tmax speed: " + bicycle.getMaxSpeed());
        System.out.println("\tnumber of wheels: " + bicycle.getNumWheels());
    }
}

interface Vehicle {
    int getMaxSpeed();
    int getNumWheels();
}

class Car implements Vehicle {
    private int speed, wheels;

    public Car(int s, int w){
        speed = s;
        wheels = w;
    }

    public int getMaxSpeed() {
        return speed;
    }

    public int getNumWheels() {
        return wheels;
    }
}

class Cycle implements Vehicle {
    private int speed, wheels;

    public Cycle(int s, int w){
        speed = s;
        wheels = w;
    }

    public int getMaxSpeed() {
        return speed;
    }

    public int getNumWheels() {
        return wheels;
    }
}
