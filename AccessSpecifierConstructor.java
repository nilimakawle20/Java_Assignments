package pckg.b1;

public class AccessSpecifierConstructor {
	
	public AccessSpecifierConstructor(int a)
	{
		System.out.println("int datatype");
	}
	
	protected AccessSpecifierConstructor(double db)
	{
		System.out.println("double datatype");
	}
	
	private AccessSpecifierConstructor(float f)
	{
		System.out.println("float datatype");
	}
	
	AccessSpecifierConstructor()
	{
		System.out.println("no parameter");
	}
}
