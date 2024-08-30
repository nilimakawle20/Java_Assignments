/*Assignment 43: method overriding with super keyword*/
package inheritance.programs;

class method_parent2
{
	void submit()
	{
		System.out.println("Submit offline form");
	}
}

public class A43_MethodOverriding_Super extends method_parent2{

	void submit()
	{
		super.submit();    //super keyword in method overloading
		System.out.println("Submit online form");
	}
	public static void main(String[] args) {
		A43_MethodOverriding_Super m2=new A43_MethodOverriding_Super();
		m2.submit();

	}

}