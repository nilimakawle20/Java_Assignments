/*Assignment-48 Create class and inherit property of interface*/
package abstraction.programs;
interface Login
{
	void login_with_emailid();
	void login_with_mobileno();
}

public class A48_Amazon implements Login{
	@Override
	public void login_with_emailid() {
		System.out.println("login with email id");
		
	}

	@Override
	public void login_with_mobileno() {
		System.out.println("login with mobile no");
		
	}
	public static void main(String[] args) {
		A48_Amazon a=new A48_Amazon();
		a.login_with_emailid();
		a.login_with_mobileno();

	}
}
