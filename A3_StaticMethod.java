/*Calling static method inside main method*/

package assignment.basicprograms;

public class A3_StaticMethod {
	static void start()
	{
		System.out.println("Start running this static method when its called");
	}

	public static void main(String[] args) 
	{
		start();   //static method called directly by its method name
	}

}
