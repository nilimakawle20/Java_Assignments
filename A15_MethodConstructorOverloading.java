/*WAP on combination of method overloading and constructor overloading*/
package assignment.basicprograms;

public class A15_MethodConstructorOverloading {
	
	static void add(int a) 
	{
		int sum=a+10;
		System.out.println("method overloading with single parameter and value is " +sum);
	}
	
	static void add(int a,int b) 
	{
		int sum=a+b+10;
		System.out.println("method overloading with two parameters and value is " +sum);
	}
	
	A15_MethodConstructorOverloading()  //constructor without parameters
	{
	System.out.println("This is constructor without parameters");
	}
	
	A15_MethodConstructorOverloading(int a)  //constructor with parameters
	{
	System.out.println("This is constructor with parameters");
	}
	
	public static void main(String[] args) 
	{
		add(10); //method overloading with single parameter
		add(25,40); //method overloading with two parameters
		A15_MethodConstructorOverloading a11=new A15_MethodConstructorOverloading(); //constructor overloading with no parameters
		A15_MethodConstructorOverloading a12=new A15_MethodConstructorOverloading(100);//constructor overloading with  parameters
	}

}
