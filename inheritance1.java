package sushmit1;

class Parent 
{
 Parent()
 {
	 System.out.println("In parent default constructor");
 }

 Parent(int a, int b)
 {
System.out.println("In parent parameterised constructor");
}
}

 class Child1 extends Parent
 {
	 Child1()
	 {
	 super(10,02);
System.out.println("In child1 default cosntriuctor");		 
	 }
 }
 
 
 class Chil2 extends Child1
 {
	 Chil2()
	 {
System.out.println("In child2 default cosntriuctor");		 
	 }
 }

 public class Demo
 {
	 public static void main(String args[])
	 {
		Parent ref=new Chil2();
	}
 }