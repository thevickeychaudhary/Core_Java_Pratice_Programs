package Constructor;

class Employee {
	String name;
	int id;

	Employee(String name, int id) {
	
		System.out.println("Employee name :" + name + " Employee id : " + id);

	}

	Employee(int id) {
		this("ram", 100);

		System.out.println(" Employee id : " + id);
	}
}

public class ConstructorOverloading {

	public static void main(String args[]) {

		Employee e1 = new Employee(5);

	}

}
