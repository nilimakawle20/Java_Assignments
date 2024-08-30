/*Assignment-49 Multiple level of inheritance using concept of interface*/
package abstraction.programs;
interface Email
{
	void email_as_un();
}

interface Mobile_no
{
	void mobile_no_as_un();
}
public class A49_MyntraLogin implements Email, Mobile_no{
	@Override
	public void mobile_no_as_un() {
		System.out.println("Implemented for mobile no");	
	}

	@Override
	public void email_as_un() {
		System.out.println("Implemented for email id");
	}
	public static void main(String[] args) {
		A49_MyntraLogin m=new A49_MyntraLogin();
		m.email_as_un();
		m.mobile_no_as_un();
	}
}
