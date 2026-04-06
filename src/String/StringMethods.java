package String;

public class StringMethods {

	public static void main(String args[]) {
		String s1 = "Vicky Kaushal";
		String s2 = "Chaudhary";

		// isempty()
		System.out.println(s1.isEmpty());
		// length()
		System.out.println(s1.length());
		// replace()
		System.out.println(s1.replace("V", "M"));
		// substring(int beginIndex)
		System.out.println(s1.substring(1));
		// substring(int beginIndex, int endIndex)
		System.out.println(s1.substring(1, 3));
		// indexof(char ch)
		System.out.println(s1.indexOf("V"));
		// lastindexOf(Char ch) = when duplicate char available then show last char
		System.out.println(s1.lastIndexOf("i"));
		// toLowerCase()
		System.out.println(s1.toLowerCase());
		// toUperCase()
		System.out.println(s1.toUpperCase());
		// trim() = remove first and last space only
		System.out.println("Trim method :" + s1.trim());
		// charAt(int index)
		System.out.println("Char method :" + s1.charAt(2));

		// intern() => forceful put the str string into scp
		String str1 = new String("JAVA");
		String str2 = str1.intern();
		String str3 = "JAVA";

		System.out.println(str2 == str3);// true

		// split
         String str4 = "a,b,c,d,e" ;
	   String []words = str4.split(",");
	   for(String w : words)
	   {
		   System.out.print(w);
	   }
	   
	      	
	}
}
