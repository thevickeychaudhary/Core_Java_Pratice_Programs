package MultiThreading;

class Student extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Thread is runnig");
	}
}

public class Demo1 {
	
	public static  void main (String args[])
	{
		
		Student s1 = new Student();
		//String t1 =  new Thread().currentThread().getName();
		//System.out.println(t1);
		s1.run();
	
	}

}
