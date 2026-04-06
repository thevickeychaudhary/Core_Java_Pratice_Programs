package Abstraction;

interface Superf {

	int x=14;// by default public static final
	
	void car();
	
	static void home()
	{
		System.out.println("he has own home");
	}
	
	default void  get() {
		System.out.println("He has get new Field");
	}
	
	
}

class Subf implements Superf {

	@Override
	public void car() {
		System.out.println("Sub class runnig the car : "+x);
		
	}
	

}

public class InterfaceDemo1 {
	public static void main(String args[]) {
		
		
		Superf sf = new Subf();
		//Subf sf = new Subf();
		sf.car();
        sf.get();	
        Superf.home();

	}

}
