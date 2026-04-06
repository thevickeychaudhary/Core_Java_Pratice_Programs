package LamdaExpression;

import java.util.Scanner;
import java.util.function.BiFunction;

public class BifunctionDemo1 {
	public static void main(String args[]) {

		BiFunction<Integer, Integer, Integer> bi = (a, b) -> {

			return a + b;

		};
		Scanner sc = new Scanner(System.in);
		Integer num1 = sc.nextInt();
		Integer num2 = sc.nextInt();
		System.out.println(bi.apply(num1, num2));
	}

}
