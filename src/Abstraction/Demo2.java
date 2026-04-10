package Abstraction;

abstract class Tv {

	int price;

	abstract void turnOn();

	abstract void turnOf();

	public Tv(int price) {
		System.out.println("Price of tv" + price);
	}

	public void Button() {

	}
}

class Remote extends Tv {

	public Remote(int price) {
		super(price);

	}

	@Override
	void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("Turn on Tv");

	}

	@Override
	void turnOf() {
		System.out.println("Turn of tv");

	}

}

public class Demo2 {
	public static void main(String args[]) {

		Tv t1 = new Remote(10000);

		t1.turnOf();
		t1.turnOn();
	}
}
