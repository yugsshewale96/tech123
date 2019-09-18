class Runnable2 implements Runnable
{
  public void run()
  {
    for(char i='a';i<='j';i++) 
	{
        System.out.println(i);
    	}
  }
}


public class Thrd2
{

  public static void main(String[] args) 
{
    
    Runnable r2 = new Runnable2();
    Thread t1 = new Thread(r2);
    Thread t2 = new Thread(r2);
    t1.start();
    t2.start();
  }
}

