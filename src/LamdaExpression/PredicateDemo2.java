package LamdaExpression;

import java.util.function.Predicate;

public class PredicateDemo2 {

	public static void main(String[] args) {
		
		Predicate<String> s1 = str-> str.startsWith("A");
		
		System.out.println(s1.test("Vicky"));

	}

}
