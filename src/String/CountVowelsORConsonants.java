package String;

public class CountVowelsORConsonants {

	public static void main(String args[]) {
		String str = "aaVICKY";
		int v = 0;
		int c = 0;
		str = str.toLowerCase();

		for (char ch : str.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				// if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				if ("aeiou".indexOf(ch) != -1) {
					v++;
				} else if (ch == ' ') {
					continue;
				} else {
					c++;
				}
			}
			
		}
		System.out.print("Vowel is : " + v + "\nConsonants is : " + c);
	}
}
