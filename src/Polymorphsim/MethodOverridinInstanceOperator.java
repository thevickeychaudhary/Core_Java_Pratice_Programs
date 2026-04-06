package Polymorphsim;

class MakeMyTrip {

	public void payment(int amt) {
		System.out.println("Payment receive successfull");
	}

}

class Train extends MakeMyTrip {
	@Override
	public void payment(int amt) {
		System.out.println("Train ticket Payment "+amt+" receive successfull");
	}

}

class Bus extends MakeMyTrip {
	@Override
	public void payment(int amt) {
		System.out.println("Bus Ticket Payment "+amt+" receive successfull");
	}

}

class Flight extends MakeMyTrip {
	@Override
	public void payment(int amt) {
		System.out.println("Flight Ticket Payment "+amt+" receive successfull");
	}

}

public class MethodOverridinInstanceOperator {
	public static void main(String args[]) {

		MakeMyTrip m1 = null;
		m1 = new Train();
		booking(m1);

		System.out.println("----------------------");

		m1 = new Bus();
		booking(m1);

		System.out.println("-----------------------");

		m1 = new Flight();
		booking(m1);

	}

	public static void booking(MakeMyTrip m1) {

		if (m1 instanceof Train) {
			Train t = (Train) m1;
			t.payment(1000);
		} else if (m1 instanceof Bus) {
			Bus s = (Bus) m1;
			s.payment(100);
		} else if (m1 instanceof Flight) {
			Flight f = (Flight) m1;
			f.payment(50000);
		}

	}

}
