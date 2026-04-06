package String_RemoveDuplicate;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDupLinkHashSet {

	public static void main(String[] args) {

		String str = "Programming";

		HashSet<Character> hs = new LinkedHashSet<Character>();

		for (char ch : str.toCharArray()) {
			hs.add(ch);

		}
//		StringBuilder sb = new StringBuilder();
//		for (char c : hs) {
//			sb.append(c);
//		}
//		System.out.println(sb);
		
		hs.stream().forEach(System.out::print);
	}
}
