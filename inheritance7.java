class Parent1
{
	public void disp()
	{
		System.out.println("in Parent");
	}
}
interface Parent2
{
	void fun();
	
}
class Child1 extends Parent1 implements Parent2
{

	@Override
	public void fun() 
	{
		System.out.println("In Fun");
		
	}
	
}
public class Inheritance7 
{

	public static void main(String[] args) 
	{
		Child1 c=new Child1();
		c.fun();
		c.disp();

	}

}
