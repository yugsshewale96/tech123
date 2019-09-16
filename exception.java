abstract class Game
{
	abstract void  play();
	
}
class Football extends Game
{
	public void play()
	{
		System.out.println("Play Football");
	}
}
class Cricket extends Game
{
	public void play()
	{
		System.out.println("Play Cricket");
	}
}
class Tennis extends Game
{
	public void play()
	{
		System.out.println("Play Tennis");
	}
	
}
public class GamesDemo 
{
	
	public static void main(String[] args) 
	{
		Game arr[]=new Game[3];
			arr[0]=new Football();
			arr[1]=new Cricket();
			arr[2]=new Tennis();
			//for(int i=0;i<arr.length;i++)
			//{
				arr[1].play();
			//}
			
	}

}