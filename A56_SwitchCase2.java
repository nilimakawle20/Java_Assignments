/*WAP using switch case*/
package assignment.basicprograms;

import java.util.Scanner;

public class A56_SwitchCase2 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Choose your favourite icecream: 1 for cornetto, 2 for butterscotch, 3 for vanilla and 4 for mango flavour");
		int ch=s.nextInt();
		
		switch(ch)
		{
		case 1:
			System.out.println("Customer want cornetto");
			break;
		case 2:
			System.out.println("Customer want butterscotch");
			break;
		case 3:
			System.out.println("Customer want vanilla");
			break;
		case 4:
			System.out.println("Customer want mango flavour");
			break;
		default:
			System.out.println("Sorry the icecream flavour you asked is not available");	
		}

}
}
