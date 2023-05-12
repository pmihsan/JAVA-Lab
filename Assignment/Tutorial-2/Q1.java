import java.util.Arrays;
public class Q1
{
	public static void main(String[] args) {
	    System.out.println("-------------------------------------------------------------------------");
	    System.out.println("QUESTION: 1");
		String s1 = "Welcome to Java";
		String s2 = s1;
		String s3 = new String("Welcome to Java");
		String s4 = "Welcome to Java";
		String w1 = "Welcome    ";

		System.out.println("s1 -> " + s1);
		System.out.println("s2 -> " + s2);
		System.out.println("s3 -> " + s3);
		System.out.println("s4 -> " + s4);
		System.out.println("w1 -> " + w1);
		System.out.println();
		
		System.out.println("a)s1 == s2 -> " + (s1 == s2));
		System.out.println("b)s2 == s3 -> " + (s2 == s3));
		System.out.println();
		
		System.out.println("c)s1.equals(s2) -> " + (s1.equals(s2)));
		System.out.println("d)s2.equals(s3) -> " + (s2.equals(s3)));
		System.out.println();
		
		System.out.println("e)s1.compareTo(s2) -> " + (s1.compareTo(s2)));
		System.out.println("f)s2.compareTo(s3) -> " + (s2.compareTo(s3)));
		System.out.println();
		
		System.out.println("g)s1 == s4 -> " + (s1 == s4));
		System.out.println("h)s1.charAt(0) -> " + (s1.charAt(0)));
		System.out.println();
		
		System.out.println("i)s1.indexOf('j') -> " + (s1.indexOf('j')));
		System.out.println("j)s1.indexOf(\"to\") -> " + (s1.indexOf("to")));
		System.out.println();

        System.out.println("k)s1.lastIndexOf('a') -> " + (s1.lastIndexOf('a')));
		System.out.println("l)s1.lastIndexOf(\"o\", 15) -> " + (s1.lastIndexOf("o", 15)));
		System.out.println();
				
        System.out.println("m)s1.length() -> " + s1.length());
        System.out.println("n)s1.substring(5) -> " + s1.substring(5));
        System.out.println("o)s1.substring(5,11) -> " + s1.substring(5,11));
        System.out.println();
        
        System.out.println("p)s1.startsWith(\"Wel\") -> " + s1.startsWith("Wel"));
        System.out.println("q)s1.endsWith(\"Java\") -> " + s1.endsWith("Java"));
        System.out.println();
        
        System.out.println("r)s1.toLowerCase() -> " + s1.toLowerCase());
        System.out.println("s)s1.toUpperCase() -> " + s1.toUpperCase());
        System.out.println();
        
        System.out.println("t)\"Welcome  \".trim() -> " + w1.trim());
        System.out.println();
        
        System.out.println("u)s1.replace('o', 'T') -> " + s1.replace('o', 'T'));
        System.out.println("v)s1.replaceAll(\"o\", \"T\") -> " + s1.replaceAll("o", "T"));
        System.out.println("w)s1.replaceFirst(\"o\", \"T\") -> " + s1.replaceFirst("o", "T"));
        System.out.println();
        
        System.out.println("x)s1.toCharArray() -> " + Arrays.toString(s1.toCharArray()));
        System.out.println();
        
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("QUESTION: 2");
        System.out.println("a)s1.replace(\"o\", \"abc\") -> " + s1.replaceAll("o", "abc"));
        System.out.println("-------------------------------------------------------------------------");
	}
}
