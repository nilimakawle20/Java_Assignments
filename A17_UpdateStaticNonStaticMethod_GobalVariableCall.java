/*WAP on updating global static and non-static variable*/
package assignment.basicprograms;

public class A17_UpdateStaticNonStaticMethod_GobalVariableCall {
	
	int salary=50000;
	static String position="Junior";

	public static void main(String[] args) 
	{
		position="Senior";   //updating static global variable
		System.out.println(position);
		A17_UpdateStaticNonStaticMethod_GobalVariableCall a=new A17_UpdateStaticNonStaticMethod_GobalVariableCall();
		System.out.println(a.salary=70000); //updating non-static variable
	}

}
