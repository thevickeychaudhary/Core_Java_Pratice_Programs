package Abstraction;

interface Shape{
	void calArea();
	default void area()
	{
		System.out.println("this is default method");
	}
	static void width()
	{
		System.out.println("This is static method");
	}
}
class Circle implements Shape
{
   private int r=2;
	@Override
	public void calArea() {
		Shape.super.area();
		System.out.println("Circle area is "+r*r);
		
	}
	
}




public  class InterFaceDemo {
        
	public static void main(String args[])
	{
		Circle s = new Circle();
		s.calArea();
		s.area();
		Shape.width();
		
	}
}