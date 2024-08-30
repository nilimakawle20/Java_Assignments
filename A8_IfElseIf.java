/*If else if program*/
package assignment.basicprograms;

public class A8_IfElseIf {

	public static void main(String[] args) {
		double marks=34.5;
		if(marks>=35 && marks<45) 
		{
			System.out.println("Student passed in third division");
		}
		else if(marks>=45 && marks<60) 
		{
			System.out.println("Student passed in second division");
		}
		else if(marks>=60 && marks<75)
		{
			System.out.println("Student passed in first division");
		}
		else if(marks>=75 && marks<90)
		{
			System.out.println("Student passed with distinction");
		}
		else if(marks>=90 && marks<100)
		{
			System.out.println("Student topped in examination");
		}
		else
		{
			System.out.println("Student failed in examination");
		}
		
	}

}
