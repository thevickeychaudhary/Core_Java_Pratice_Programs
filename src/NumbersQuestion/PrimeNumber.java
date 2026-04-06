package NumbersQuestion;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		boolean isprime = true;
		if (num == 1) {
			System.out.println("it is special number not prime or composite");
			System.exit(0);
		}
		for (int i = 2; i <= num / 2; i++) {
			
			if(num % 2 == 0) {
				isprime = false;
				break;
			}
		}
		System.out.println(isprime);

	}

}
