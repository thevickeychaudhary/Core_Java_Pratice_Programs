package LamdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredifineFunctionInterfaceDemo {

	public static void main(String args[]) {
		Predicate<Integer> prime = num -> {
			for (int i = 0; i <= num / 2; i++) {
				if (num % 2 == 0) {
					return false;
				}
			}
			return true;

		};
		System.out.println(prime.test(3));

		Consumer<String> Area = ch -> {
			System.out.println(ch);
		};
		Area.accept("ram");

		Function<Integer, Integer> div = (num) -> {
			return num / 2;

		};
		System.out.println(div.apply(20));

		Supplier<List> s1 = () -> {
			List<String> list = new ArrayList<>();
			list.add("vicky");
			list.add("Ram");
			list.add("Shyam");
			list.add("Ravi");
			list.add("Suresh");

			return list;
		};
		System.out.println(s1.get());
	}
}
