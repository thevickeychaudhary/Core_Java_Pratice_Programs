package Array;

public class SubArraySum {

	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4 };
		int k = 5;
		int count = 0;
		

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			String str = "";
			for (int j = i; j < arr.length; j++) {
				sum += arr[j];
				str += arr[j]+" ";
				if (sum < 5) {
					
					count++;
					System.out.print("["+str.trim()+"]");
				}

			}
		}
	    System.out.println();
		System.out.println(count);
	}

}
