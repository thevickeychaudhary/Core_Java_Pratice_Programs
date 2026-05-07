package ExceptionHandling;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidAgeException extends Exception {
	public InvalidAgeException() {

	}

	public InvalidAgeException(String msg) {
		super(msg);
	}

}

public class UserDefineException {

	public static void main(String args[]) {
		
		
		Scanner sc = new Scanner(System.in);
		
		try(sc)
		{
			System.out.println("Enter your age");
			int age = sc.nextInt();
			validAge(age);
			
		}
		catch(InvalidAgeException e)
		{
			System.out.println("you are not allowd for movie");
		}
	}
		public static void validAge(int age) throws InvalidAgeException
		{
			if(age<18)
			{
				throw new InvalidAgeException("Age is invalid");
			}
			else
			{
				System.out.println("you are allowed for movie");
			}
		

	}
}
