package observation;

public class Car {
    private String model, color;
    private int speed;

    Car(){
        model = "";
        color = "";
        speed = 0;
    }

    Car(String model, String color, int speed) {
        this.model = model;
        this.color = color;
        this.speed = speed;
    }

    public void display(){
        System.out.println("Model: " + model + "\nColor: " + color + "\nSpeed: " + speed);
    }

    public static Car maxSpeed(Car[] c){
        int max = c[0].speed;
        int ind = 0;
        for(int i=0;i<c.length;i++){
            if(max < c[i].speed) {
                max = c[i].speed;
                ind = i;
            }
        }
        return c[ind];
    }
}


