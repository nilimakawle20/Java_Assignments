/*Logical operators 
 AND
 OR
 AND with NOT
 OR with NOT */
package assignment.basicprograms;

public class A10_Logical {

	public static void main(String[] args) 
	{
		int age=20;
		int salary=10000;
		
		System.out.println("AND operations");
	    if((age==20 && salary==10000))              //AND
		{
			System.out.println("True and True always true");
		}   
		if(!(age==20 && salary==2000))            //AND WITH NOT
		{
			System.out.println("True and False always false"); 
		}
		
		if(!(age==18 && salary==10000))          //AND WITH NOT
		{
			System.out.println("False and True always false");
		}
		
		if(!(age==18 && salary==1000))           //AND WITH NOT
		{
			System.out.println("False and False always false");
		}
		
		System.out.println("OR operations");
		
		 if((age==20 || salary==10000))           //OR
			{
				System.out.println("Both True always true");
			}   
			if((age==20 || salary==2000))        //OR
			{
				System.out.println("RHS True always true");
			}
			
			if((age==18 || salary==10000))      //OR
			{
				System.out.println("LHS True always true");
			}
			
			if(!(age==18 || salary==1000))      //OR WITH NOT
			{
				System.out.println("Both False always false");
			}
		
	}
}
