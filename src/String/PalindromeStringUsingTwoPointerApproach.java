package String;

public class PalindromeStringUsingTwoPointerApproach {
	
	
	public static int isPlaindrome(String str)
	{
		int left = 0;
		int right = str.length()-1;
		
		while(left < right)
		{
			if(str.charAt(left)!=str.charAt(right))
			{
				return 0 ; // false
			}
			left++;
			right--;
		}
		return 1; // true
	}
	
	
	
	public static void main(String args[])
	{
		String str = "madaam";
		
		
		System.out.println(isPlaindrome(str));
		
		
	}

}
