package String;

public class PalindromeUsingStringBuilder {

	public static void main(String args[]) {
		String str = "vicky";
		String rev = new StringBuilder(str).reverse().toString();

		// System.out.println(rev);

		if (str.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}

	}

}
