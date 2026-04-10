package LamdaExpression;

class Emp<T> {
	private T sal;

	public Emp(T sal) {
		this.sal = sal;
	}

	public T getData() {
		return this.sal;

	}
}

public class TypeParameterDemo1 {

	public static void main(String args[]) {
		Emp<Integer> emp = new Emp<Integer>(1000);
		System.out.println(emp.getData());
	}
}
