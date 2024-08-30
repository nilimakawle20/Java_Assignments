/*Assignment-45WAP in which abstract class is present along with concrete class*/
package abstraction.programs;

abstract class Operations
{
	static int a=10;
	static int b=12;
	abstract void add();
	abstract void sub();
	
	static void mul()
	{
		int mul=a*b; 
		System.out.println("Multiplication:" +mul);
	}
	static void div()
	{
		int div=b/a;
		System.out.println("Division:" +div);
	}
	
}

public class A45_Calculator extends Operations{
	@Override
	void add() {
		int add=a+b;
		System.out.println("Addition:" +add);
		
	}

	@Override
	void sub() {
		int sub=a-b;
		System.out.println("Subtraction:" +sub);
		
	}

	public static void main(String[] args) {
		A45_Calculator c1=new A45_Calculator();
		c1.add();
		c1.sub();
		mul();
		div();
	}

}
