/*WAP in which we are writing extends & implements keywords in a subclass*/
package abstraction.programs;
interface forgotpassword
{
	void click_forgotpasswordlink();
}
abstract class LoginUn
{
	abstract void login_as_email();
	static void login_with_mobile()
	{
		System.out.println("Logged in with mobile number");
	}
}

public class A50_Flipkart_ExtendsImplements extends LoginUn implements forgotpassword{
	@Override
	public void click_forgotpasswordlink() {
		System.out.println("Retrieve login_details through forgot password option");
		
	}

	@Override
	void login_as_email() {
		System.out.println("login with email id");
		
	}

	public static void main(String[] args) {
		A50_Flipkart_ExtendsImplements f=new A50_Flipkart_ExtendsImplements();
		f.click_forgotpasswordlink();
		f.login_as_email();
		f.login_with_mobile();
	}
}
