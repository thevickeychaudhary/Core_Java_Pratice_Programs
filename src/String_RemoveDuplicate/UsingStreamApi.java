package String_RemoveDuplicate;

public class UsingStreamApi {
    public static void main(String args[])
    {
    	
    	
	String str = "aabcabcabc";
	
	String res = str.chars()
			     .distinct()
			     .mapToObj(c->String.valueOf((char)c))
			     .reduce("",String::concat);
	
	System.out.println(res);
    }
}

/*  flow of program
 String
 ↓
chars() → IntStream
 ↓
distinct() → remove duplicates
 ↓
mapToObj() → convert to String
 ↓
reduce() → combine into final string
 */
