package Array;

public class SecondMaxArray {

	public static void main(String args[])
	{
		int arr[] = {10,-20,40,0,100};
		
		int max = Integer.MIN_VALUE;
		int secMax = Integer.MIN_VALUE;
		int thirdMax = Integer.MIN_VALUE;
		
		for(int i = 0;i<arr.length;i++)
		{
			
			if(arr[i]>max)
			{
				thirdMax=secMax;
				secMax=max;
				max=arr[i];
			}
		}
		System.out.println(max);
		System.out.println(secMax);
		System.out.println(thirdMax);
	}
}
