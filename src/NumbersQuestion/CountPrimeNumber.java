package NumbersQuestion;

import java.util.Scanner;

public class CountPrimeNumber {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int num = sc.nextInt();
		
		int count = 0 ;
		
		for(int n=1;n<=num;n++)
		{
			if(n<=1)continue;
			boolean isprime = true;
			
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime)
			{
				System.out.print(n+",");
				count++;
			}
		}
		System.out.println();
		System.out.println("Total prime number :"+count );

	}

}
