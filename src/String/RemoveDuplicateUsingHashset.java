package String;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class RemoveDuplicateUsingHashset {

	public static void main(String args[]) {

		String str = "avktechnologies";

		HashSet<Character> set = new LinkedHashSet<Character>();

		for (char ch : str.toCharArray()) {
			set.add(ch);
		}
		System.out.println(set);
		
		StringBuilder sb = new StringBuilder();
		
		for(char ch : set)
		{
			sb.append(ch);
		}
		System.out.println(sb);
	}
     
}
