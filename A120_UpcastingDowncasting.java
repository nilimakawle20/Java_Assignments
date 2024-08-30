/*upcasting implicity and explicitly and downcasting*/
package typecasting_in_java;

class Facebook
{
	
}

public class A120_UpcastingDowncasting extends Facebook{

	public static void main(String[] args) {
	Facebook f=new A120_UpcastingDowncasting(); //implicit upcasting 
	
	A120_UpcastingDowncasting a1=(A120_UpcastingDowncasting)f; //downcasting - only explicitely
		
	//	Facebook f=(Facebook)new A120_UpcastingDowncasting(); //explicit upcasting
		

	}


}
