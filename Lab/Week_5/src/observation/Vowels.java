package observation;

public class Vowels {
    public static void main(String[] args) {
        String s = "This is a very long string for counting vowels";
        String[] arr = s.split(" ");
        for(int i=0;i< arr.length;i++){
            int v = 0;
            if(arr[i].contains("a")) v++;
            if(arr[i].contains("e")) v++;
            if(arr[i].contains("i")) v++;
            if(arr[i].contains("o")) v++;
            if(arr[i].contains("u")) v++;
            System.out.println(arr[i] + " contains " + v + " vowels");
        }
    }
}