package LamdaExpression;

import java.util.function.BinaryOperator;

public class BinaryOperatorDemo1 {
	
	public static void main(String args[])
	{
		BinaryOperator<String> s1 = (srt1,str2)->
		{
			String s2 = new String();
			String s3= s2.concat(srt1);
			String s4 = s3.concat(str2);
		 
		return s4;
		};
		System.out.println(s1.apply("vicky","chaudhary"));
		
	}

}
