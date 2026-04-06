package Abstraction;

abstract class Super {
    String s ;
	public Super(String s)
	{
		this.s=s;
		System.out.println("Super Class Constructor ");
	}
	public void getHome()
	{
		System.out.println("He has own House ");
	}
	
	public abstract void property(); // abstarct method 
}

class Sub extends Super {

	   int x;
	public Sub(String s,int x)
	{
		super(s);
		this.x=x;
		System.out.println("Sub class Constructor ");
	}

	@Override
	public void property() {
           System.out.println("Child Property");
	}

}

public class Demo1 {
	public static void main(String args[]) {
          
	   System.out.println("main method");
		Sub s1 = new Sub("vicky",600);
		
		s1.property();
		s1.getHome();
	}

}
