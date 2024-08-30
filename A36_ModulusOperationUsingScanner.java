/*Find % operator using scanner class*/
package assignment.basicprograms;

import java.util.Scanner;

public class A36_ModulusOperationUsingScanner {
	static Scanner s1=new Scanner(System.in);
	
	static void modulus()
	{
		System.out.println("Enter the value of a and b :");
		int a= s1.nextInt();
		int b= s1.nextInt();
		int mod=a%b;
		System.out.println("modulus of 2 values:" +mod);
	}

	public static void main(String[] args) 
	{
		modulus();

	}

}
