package NumbersQuestion;

public class ArmStrongNumber {
	public static void main(String args[])
	{
		int num=133;
		int temp=num;
		int rev = 0;
		while(num>0)
		{
			int digit = num%10;
			rev = rev+digit*digit*digit;
			num=num/10;
			
		}
		if(temp==rev)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.print("not Armstrong number");
		}
	}

}
