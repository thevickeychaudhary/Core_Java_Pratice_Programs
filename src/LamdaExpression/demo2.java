package LamdaExpression;

@FunctionalInterface
interface bike {
	void run();

	default void avg(int a) {
         System.out.println("The Avg is "+a+" per hour");
	}

	static void speed(int b) {
          System.out.println("Speed is also maximum is :"+b);
	}
}

public class demo2 {

	public static void main(String args[])
	{
		bike b1 = ()->
		{
			System.out.println("Bike is running");
		};
		b1.run();
		b1.avg(70);
		bike.speed(120);
		
	}
}
