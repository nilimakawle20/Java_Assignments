/*initialization and declaration of all methods of scanner class*/
package assignment.basicprograms;

import java.util.Scanner;

public class A33_ScannerClassMethods {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		byte a=s.nextByte();
		short b=s.nextShort();
		int c=s.nextInt();
		long d=s.nextLong();
		
		float f=s.nextFloat();
		double db=s.nextDouble();
		
		boolean bl=s.nextBoolean();
		String str=s.next();
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		
		System.out.println(f);
		System.out.println(db);
		
		System.out.println(bl);
		System.out.println(str);

	}

}
