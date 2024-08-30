/*Assignment-51 WAP to access the 4 access specifiers within the same class*/

public class MethodsWithinClass {

	public void sing_a_song()
	{
		System.out.println("Some students like to sing songs.");
	}
	protected void play_music()
	{
		System.out.println("Some students like to play music.");
	}
	private void play_an_instrument()
	{
		System.out.println("Some students like to play instruments.");
	}
	void write_lyrics()
	{
		System.out.println("Some students like to write lyrics.");
	}
	
	public static void main(String[] args) 
	{
		MethodsWithinClass m1=new MethodsWithinClass();
		m1.sing_a_song();    //all public,default,private,protected methods accessed
		m1.play_music();
		m1.play_an_instrument();
		m1.write_lyrics();
	}
}
