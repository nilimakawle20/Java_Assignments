/*Area of rectangle using Scanner class*/
package assignment.basicprograms;

import java.util.Scanner;

public class A34_AreaOfRectangleUsingScanner {
	static Scanner s1=new Scanner(System.in);
	
	static void area_of_rectangle()
	{
	System.out.println("Enter the length of rectangle :");
	int l=s1.nextInt();
	System.out.println("Enter the breadth of rectangle :");
	int b=s1.nextInt();
	int area=l*b;
	System.out.println("Area of rectangle : " +area);
	}

	public static void main(String[] args) 
	{
		area_of_rectangle();
	}

}
