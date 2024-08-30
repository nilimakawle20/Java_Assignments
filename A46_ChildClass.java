/*Assignment-46 WAP in which super most class having 2CM, abstract class having 2AM&2CM, subclass having 2CM*/
package abstraction.programs;

class GrandParent
{
	void concrete_method1()
	{
		System.out.println("GrandParent non-static method");
	}
	
	static void concrete_method2()
	{
		System.out.println("GrandParent static method");
	}
}
abstract class Parent extends GrandParent
{
	abstract void ab_method1();
	abstract void ab_method2();
	void concrete_method5()
	{
		System.out.println("parent abstract class non-static method");
	}
	
	static void concrete_method6()
	{
		System.out.println("parent abstract class static method");
	}
	
}
public class A46_ChildClass extends Parent{
	@Override
	void ab_method1() {
		System.out.println("Parent abstract class with abstract method1");
		
	}

	@Override
	void ab_method2() {
		System.out.println("Parent abstract class with abstract method2");
		
	}
	void concrete_method3()
	{
		System.out.println("Child non-static method");
	}
	
	static void concrete_method4()
	{
		System.out.println("Child static method");
	}

	public static void main(String[] args) {
		concrete_method4();
		concrete_method6();
		concrete_method2();
		A46_ChildClass c1=new A46_ChildClass();
		c1.concrete_method3();
		c1.ab_method1();
		c1.ab_method2();
		c1.concrete_method5();
		c1.concrete_method1();
	}
}
