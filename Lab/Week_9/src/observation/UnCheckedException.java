package observation;

public class UnCheckedException {
    public static void main(String[] args) {
        try{
            String[] s = {"0", "5"};
            division(s);
        }
        catch(ArithmeticException ae){
            System.out.println("Arithmetic Exception: " + ae.getMessage());
        }
        finally {
            System.out.println("Program Exiting...");
        }
    }
    public static void division(String[] s){
        double res = 0;
        try{
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            res = y / x;
            System.out.println("Division Success - " + res);
        }
        catch(ArrayIndexOutOfBoundsException ai){
            throw new ArrayIndexOutOfBoundsException("Not Enough Arguments");
        }
        catch(IllegalArgumentException iae){
            throw new IllegalArgumentException("Not Valid Arguments");
        }
        finally {
            System.out.println("Function Exiting...");
        }
    }
}