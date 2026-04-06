package Inheritance;

class Parent
{
	int x;
	int y;
	public Parent(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
	
	void greet()
	{
		System.out.println(" Parent greet guests");
	}
	
}

class Child extends Parent 
{
	//int x=90;
	int z;
	public Child(int x, int y,int z) 
	{
		super(x, y);
		this.z=z;
		
	}
	
	public 
    void sum()
    {
		super.greet();  // calling the super class method
    	System.out.println(super.x);
    	System.out.println(x+y+z);
    }
	
}

public class SimpleInheritance
{
   public static void main(String args[])
   {
	   Child c1 = new Child(10,40,90);
	   c1.sum();
	   
   }
}
