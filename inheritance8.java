class base1
{
	base1(int a)
	{
		System.out.println("in parent");
	}
}
class sub1 extends base1
{
	sub1()
	{
		super(10);
		System.out.println("hello");
	}
	sub1(int a)
	{
		super(10);
		System.out.println("world");
	}
	sub1(int a,int b)
	{
		super(10);
		System.out.println("class");
	}
}
public class Inheritance8 {

	public static void main(String[] args) {
		sub1 s=new sub1();
	}

}
