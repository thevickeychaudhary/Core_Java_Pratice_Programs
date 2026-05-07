package String;

public class StringCharFrequencyCount {

	public static void main(String args[]) {

		String s = "programming";

		int[] arr = new int[256];

		for (int i = 0; i < s.length(); i++) {
			arr[s.charAt(i)]++; // put in array ascii value form
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0) // if frequency is zero then do not enter in 
			{
				System.out.print((char)i+""+arr[i]+" ");
			}
		}

	}
}
