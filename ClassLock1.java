package sushmit1;

public class ClassLock1 implements Runnable
{ 
//static Class cs;
public void run()
{
	
	synchronized(ClassLock1.class)
				{
		for(int i=1;i<11;i++)
		{
System.out.println("static"+i);
		}
	}
}
	public static void main(String args[])
	{
		//cs=Class.forName("ClassLock1");
		ClassLock1 c=new ClassLock1();
		ClassLock1 c1=new ClassLock1();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c1);
		t1.start();
		t2.start();
	}
}