package observation;

public class Products {
    private int id;
    private int count, sold;
    private double amount;

    Products(){
        id = 0;
        count = 0;
        sold = 0;
        amount = 0;
    }

    Products(Products p){
        id = p.id;
        amount = p.amount;
        count = p.count;
        sold = p.sold;
    }

    Products(int count, int sold, double amount) {
        id = id + 1;
        this.count = count;
        this.sold = sold;
        this.amount = amount;
    }

    public static Products freqSold(Products[] p){
        int max = p[0].sold;
        int ind = 0;
        for(int i=0;i<p.length;i++){
            if(p[i].sold > max){
                max = p[i].sold;
                ind = i;
            }
        }
        return new Products(p[ind]);
    }
    
    public void displayAll(Products[] s){
    	for(int i=0;i<s.length;i++){
    		s[i].display();
    	}
    }

    public void display(){
        System.out.println("Product Id: " + (id+1) + "\nAmount: " + amount + "\nAvailable: " + count + "\nSold: " + sold);
    }
}

