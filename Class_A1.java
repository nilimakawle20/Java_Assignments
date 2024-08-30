/*Assignment-53 WAP to access the 4 access specifiers outside the package by becoming subclass*/
package pckg.a1;

import pckg.b1.IT_Industry;

public class Class_A1 extends IT_Industry{
	public static void main(String[] args) {
		Class_A1 a=new Class_A1();
		a.employee_name();              //only public and protected method accessed
		a.employee_designation();
	}

}
