/*WAP on area of circle using math.random() five times using for loop*/
package assignment.basicprograms;

public class A31_AreaOfCircleUsingMathRandom_methodLoop {
	static double pi=Math.PI;
	static double r=Math.random();
	
	static void area_of_circle()
	{
		double area=pi*r*r;
		System.out.println("area of circle:" +area);
	}

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
		area_of_circle();
		}

	}

}