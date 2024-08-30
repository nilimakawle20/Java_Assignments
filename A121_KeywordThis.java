/*this keyword*/
package encapsulation_program;
public class A121_KeywordThis {
	int rollno;
	String student_name;
	double marks_in_cent;
	
	void student_markdetails(int rollno, String name, double marks)
	{
		this.rollno=rollno;
		this.student_name=name;
		this.marks_in_cent=marks;
	}

	public static void main(String[] args) {
		A121_KeywordThis t=new A121_KeywordThis();
		t.student_markdetails(15, "Divya Shaha", 66.9);
		System.out.println(t.rollno);
		System.out.println(t.student_name);
		System.out.println(t.marks_in_cent);
	}
}
