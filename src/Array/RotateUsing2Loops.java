package Array;

public class RotateUsing2Loops {

	public static void main(String args[]) {
		int arr[] = { 10, 20, 30, 50, 60, 70 };
		int k = 3;
		int n = arr.length;
		int temp[] = new int[n];
		int j = 0;
		for(int i = k; i < n; i++) {
			temp[j] = arr[i];
			j++;
		}
		j = 0;
		
		for(int i = k; i< n; i++) {
			temp[i]= arr[j];
			j++;
		}
		for(int i : temp) {
			System.out.println(i);
			
		}

	}

}
