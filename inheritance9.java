interface Game
{
	abstract void play();
}
class Cricket implements Game
{
	public void play()
	{
		System.out.println("cricket");
	}
}
class Football implements Game
{
	public void play()
	{
		System.out.println("Football");
	}
	
}
class Tennis implements Game
{
	public void play()
	{
		System.out.println("Tennis");
	}
}
public class Inheritance89
{
	static void perform(Game ref)
	{
		ref.play();
	}

	public static void main(String[] args)
	{
		perform(new Cricket());
		perform(new Football());
	}

}

