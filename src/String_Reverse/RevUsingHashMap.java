package String_Reverse;

import java.util.HashMap;

public class RevUsingHashMap {
	public static void main(String args[]) {
		String str = "hyderabad";

		HashMap<Integer, Character> map = new HashMap<Integer, Character>();

		for (int i = 0; i < str.length(); i++) {
			map.put(i, str.charAt(i));
		}

		System.out.println(map);

		StringBuilder sb = new StringBuilder();
		
		  for (int i = str.length() - 1; i >= 0; i--) {
	            sb.append(map.get(i));
	        }
		  System.out.println(sb);
		

	}
}
