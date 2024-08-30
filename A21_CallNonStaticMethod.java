/*Calling non-static method inside the main method*/
package assignment.basicprograms;

public class A21_CallNonStaticMethod {
	void add(int a,int b)
	{
		int sum=a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		A21_CallNonStaticMethod a2=new A21_CallNonStaticMethod();
		a2.add(40,100);
	}

}
