package LamdaExpression;

import java.util.function.UnaryOperator;

public class UnaryOperatorDemo1 {

	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> square = a->  a*a;	
		;
		System.out.println(square.apply(5));
		
      
	}

}
