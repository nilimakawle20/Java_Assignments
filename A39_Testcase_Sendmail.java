/*Assignment 39: super calling with parameterized and non parameterized using constructor*/
package inheritance.programs;

class Set_url
{
	Set_url()                                   
	{
		System.out.println("https://www.gmail.com");
	}
}
class Login_with_validcredentials extends Set_url
{
	Login_with_validcredentials(String un, String pwd)
	{
		System.out.println("Logged in with valid credentials");
	}
	
}
class Compose_mail extends Login_with_validcredentials
{
	Compose_mail()
	{
		super("NilimaK", "Nilima@10"); //parameterized super calling statement
		System.out.println("This is to inform you......");
	}
	
}
class Add_SubjectandRecipient extends Compose_mail
{
	Add_SubjectandRecipient(String sub, String rec)
	{
		System.out.println("Subject and recipient list added");
	}
	
}

public class A39_Testcase_Sendmail extends Add_SubjectandRecipient{
	A39_Testcase_Sendmail()
	{
		super("Team meeting", "ayesha.s@gmail.com; riya.k@gmail.com");
		System.out.println("Mail sent successfully");
	}

	public static void main(String[] args) {
		A39_Testcase_Sendmail t1=new A39_Testcase_Sendmail();
		
	}

}
