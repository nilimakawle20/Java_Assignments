/*WAP to perform add, sub, multi, div using same 2 variables in switch case*/
package assignment.basicprograms;

import java.util.Scanner;

public class A55_SwitchCase {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=s.nextInt();
		System.out.println("Enter the value of b:");
		int b=s.nextInt();
		System.out.println("Enter you choice for arithmatic operations: 1 for addition, 2 for subtraction, 3 for multiplication and 4 for division");
		int ch=s.nextInt();
		
		switch(ch)
		{
		case 1:
			int sum=a+b;
			System.out.println(sum);
			break;
		case 2:
			int sub=a-b;
			System.out.println(sub);
			break;
		case 3:
			int multi=a*b;
			System.out.println(multi);
			break;
		case 4:
			int div=a/b;
			System.out.println(div);
			break;
		default:
			System.out.println("Please enter correct choice number");	
		}

	}

}
