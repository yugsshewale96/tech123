package sushmit1;

class Top1
{
	void disp1()
		{
			System.out.println("In Top1 parameter");
		}
}

class Bottom1 extends Top1
{
	void disp1()
	{
		System.out.println("In Bottom1 parameter");
	}
}

class Bottom2 extends Top1
{
	void disp1()
	{
		System.out.println("In Bottom2 parameter");
	}
}

class Bottom3 extends Top1
{
	void disp1()
	{
		System.out.println("In Bottom3 parameter");
	}
}

public class Newly
{
public static void create(Top1 ref)
{
	ref.disp1();
}
	public static void main(String[] args)
	{
		create(new Bottom1());
	    create(new Bottom2());
	    create(new Bottom3());
	    create(new Top1());
	}

}
