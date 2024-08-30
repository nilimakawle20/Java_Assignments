/*WAP with assert keyword*/
package keywordsinjava;

public class A116_AssertKeyword {

	public static void main(String[] args) {
		String s="Nilima";
		assert s.length()>1;
		System.out.println("assert without condition");
		
	    int age=20;
		assert age<18:"assert with condition failed";
		System.out.println("You cannot vote");
		
	
		

	}

}
