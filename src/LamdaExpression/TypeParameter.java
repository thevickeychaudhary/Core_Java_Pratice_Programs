package LamdaExpression;

class Bank<T> {
	// private int i;
	private T data;

	public Bank(T data) {
		this.data = data;
	}

	public T getData() {
           return this.data;
	}

}

public class TypeParameter {
	public static void main(String args[]) {
		Bank<Integer> b = new Bank<Integer>(10);
		System.out.println(b.getData());
		
		Bank<String> s1 = new Bank<String>("Bank Accept Payment");
		System.out.println(s1.getData());
	}
}
