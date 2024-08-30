/*WAP on different arithmatic operators using global variable a and b*/
package assignment.basicprograms;

public class A19_ArithmaticOperationWithGlobalVar {
	static int a=110; //global variable
	static int b=20;  //global variable
	
	static void add()
	{
		int sum=a+b;
		System.out.println(sum);
	}
	
	static void subtract()
	{
		int sub=a-b;
		System.out.println(sub);
	}
	
	static void multiply()
	{
		int mul=a*b;
		System.out.println(mul);
	}
	
	static void divide()
	{
		double div=a/b;
		System.out.println(div);
	}
	
	static void modulus()
	{
		int mod=a%b;
		System.out.println(mod);
	}


	public static void main(String[] args) 
	{
		add();
		subtract();
		multiply();
		divide();
		modulus();
	}

}
