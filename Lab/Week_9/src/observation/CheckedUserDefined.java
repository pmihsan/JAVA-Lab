package observation;

public class CheckedUserDefined {
    static String[] products = {"Mobile", "PC", "IOT", "TV", "Laptop"};
    static int validKey = products.length;

    public static void main(String[] args) throws ProductNotFound {
        try{
            convert("7");
        }
        catch(Exception e){
            System.out.println("Exception -> " + e.getMessage());
        }
        finally{
            System.out.println("Program Exited");
        }
    }

    public static void convert(String key) throws ProductNotFound{
        try{
            int k = Integer.parseInt(key);
            check(k);
        }
        catch(NumberFormatException ne){
            throw new NumberFormatException("NumberFormatException: " + ne.getMessage());
        }
    }

    public static void check(int i) throws ProductNotFound{
        if(i > 0 && i <= validKey){
            System.out.println("Valid Key");
            System.out.println("Requested Product is " + products[i-1]);
        }
        else{
            throw new ProductNotFound("ProductNotFoundException: " + "Product key Invalid");
        }
    }

	public static class ProductNotFound extends Exception{
        public ProductNotFound(String s){
            super(s);
        }
    }
}
