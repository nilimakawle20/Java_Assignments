/*WAP on area of circle using math.random()*/
package assignment.basicprograms;

public class A30_AreaOfCircleUsingMathRandom_method {
	static double pi=Math.PI;
	static double r=Math.random();  //every time program runs, this radius value will change and hence area of circle
	
	static void area_of_circle()
	{
		double area=pi*r*r;
		System.out.println("area of circle:" +area);
	}

	public static void main(String[] args) {
		area_of_circle();

	}

}
