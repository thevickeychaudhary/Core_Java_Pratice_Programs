package String_RemoveDuplicate;

public class UsingBooleanArray {

	public static void main(String args[]) {
		String str = "aabcbcdea";

		boolean visited[] = new boolean[256];
		String result = "";

		for (char ch : str.toCharArray()) {
			if (!visited[ch]) {
				visited[ch] = true;
				result += ch;
			}
		}
		System.out.print(result);
	}

}
