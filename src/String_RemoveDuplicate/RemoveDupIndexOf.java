package String_RemoveDuplicate;

public class RemoveDupIndexOf {
	public static void main(String args[]) {
		String str = "programming";

		StringBuilder sb = new StringBuilder();

		for (char ch : str.toCharArray()) {
			
			// if(sb.indexOf(String.valueOf(ch))== -1)
			// String.value of convert the char into string 
			if (sb.indexOf(""+ch) == -1) {
				sb.append(ch);
			}
		}
		System.out.println(sb);

	}
}
