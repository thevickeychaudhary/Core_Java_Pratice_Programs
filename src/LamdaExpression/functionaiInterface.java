package LamdaExpression;

@FunctionalInterface
interface Ticket
{
	void bookTicket();
	
}
public class functionaiInterface {
	
	public static void main(String args[])
	{
		
		// lamda expression
		Ticket t = ()->  System.out.println("Ticket book succesfully ");
		t.bookTicket();
	}

}
