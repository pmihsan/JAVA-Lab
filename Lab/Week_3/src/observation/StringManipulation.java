package observation;

import java.util.Scanner;

public class StringManipulation {
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = in.next();
  
        Palindrome p = new Palindrome(s);
        System.out.println("For String '" + p.str + "' Palindrome - " + p.isPalindrome());
        
        Palindrome q = new Palindrome();
        System.out.println("For String '" + q.str + "' Palindrome - " + q.isPalindrome());
        in.close();
    }
    public static class Palindrome{
        String str;
        Palindrome(){
            str = "empty";
        }
        Palindrome(String s){
            str = s;
        }
        private String reverse(){
            String t = "";
            for(int i=str.length()-1;i>=0;i--){
                t += str.charAt(i);
            }
            return t;
        }

        public boolean isPalindrome(){
            return str.equals(reverse());
        }
    }
}
