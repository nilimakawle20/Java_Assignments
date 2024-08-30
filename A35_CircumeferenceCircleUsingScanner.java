/*Circumference of circle using Scanner class*/
package assignment.basicprograms;

import java.util.Scanner;

public class A35_CircumeferenceCircleUsingScanner {
	static double pi_value=Math.PI;
	static Scanner s1=new Scanner(System.in);
	
	static void circumference_of_circle()
	{
	System.out.println("Enter the value of r");
	int r=s1.nextInt();
	double circumference=2*pi_value*r;
	System.out.println("circumference of circle : " +circumference);
	}
	
	public static void main(String[] args) 
	{
		circumference_of_circle();
	}

}
