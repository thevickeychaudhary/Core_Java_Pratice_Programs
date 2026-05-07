package NumbersQuestion;

public class SumUntilSingleDigit {

	public static void main(String args[]) {
		int num = 456979;
		int sum = 0;
		while (num > 9) {
			//int sum = 0;  // get last digit

			while (num > 0) {
				sum+= num % 10;
				num = num / 10;
			}
			//num = sum;   // get list digit
		}
		System.out.println(sum);
	}

}
