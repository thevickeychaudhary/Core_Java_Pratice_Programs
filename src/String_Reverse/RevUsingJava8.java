package String_Reverse;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class RevUsingJava8 {

	public static void main(String[] args) {

		String str = "vicky";

		// convert string to int format
		IntStream s1 = str.chars();

		// conver int to char form
		Stream<Character> s2 = s1.mapToObj(c -> (char) c);
	

		String reversed = s2.reduce("", (partial, c) -> c + partial, // accumulator (prepend char)
				(s1p, s2p) -> s2p + s1p); // combiner (for parallel streams)

		System.out.println(reversed);

//		String reverse = str.chars()
//				.mapToObj(c->(char)c)
//				.reduce("",(s,c)->c+s,(s1,s2)->s1+s1);
//		
//		System.out.println(reverse);

	}

}
