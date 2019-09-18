package sushmit1;

class Runn1 implements Runnable
{
	@Override
	synchronized public void run() 
	{
		for(int i=1;i<51;i++)
		{
			System.out.println(i);
		}
	}
	
}

class Runn2 implements Runnable
{
	@Override
	synchronized public void run() 
	{
		for (int j=50;j>0;j--)
		{
			System.out.println(j);
		}
	}
	
}
public class Thrd5 {

	public static void main(String[] args) {
		Runn1 r1=new Runn1();
		Runn2 r2=new Runn2();
		Thread t=new Thread(r1);
		Thread t1=new Thread(r2);
		t.start();
		t1.start();

	}

}
