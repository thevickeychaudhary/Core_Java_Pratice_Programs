package Array;

import java.util.Scanner;

public class UserInput {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		// int arr[] = {10,20,30,40};
		// int arr1[];
		int arr[] = new int[5];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int num : arr) {
			System.out.print(num + " ");
		}

	}

}
