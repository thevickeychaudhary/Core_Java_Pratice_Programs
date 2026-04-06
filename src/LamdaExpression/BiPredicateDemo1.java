package LamdaExpression;

import java.util.function.BiPredicate;

public class BiPredicateDemo1 {
     public static void main(String args[])
     {
    	 
    	 
    	 BiPredicate<Integer,Integer> sum =  (a,b)-> a+b==10;
    	 
    	 System.out.println(sum.test(5,5));
     }
}
