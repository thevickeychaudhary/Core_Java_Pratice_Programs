package String;

public class RemoveDuplicate {

	public static void main(String arg[]) {
		String str1 = "avktechnologies";
		StringBuilder sb = new StringBuilder();

		for (char ch : str1.toCharArray()) {

			// if(sb.indexOf(String.valueOf(ch))== -1)
			// String.value of convert the char into string
			if (sb.indexOf("" + ch) == -1) {
				sb.append(ch);
			}

		}

		System.out.println(sb);

		System.out.println("Substring is : " + sb.substring(2, 7));

	}

}
