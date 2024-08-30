/*Assignment-52 WAP to access the 4 access specifiers within the same package*/
package pckg.a1;

public class Company {
	public static void main(String[] args) {
		Employee e=new Employee();
		e.employee_name();              //only public,default and protected method accessed
		e.employee_designation();
		e.employee_healthinsurance();
	}

}
