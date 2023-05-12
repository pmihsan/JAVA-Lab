package observation;

public class Shape {
    private int l,b;

    Shape(){
        l = 0;
        b = 0;
    }

    Shape(int l, int b) {
        this.l = l;
        this.b = b;
    }

    Shape(Shape s){
        l = s.l;
        b = s.b;
    }

    private int getArea(){
        return l * b;
    }

    public static Shape[] getSame(Shape[] s){
        Shape[] same = new Shape[2];
        same[0] = new Shape();
        same[1] = new Shape();
        int f = 0;
        for(int i=0;i<s.length-1;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i].getArea() == s[j].getArea()){
                    same[0] = new Shape(s[i]);
                    same[1] = new Shape(s[j]);
                    f = 1;
                    break;
                }
            }
            if(f == 1) break;
        }
        return same;
    }

    public void display(){
        System.out.println("Rectangle \nLength: " + l + "\nBreadth: " + b);
    }
}
