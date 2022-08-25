//WAP to show priority of a thread 
package lab;

public class ThreadPriority extends Thread {
public void run()
{
	for(int i=1;i<=3;i++)
	{
		try {
			Thread.sleep(350);
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
		System.out.println(i+" "+Thread.currentThread().getName()+" "
		+Thread.currentThread().getPriority());
	}
}
public static void main(String[] args) {
		ThreadPriority t1 = new ThreadPriority();
		ThreadPriority t2 = new ThreadPriority();
		ThreadPriority t3 = new ThreadPriority();
		ThreadPriority t4 = new ThreadPriority();
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t3.setPriority(Thread.MAX_PRIORITY);
		t4.setPriority(8);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		

	}

}
