package Array;

import java.util.Scanner;

public class RotateArrayFromKthElements {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 10, 20, 30, 40, 50, 60 };
        int n = arr.length;
        int temp[] = new int[n];
		int k = sc.nextInt();
		
		for(int i=0 ; i<n;i++)
		{
			temp[(i+k)%n]=arr[i];
		}
		
		for(int t:temp)
		{
			System.out.print(t+" ");
		}
		
		
		
		
		
		
	}

}
