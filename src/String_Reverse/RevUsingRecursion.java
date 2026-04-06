package String_Reverse;

public class RevUsingRecursion {

	public static String reverse(String str) {

		if (str.isEmpty()) {

			return str;
		}
        // System.out.println(str);
        // System.out.println(str.charAt(0));
		return reverse(str.substring(1)) + str.charAt(0);

	}

	public static void main(String args[]) {

		String str = "vicky";
       
		System.out.println(reverse(str));

	}
}
