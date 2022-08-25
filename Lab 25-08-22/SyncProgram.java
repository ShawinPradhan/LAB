//WAP to show synchronization
package lab;
class Syn1
{
//shared object
	public static synchronized void addition(int a,int b)
	{
		synchronized (Syn1.class) {
			System.out.println("Addition of 2 nos.: "+(a+b));
			try {
				Thread.sleep(400);
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class Syn2
{
	public static synchronized void subtraction(int a,int b)
	{
		synchronized (Syn2.class) {
			if(a>b)
			{
				System.out.println("Substraction: "+(a-b));
			}
			else
				System.out.println("Substraction: "+(b-a));
			
			try {
				Thread.sleep(400);
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
		}
	}
}
public class SyncProgram {
	public static void main(String[] args) {
		Syn1 s1= new Syn1();
		Syn2 s2= new Syn2();
		
		new Thread()
		{
			public void run()
			{
				s1.addition(10, 20);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				s1.addition(50, 70);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				s2.subtraction(56, 23);
			}
		}.start();
		
		new Thread()
		{
			public void run()
			{
				s2.subtraction(99, 81);
			}
		}.start();
	}

}
