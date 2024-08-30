/*Assignment 42: method overriding*/
package inheritance.programs;

class method_parent1
{
	void submit()
	{
		System.out.println("Submit offline form");
	}
}

public class A42_MethodOverriding extends method_parent1{

	void submit()
	{
		//super.submit(); 
		System.out.println("Submit online form");
	}
	public static void main(String[] args) {
		A42_MethodOverriding m1=new A42_MethodOverriding();
		m1.submit();

	}

}
