package Abstraction;

//@FunctionalInterface
interface Bank {
	void m1();
}

class CreditCard implements Bank {

	@Override
	public void m1() {

		System.out.println("Functional interface ");

	}

}

public class FunctionalInterface {
	public static void main(String args[]) {
		CreditCard c1 = new CreditCard();

		c1.m1();

		// anonymous inner class
		CreditCard payment = new CreditCard() {
			@Override
			public void m1() {
				System.out.println("Anonymous inner class ");

			}
		}; payment.m1();

	}
}
