package LamdaExpression;

import java.util.function.BiConsumer;

public class BiConsumerDemo1 {
	public static void main(String args[]) {
		BiConsumer<Integer, Integer> mul = (a, b) -> {
			a = a + 10;
			b = b + 4;
			System.out.println(a + " " + b);
		};
		int a = 2, b = 8;

		mul.accept(a, b);

		System.out.println("here we don't change update value :" + a + " " + b); // a=2 , b=8

	}

}
