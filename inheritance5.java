abstract class Shape
{
	abstract void draw();
	
}
class Triangle extends Shape
{
	void draw()
	{
	System.out.println("Shape1");
	}
}
class Polygon extends Shape
{
	void draw()
	{
	System.out.println("Shape2");
	}
}
class Circle extends Shape
{
	void draw()
	{
	System.out.println("Shape3");
	}
}
public class Inheritance5 
{

	public static void main(String[] args) 
	{
		Shape arr[]=new Shape[3];
		arr[0]=new Triangle();
		arr[1]=new Polygon();
		arr[2]=new Circle();
		for(int i=0;i<arr.length;i++)
		{
			arr[i].draw();
		}
	}

}