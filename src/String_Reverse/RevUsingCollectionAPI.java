package String_Reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RevUsingCollectionAPI {
	public static void main(String args[]) {
		String str = "vicky";

		List<Character> list = new ArrayList<>();

		for (char c : str.toCharArray()) {
			list.add(c);
		}
		Collections.reverse(list);

		StringBuffer sb = new StringBuffer();

		for (char c1 : list) {
			sb.append(c1);
		}

		System.out.println(sb);

	}
}
