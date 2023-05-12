package observation;

public class ClonableInt {
    public static void main(String[] args) throws CloneNotSupportedException {
        Electronics e1 = new Electronics("Apple", "6s", 6, 128, 2);
        Electronics e2 = (Electronics) e1.clone();
        e2.setModel("XR");
        e2.setMem(8);

        e1.print();
        System.out.println();
        e2.print();
    }
}
class Memory implements Cloneable {
    private int ram, storage, gpu;
    Memory(int r, int s, int g){
        ram = r;
        storage = s;
        gpu = g;
    }
    public void print(){
        System.out.println("Memory:");
        System.out.println("\tRAM: " + ram + "GB");
        System.out.println("\tSTORAGE: " + storage + "GB");
        System.out.println("\tGPU: " + gpu + "GB");
    }
    public void setRam(int r){
        ram = r;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
class Electronics implements Cloneable {
    private String model, brand;
    private Memory mem;
    Electronics(String b, String m, int r, int s, int g){
       model = m;
       brand = b;
       mem = new Memory(r, s, g);
    }
    public void print(){
        System.out.println("Brand: \n\t" + brand);
        System.out.println("Model: \n\t" + model);
        mem.print();
    }
    public void setModel(String m){
        model = m;
    }
    public void setMem(int r){
        mem.setRam(r);
    }
    public Object clone() throws CloneNotSupportedException {
        Electronics e = (Electronics) super.clone();
        e.mem = (Memory) e.mem.clone();
        return e;
    }
}
