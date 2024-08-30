/*Default value of global datatypes*/
package assignment.basicprograms;

public class A20_DefaultValueGlobalVariables {
	byte a;
	int b;
	short c;
	long d;
	
	float f;
	double db;
	
	boolean bl;
	String s;
	//char ch;
	
	public static void main(String[] args) {
		A20_DefaultValueGlobalVariables a1=new A20_DefaultValueGlobalVariables();
		System.out.println(a1.a);    //Default value of byte - 0
		System.out.println(a1.b);    //Default value of int - 0
		System.out.println(a1.c);    //Default value of short - 0
		System.out.println(a1.d);    //Default value of long - 0
		System.out.println(a1.f);    //Default value of float - 0.0
		System.out.println(a1.db);   //Default value of double - 0.0
		System.out.println(a1.bl);   //Default value of boolean - false
		System.out.println(a1.s);    //Default value of String-null
		//System.out.println(a1.ch); //not defined
	}

}
