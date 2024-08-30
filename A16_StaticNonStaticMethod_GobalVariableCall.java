/*WAP on global variable static and non-static calling*/
package assignment.basicprograms;

public class A16_StaticNonStaticMethod_GobalVariableCall {

	static double pi=3.14;  //static global variable
	int angle_of_circle_in_degree=360; //non-static global variable
	
	static void area_of_circle()
	{
		int r=3;
		double area=pi*r*r;
		System.out.println("area of circle : " +area);
		
	}
	
	void circumferance_of_circle()
	{
		int r=4;
		double circumferance=2*pi*r;
		System.out.println("circumferance of circle : " +circumferance);
		

	}
	public static void main(String[] args)
	{
		area_of_circle();
		A16_StaticNonStaticMethod_GobalVariableCall c1=new A16_StaticNonStaticMethod_GobalVariableCall();
		c1.circumferance_of_circle();
		System.out.println(c1.angle_of_circle_in_degree); //nonstatic global variable called by using reference variable
}
}
