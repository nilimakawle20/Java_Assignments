/*Assignment 38: multilevel inheritance using static and non-static methods*/
package inheritance.programs; 

class EnggFirstsem_Maths
{
	static void first_sem()
	{
		System.out.println("Student have basic maths subject named M1 for first semester");
	}
	
}

class EnggSecondsem_Maths extends EnggFirstsem_Maths
{
	void second_sem()
	{
		System.out.println("Student have mid level maths subject named M2 for second semester");
	}
	
}


public class A38_EnggThirdsem_Maths extends EnggSecondsem_Maths{
	static void third_sem()
	{
		System.out.println("Student have advance level maths subject named M3 for third semester");
	}

	public static void main(String[] args) {
		third_sem();
		A38_EnggThirdsem_Maths m=new A38_EnggThirdsem_Maths();
		m.second_sem();
		first_sem();
		

	}

}
