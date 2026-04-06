package Abstraction;

interface Alpha {
	void m1();

	default void Home() {
		System.out.println("Alpha default ");
	}
	
	static void m2() {
		System.out.println("static m2 method");
	}
}

interface Beta {
	void m1();

	default void Home() {
      System.out.println("Beta default ");
	}
	
}

class Gamma implements Alpha, Beta {

	@Override
	public void m1() {

		
		System.out.println("Multiple inheritance in gamma ");

	}

	@Override
	public void Home() {
	    Alpha.m2();  // call staitc method 
		Alpha.super.Home();
		Beta.super.Home();
	}

}

public class MultipleInheritance {
	public static void main(String args[]) {
		Gamma g = new Gamma();
		g.m1();
		g.Home();
		Alpha.m2();
	
	}

}
