package LamdaExpression;

import java.util.Scanner;

@FunctionalInterface
interface Car
{
	 void run(int speed);
}


public class demo1 {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		
		
		
		Car c1 = (speed)->
		{
			System.out.println("Car is running : "+(speed));
		};
		c1.run(s);
	}
}
