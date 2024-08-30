/*WAP with parameterized constructor in SIB,IIB Concept*/
package sib_iib.blocks;
public class A124_Initialisation_Block {
	static
	{
		System.out.println("sib block");
	}
	
	{
		System.out.println("iib block");
	}
	
	A124_Initialisation_Block(int a, int b)
	{
		System.out.println("Constructor block");
		int sum=a+b;
		System.out.println(sum);
	}
	public static void main(String[] args) {
		System.out.println("main method");
		A124_Initialisation_Block i=new A124_Initialisation_Block(6, 7);
	}

}
