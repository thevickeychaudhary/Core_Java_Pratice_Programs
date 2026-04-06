package Inheritance;

class Math
{
	int sum(int x,int y) {
		return x+y;
	}
	
}

class Math2 extends Math
{
	int sum(int x,int y,int z)
	{
		return x+y;
	}
}

public class MethodOverloading {
	public static void main(String args[]) 
	{
	   Math2 m1 = new Math2();
	   
	   System.out.println(m1.sum(2,10));
	   System.out.println(m1.sum(2,5,4));
	}

}
