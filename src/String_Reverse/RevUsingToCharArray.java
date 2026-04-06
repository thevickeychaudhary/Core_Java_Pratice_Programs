package String_Reverse;

public class RevUsingToCharArray {

	 public static void main(String args[])
	 {
		 String str = "vicky";
		 
		 char[] strArr = str.toCharArray();
		 System.out.println(strArr);
		 int len = strArr.length;
		 String rev ="";
		
		for(int i=len-1;i>=0;i--)
		{
			rev+=strArr[i];
		
		}
		System.out.print(rev);
		 
	 }

	
}
