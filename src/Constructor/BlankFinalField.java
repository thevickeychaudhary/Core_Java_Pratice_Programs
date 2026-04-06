package Constructor;

class Stuednt {
	final int id;

	Stuednt() {

		System.out.println("Constructor : " + id);

	}

	{
		id = 20;
		System.out.println("Non static Block : " + id);
	}
}

public class BlankFinalField {
	public static void main(String args[]) {
		Stuednt s1 = new Stuednt();
	}
}
