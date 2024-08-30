/*Assignment 62-WAP in which age,salary,your_weight,are_you_student with try catch block*/
package exception_Programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class A62_TryCatch2 { 
	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		try
		{
		System.out.println("Please enter your age");
		int age=s1.nextInt();
		System.out.println("Please enter your salary");
		double salary=s1.nextDouble();
		System.out.println("Please enter your weight");
		float weight=s1.nextFloat();
		System.out.println("Are you a student?");
		boolean are_you_student=s1.nextBoolean();
		}
		
		catch(InputMismatchException a1)
		{
			System.out.println("Please fill the form again");
			System.out.println("Hey age must be valid numeric value, please enter age again");
			Scanner s2=new Scanner(System.in);
			int age=s2.nextInt();
			System.out.println("Mentioned age is:" +age);
			
			System.out.println("Hey salary must be valid double value, please enter salary again");
			Scanner s3=new Scanner(System.in);
			double salary=s3.nextDouble();
			System.out.println("Mentioned salary is:" +salary);
			
			System.out.println("Hey weight must be valid float value, please enter weight again");
			Scanner s4=new Scanner(System.in);
			float weight=s4.nextFloat();
			System.out.println("Mentioned weight is:" +weight);
			
			System.out.println("Hey please confirm again if you are a student");
			Scanner s5=new Scanner(System.in);
			boolean are_you_student=s5.nextBoolean();
			System.out.println("Mentioned if you are a student? :" +are_you_student);
		}

	}

}
