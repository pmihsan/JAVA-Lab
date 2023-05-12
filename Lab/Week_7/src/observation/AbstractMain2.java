package observation;

public class AbstractMain2 {
    public static void main(String[] args) {
        Mobile m1 = new Mobile("Samsung", "Black", "M31", 6, 128);
        Laptop l1 = new Laptop("HP", "Silver", "Notebook", 16, 1000);

        m1.power(true);
        m1.showDetails();
        m1.power(false);

        System.out.println();

        l1.power(true);
        l1.showDetails();
        l1.power(false);

    }
}

abstract class Electronics{
    public abstract void power(boolean flag);
    public abstract void showDetails();
}

class Mobile extends Electronics {

    private String name, color, model;
    private int ram, storage;

    public Mobile(String n, String c, String m, int r, int s){
        name = n;
        color = c;
        model = m;
        ram = r;
        storage = s;
    }

    public void power(boolean flag) {
        if(flag) System.out.println("Mobile Device Powered ON");
        else System.out.println("Mobile Device Powered OFF");
    }

    public void showDetails() {
        System.out.println("Mobile Details");
        System.out.println("\tBrand: "+ name);
        System.out.println("\tModel: " + model);
        System.out.println("\tRam: " + ram + "GB");
        System.out.println("\tStorage: " + storage + "GB");
        System.out.println("\tColor: " +  color);
    }
}

class Laptop extends Electronics {

    private String name, color, model;
    private int ram, storage;

    public Laptop(String n, String c, String m, int r, int s){
        name = n;
        color = c;
        model = m;
        ram = r;
        storage = s;
    }

    public void power(boolean flag) {
        if(flag) System.out.println("Laptop Device Powered ON");
        else System.out.println("Laptop Device Powered OFF");
    }

    public void showDetails() {
        System.out.println("Laptop Details");
        System.out.println("\tBrand: "+ name);
        System.out.println("\tModel: " + model);
        System.out.println("\tRam: " + ram + "GB");
        System.out.println("\tStorage: " + storage + "GB");
        System.out.println("\tColor: " +  color);
    }
}
