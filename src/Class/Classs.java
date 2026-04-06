package Class;

class Add {
	int x; // instance variable or class level variable
	int y;
	int u;
	final int z;
	static int a=80;

	{
		
		z = 50;
	   a=20;
	}
    public Add()
    {
    	this(6,7);
    	//print(this); paasing cuurent object using this
    }
	public Add(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	//	z=10;
	}
	
	public void sum() 
	{
		 a=100;
		// z = 20;  // Final variable re assignment not possible 
		System.out.println("Sum of two number : " + (x+y+u));
		System.out.println("Final Variable Value  : " + z);
		System.out.println("static Variable Value  : " + a);

	}
	void print(Add a)
	{
		System.out.println("Passing current Object");
	}
	
	void show ()
	{
		print(this);
	}

}

public class Classs {
	public static void main(String args[]) {
		System.out.println("Welcome to class entity");

		Add a1 = new Add(5,5); // object
		Add a2 = new Add(); // object
		a1.sum();
		a2.sum();
		a2.show();

	}
}
