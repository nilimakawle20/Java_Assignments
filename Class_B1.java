/*Assignment-54 WAP to access the 4 access specifiers outside the package without becoming subclass*/
package pckg.a1;

import pckg.b1.IT_Industry;

public class Class_B1 {
	public static void main(String[] args) {
		IT_Industry i=new IT_Industry();
		i.employee_name(); //only public method accessed
	}

}
