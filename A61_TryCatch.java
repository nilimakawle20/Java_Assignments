/*Assignment 61-WAP with simple try catch block*/
package exception_Programs;

public class A61_TryCatch {

	public static void main(String[] args) {
		try 
		{
			int a=2/0;
			System.out.println(a);
		}
		
		catch(ArithmeticException a1)
		{
			System.out.println("Catch exception here");
		}
	}

}
