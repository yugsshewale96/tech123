class Item
{
	String itemid;
	String name;
	int cost;
	Item(String itemid,String name,int cost)
	{
		this.itemid=itemid;
		this.name=name;
		this.cost=cost;
	}
	public void display()
	{
		System.out.println("Itemid is"+" "+itemid);
		System.out.println("Name is"+" "+name);
		System.out.println("Cost is"+" "+cost);
	}
}
public class Exception4 
{

	public static void main(String[] args) 
	{
		Item i=new Item("101","Water",500);
		i.display();
	}

}