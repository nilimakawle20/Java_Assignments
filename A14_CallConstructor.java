/*WAP on constructor calling with and without parameters*/
package assignment.basicprograms;

public class A14_CallConstructor {
	A14_CallConstructor()  //constructor without parameters
	{
	System.out.println("This is constructor without parameters");
	}
	
	A14_CallConstructor(int a)  //constructor with parameters
	{
	System.out.println("This is constructor with parameters");
	}
	
	public static void main(String[] args) 
	{
	//the moment object created, constructor automatically gets called
	A14_CallConstructor a1=new A14_CallConstructor();  //without parameter
	A14_CallConstructor a2=new A14_CallConstructor(30); //with parameter
	}
}
