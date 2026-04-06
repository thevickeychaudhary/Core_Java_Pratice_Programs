package Array;

public class ArrDeclaration {
	public static void main(String args[]) {

		// Array declaration
		
		int arr[] = { 80, 10, 29, 5 };

		String arr1[] = { "Manoj", "Vicky", "Gaurav", };

		int arr2[] = new int[5];

		int arr3[] = new int[] { 20, 30, 40, 50, 120 };

		Student st[] = new Student[2];

		st[0] = new Student(1, "Vicky", "Bharatpur");
		st[1] = new Student(2, "Manoj", "Telgana");

		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i].id+ " "+st[i].name+" "+st[i].address);
		}

	}
}

class Student {
	int id;
	String name;
	String address;

	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}

}