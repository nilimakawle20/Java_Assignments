/*Assignment 41: This calling with parameterized*/
package inheritance.programs;

public class A41_MovieShow {
	A41_MovieShow(String theatre_name)
	{
		System.out.println("This is theatre 1");
	}
	
	A41_MovieShow(String theatre_name, int seat_capacity)
	{
		this("Neon");
		System.out.println("This is theatre 2 with huge capacity");
	}
	
	A41_MovieShow(String theatre_name, double discount)
	{
		this("Golden multplex", 500);
		System.out.println("This is theatre 3 providing discount");
	}
	

	public static void main(String[] args) {
		A41_MovieShow m=new A41_MovieShow("PVR", 50.5);

	}

}
