package LamdaExpression;

import java.util.function.Supplier;

public class SupplierDemo1 {

	public static void main(String[] args) {

       Supplier<String> s1 = ()->  "vicky";
       
       System.out.println("Sum is: "+s1.get());

	}

}
