/*Using scanner class static and non-static lets do Addition,Subtraction,Multiplication,Division and modulus of 4 different method*/
package assignment.basicprograms;

import java.util.Scanner;

public class A32_NonStaticScannerClass {
	Scanner s=new Scanner(System.in); //non-static scanner class
	
	void add()
	{
		System.out.println("Enter the value of a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		int sum=a+b;
		System.out.println("Addition of nos.: "+sum);
	}
	
	void subtract()
	{
		System.out.println("Enter the value of a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		int sub=a-b;
		System.out.println("Subtraction of nos.: "+sub);
	}
	
	void multiply()
	{
		System.out.println("Enter the value of a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		int mul=a*b;
		System.out.println("Multiplication of nos.: "+mul);
	}
	
	void divide()
	{
		System.out.println("Enter the value of a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		int div=a/b;
		System.out.println("Division of nos.: "+div);
	}
	
	void modulus()
	{
		System.out.println("Enter the value of a and b");
		int a=s.nextInt();
		int b=s.nextInt();
		int mod=a%b;
		System.out.println("Modulus of nos.: "+mod);
	}

	public static void main(String[] args) {
		A32_NonStaticScannerClass a4=new A32_NonStaticScannerClass();
		a4.add();       
		a4.subtract();
		a4.multiply();
		a4.divide();
		a4.modulus();
		

	}

}
