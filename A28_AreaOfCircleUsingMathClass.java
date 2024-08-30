/*WAP on area of circle using maths class*/
package assignment.basicprograms;

public class A28_AreaOfCircleUsingMathClass {
	double pi=Math.PI;
	void area_of_circle()
	{
		int r=7;
		double area=Math.PI*r*r;
		System.out.println("area of circle: "+area);
	}

	public static void main(String[] args) {
		A28_AreaOfCircleUsingMathClass a3=new A28_AreaOfCircleUsingMathClass();
		a3.area_of_circle();
	}

}
