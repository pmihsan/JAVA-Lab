package execution;

import java.io.*;

public class FileManipulation {
    public static void main(String[] args) {
        try{
            File f = new File("D:\\Users\\sfl41\\Desktop\\Java-Lab-3540\\Week_12\\src\\execution\\Test.dat");
            FileOutputStream fos = new FileOutputStream(f, false);
            DataOutputStream dos = new DataOutputStream(fos);
            if(f.createNewFile()){
                System.out.println("Test.dat File Created");
            }
            else{
                System.out.println("Test.dat Already Exists");
            }
            System.out.println("Generating Random 100 numbers");
            for (int i = 0; i < 100; i++) {
                dos.write((int) (100 * Math.random()));
            }
            DataInputStream dis = new DataInputStream(new FileInputStream(f));
            int sum = 0;
            for(int i=0;i<100;i++){
                sum += dis.read();
            }
            System.out.println("Sum of 100 random integers is " + sum);
            f.deleteOnExit();
        }
        catch(IOException ioe) {
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }
    }
}
