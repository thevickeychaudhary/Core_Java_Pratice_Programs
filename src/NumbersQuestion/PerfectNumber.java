package NumbersQuestion;

public class PerfectNumber {
	public static void main(String args[]) {

		int n = 7;

		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum += i;
			}
		}
		if (n == sum) {
			System.out.println("Perfect Number");

		} else {
			System.out.println("not Perfect Number");
		}

	}

}
