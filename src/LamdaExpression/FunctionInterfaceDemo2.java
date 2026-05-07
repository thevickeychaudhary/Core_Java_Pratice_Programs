package LamdaExpression;

@FunctionalInterface
interface Numbers {
	void calculate(int a, int b);
}

public class FunctionInterfaceDemo2 {

	public static void main(String args[]) {

		Numbers sum = (int a, int b) -> System.out.println("sum is : " + (a + b));
		sum.calculate(2, 3);
		
		Numbers div = (a,b) -> System.out.println("div is "+(a-b));
		div.calculate(10, 5);
	}
}
