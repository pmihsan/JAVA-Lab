package execution;

import java.io.*;

public class Encryption {
    public static void main(String[] args) {
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            System.out.println("Enter input and output file name");
            String file = br.readLine();
            String out = br.readLine();

            File fin = new File("D:\\Users\\sfl41\\Desktop\\Java-Lab-3540\\Week_12\\src\\execution\\" + file);
            File fout = new File("D:\\Users\\sfl41\\Desktop\\Java-Lab-3540\\Week_12\\src\\execution\\" + out);

            FileInputStream fis = new FileInputStream(fin);
            FileOutputStream fos = new FileOutputStream(fout);

            int data = fis.read();
            while(data != -1){
                data += 5;
                fos.write(data);
                data = fis.read();
            }
            System.out.println("File: " + out + " - Encrypted");
        }
        catch (IOException ioe){
            System.out.println(ioe.getMessage());
            ioe.printStackTrace();
        }
    }
}
