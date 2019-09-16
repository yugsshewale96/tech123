class Vehicle 
{
	public void start()
	{
		System.out.println("In vehicle");
	}
}
 class Fourwheeler extends Vehicle
	{
	public void start()
	{
		
		System.out.println("In Fourwheeler");
		super.start();
	}
	}
 
 public class Call
	{
	public static void main(String args[]) 
	{
		Vehicle ref=new Fourwheeler();
		ref.start();
	}
	}