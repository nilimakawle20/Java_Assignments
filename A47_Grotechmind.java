/*Assignment-47 WAP in which super most interface class having 2AM, abstract class having 2AM&2CM, subclass having 2CM*/
package abstraction.programs;
interface Training_institute
{
	void learn_coding();
	void learn_programming();
}
abstract class Student implements Training_institute
{
	abstract void solve_mcq();
	abstract void write_exam();
	public void learn_coding() 
	{
		System.out.println("Lets learn coding");
	}
	public void learn_programming() 
	{
		System.out.println("Lets learn programming");
	}
	
}
public class A47_Grotechmind extends Student{
	void solve_mcq()
	{
		System.out.println("MCQ solved");
	}
	void write_exam()
	{
		System.out.println("Written exam");
	}
	
	/*void student_admission()
	{
		System.out.println("Student enrolled for course");
	}
	void student_record()
	{
		System.out.println("Student record maintained");
	}*/

	public static void main(String[] args) {
		A47_Grotechmind g=new A47_Grotechmind();
		//g.student_admission();
		//g.student_record();
		g.learn_coding();
		g.learn_programming();
		g.solve_mcq();
		g.write_exam();		
	}

}
