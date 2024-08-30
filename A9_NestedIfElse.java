/*Nested If Else program*/
package assignment.basicprograms;

public class A9_NestedIfElse {

	public static void main(String[] args) {
	int a=5;
	int b=5;
	int c=7;
	
		if(a==b)
		{
			if(a==c)
			{
				System.out.println("all are equals");
			}
			else
			{
				System.out.println("a not equals to c");
			}
			
		}
		else
		{
			System.out.println("a not equals to b");
		}

	}

}
