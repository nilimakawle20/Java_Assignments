/*WAP on static and non static main method overloading*/
package assignment.basicprograms;

public class A57_MethodOverloading {

	static void main()
	{
		System.out.println("No argument passed");
	}
	void main(String Your_name) 
	{
		System.out.println("String argument passed for name");

	}
	public static void main(double salary) 
	{
		System.out.println("Double argument passed for salary");
	}
	public static void main(String[] args) {
		A57_MethodOverloading m=new A57_MethodOverloading();
		main(50000);
		m.main("Radha");
		main();
	}
}
