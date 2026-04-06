package LamdaExpression;

import java.util.function.Consumer;

public class ConsumerDemo1 {

	public static void main(String[] args) {
		
		Consumer<Integer> sum = (a)->
		System.out.println(a);	
		sum.accept(10);
	}
}
