/*Assignment-37 : Single inheritance using static and non static methods*/
package inheritance.programs;
class Parent
{
	static void method1()
	{
		System.out.println("Parent static method");        //static method
	}
	
	void method2()
	{
		System.out.println("Parent non-static method");     //non static method
	}
}

public class A37_ChildClass1 extends Parent{     //Child Class inheriting parent class properties
	void method3()
	{
		System.out.println("Child class method");
	}

	public static void main(String[] args) {
		method1();
		A37_ChildClass1 c1=new A37_ChildClass1();
		c1.method2();
		c1.method3();
	}

}
