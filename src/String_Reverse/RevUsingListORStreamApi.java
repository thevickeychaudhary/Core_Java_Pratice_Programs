package String_Reverse;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class RevUsingListORStreamApi {

	public static void main(String args[])
	{
		String str = "hyderabad";
		
		List<Character> list = new LinkedList<>();
		
		for(char ch : str.toCharArray()){
			list.add(ch);
		}
		
		Collections.reverse(list);
		
		String rev = list.stream().map(String::valueOf).reduce("",String::concat);
		
		System.out.print(rev);
	}
	
}
