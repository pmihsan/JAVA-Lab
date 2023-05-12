package observation;

public class Name {
    String name;
    Name(String n){
        name = n;
    }
    synchronized void printChar(){
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
        System.out.println();
    }

     synchronized static void printLetters(String cpy){
        for(int i=0;i<cpy.length();i++){
            System.out.println(cpy.charAt(i));
            try {
                Thread.sleep(500);
            }
            catch(InterruptedException ie){
                System.out.println(ie.getMessage());
            }
        }
        System.out.println();
    }
}
