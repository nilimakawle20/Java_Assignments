/*WAP on area of circle using global variable*/
package assignment.basicprograms;

public class A18_AreaOfCircleUsingGlobalVariable {
static double pi=3.14; //global variable
	
	static void area_of_circle()
	{
		int r=3;
		double area=pi*r*r;
		System.out.println("area of circle : " +area);
		
	}
	
	public static void main(String[] args)
	{
	area_of_circle();	
	}

}
