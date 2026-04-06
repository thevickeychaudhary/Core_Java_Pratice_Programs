package String_Reverse;

public class RevUsingCharAt
{
  public static void main(String args[])
  {
	  String str = "vicky";
	  String rev = "";
	  int len = str.length();
	  
	  for (int ch=len-1;ch>=0;ch--)
	  {
		  rev=rev+str.charAt(ch);
	  }
	  System.out.println(rev);
	 	  
  }
}
