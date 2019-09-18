package sushmit1;

public class Thrd3 implements Runnable {
	synchronized public void run() {
		for(int i=0;i<6;i++)
		{
			System.out.println("Exec" + i);
		}		
	}

	public static void main(String args[])
	{
		Thrd3 t=new Thrd3();
		Thread t1=new Thread(t);
		Thread t2=new Thread(t);
		Thread t3=new Thread(t);
		t1.start();
		t2.start();
		t3.start();
	}

	
	
}
