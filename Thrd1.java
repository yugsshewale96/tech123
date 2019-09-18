package sushmit1;

class Runn extends Thread
{

synchronized public void run() 
	{
		for (char i='A';i<'K';i++)
		{
			System.out.println(i);
		}
	}
}
public class Thrd 
{

	public static void main(String[] args)
	{
		Runn r2=new Runn();
		Thread t1=new Thread(r2);
		Thread t2=new Thread(r2);
		t1.start();
		t2.start();
	}

}