package String;

final class Test {
	int x;

	Test(int x) {
		this.x = x;
	}

	public Test modify(int i) {
		if (this.x == i) {
			return this;
		} else {
			return new Test(i);
		}
	}

}

public class CustomImmutableString {

	public static void main(String args[]) {
		
		Test t1 = new Test(10);
		Test t2 = t1.modify(100);
		
		
		System.out.println(t1==t2);
		

	}
}
