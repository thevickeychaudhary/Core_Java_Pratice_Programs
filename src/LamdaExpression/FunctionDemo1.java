package LamdaExpression;

import java.util.function.Function;

public class FunctionDemo1 {

	 public static void main(String args[])
	 {
		 Function<String,String > f1 = (str)-> str.concat("chaudhary");
		 
		 System.out.println(f1.apply("vicky"));
	 }
}
