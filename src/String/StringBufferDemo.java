package String;

public class StringBufferDemo {
	public static void main(String args[]) {

		// fix the capacity
		// StringBuffer sb = new StringBuffer(1000);
		StringBuffer sb = new StringBuffer("abc"); // by default capacity 16
		System.out.println(sb.capacity()); // 16+3 = 19

		System.out.println(sb.charAt(0)); // a

		sb.setCharAt(1, 'z');
		System.out.println(sb); // azc

		System.out.println(sb.insert(2, "xy")); // azxyc

		System.out.println(sb.delete(0, 2)); // xyc

		System.out.println(sb.reverse()); // cyx

		sb.setLength(1);
		System.out.println(sb); // c
		
		
		sb.append("lions");
		sb.ensureCapacity(10);
		System.out.println(sb); // clions
		
		sb.trimToSize();  // free extra de-allocate memory
		System.out.println(sb); // cliions
		
		// method Chaining 
		sb.deleteCharAt(0).append(" is King of Jungle");
		System.out.println(sb);
		
		
	}

}
