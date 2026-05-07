package String;

public class RemoveSpecialCharacter {
	
	public static void main(String args[])
	{
		String str = "@j#av$a17&%";
		
		String str1 = str.replaceAll("[^a-zA-Z0-9]","");
		
		System.out.println(str1);
	}

}
