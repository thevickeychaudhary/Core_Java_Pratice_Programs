package Array;

import java.util.Arrays;

public class RevUsingRecursion {

	public static void main(String args[]) {
		int arr[] = { 89, 67, 77, 89, 49 };

		int start = 0;
		int end = arr.length - 1;

		reverseArr(arr, start, end);
		System.out.println(Arrays.toString(arr));

	}

	public static void reverseArr(int arr[], int start, int end) {
		if (start >= end)
			return;
		int temp = arr[end];
		arr[end] = arr[start];
		arr[start] = temp;
		start++;
		end--;

		reverseArr(arr, start + 1, end - 1);

	}

}
