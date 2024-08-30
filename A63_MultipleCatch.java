/*Assignment 63-WAP using multiple catch block*/
package exception_Programs;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;

public class A63_MultipleCatch {

	public static void main(String[] args) {
		String s="navya";
		try {
		
		for(int i=0;i<s.length()+2;i++)
		{
		System.out.println(s.charAt(i));
		}
		}
		
		catch(StringIndexOutOfBoundsException e1)
		{
			System.out.println("Exceeded size");
		}
		catch(NullPointerException e2)
		{
			System.out.println("handled the exception called NPE");
		}
	
		catch(InputMismatchException e3)
		{
			System.out.println("handled the exception called IME");
		}
		catch(IllegalFormatException e4)
		{
			System.out.println("handled the exception called IAE");
		}
		finally
		{
			System.out.println("I am finally");
		}

	}

}
