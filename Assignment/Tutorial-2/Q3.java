public class Q3 
{
	public static void main(String[] args) {
	    String s1 = "Hello";
	    String s2 = "World";
		String s = new String("new string");
		String s3 = s1 + s2;
        // String s4 = s1 - s2; // Wrong Not Possible
        System.out.println(s1 == s2);
        // System.out.println(s1 >= s2); // Wrong Not Possible
        System.out.println(s1.compareTo(s2));
        int i = s1.length();
        // char c1 = s1(0); // Wrong Not Possible
        // char c2 = s1.charAt(s1.length()); // Exception Last index must be 1 less than Length
	} 
}
