package observation;

public class DistinctChar {
    public static void main(String[] args) {
        String s = "hello world";
        int[] count = new int[26];
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) >= 97 && s.charAt(i) <= 122)
                count[s.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if(count[i] == 1){
                System.out.print((char)(i+'a') + " ");
            }
        }
        System.out.println();
    }
}