/*Assignment 64-WAP using finally block in try catch*/
package exception_Programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A64_Finally {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		try
		{
			System.out.println("Enter the valid age");
			int age=s1.nextInt();
		}
		catch(InputMismatchException a1)
		{
			System.out.println("age must be valid numeric value please enter again");
			Scanner s2=new Scanner(System.in);
			System.out.println("Enter the valid age");
			int age1=s2.nextInt();
			
		}
		finally 
		{
		System.out.println("No matter what but I will always be there");
		}
		
		System.out.println("Please enter the name");
		Scanner s3=new Scanner(System.in);
		String name=s3.next();

	}

}
