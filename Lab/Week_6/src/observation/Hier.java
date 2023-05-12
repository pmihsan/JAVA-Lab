package observation;

class Fruit {
	String name, color;
    public Fruit(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void ripen() {
        System.out.println(name + " is ripening...");
    }
    public void taste(String flavor){
        System.out.println(color + " " + name +  " tastes " + flavor);
    }
}
class Apple extends Fruit {
    String flavor;
    public Apple(String name, String color, String flavor) {
        super(name, color);
        this.flavor = flavor;
    }
    public void taste(){
        super.taste(flavor);
    }
}
class Orange extends Fruit {
    String flavor;
    public Orange(String name, String color, String flavor) {
        super(name, color);
        this.flavor = flavor;
    }
    public void taste(){
        super.taste(flavor);
    }
}
class Banana extends Fruit {
    String flavor;
    public Banana(String name, String color, String flavor) {
        super(name, color);
        this.flavor = flavor;
    }
    public void taste(){
        super.taste(flavor);
    }
}

public class Hier {
    public static void main(String[] args) {

        Apple apple = new Apple("Apple", "Red", "delicious");
        Orange orange = new Orange("Orange", "Green", "sour");
        Banana banana = new Banana("Banana", "Yellow", "sweet");

        apple.ripen();
        orange.ripen();
        banana.ripen();

        apple.taste();
        orange.taste();
        banana.taste();

    }
}