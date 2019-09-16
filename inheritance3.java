package sushmit1;

 class Yuga
{
	Yuga()
	{
		System.out.println("IN DEFAULT CONSTRUCTOR");
	}
	Yuga(int a)
	{
		System.out.println("IN PARAMETERISED COSNTRUCTOR");
	}
}



class Child extends Yuga
{
	Child()
	{
		System.out.println("in child constructor");
	}
	Child(int b)
	{
		System.out.println("in child parameterised constructor");
	}
	
}
	class Child2 extends Yuga
	{
		Child2()
		{
			System.out.println("in child2 default constructor");
		}
		Child2(int c)
		{
			System.out.println("in child2 parameterised constructor");
		}
		
	
}