/*WAP on Encapsulation for getter and setter*/
package encapsulation_program;
import java.util.Scanner;
class Employee
{
private double salary;
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}
public class A122_Encapsulation {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int emp_id=s.nextInt();
		System.out.println("Given employee id : "+emp_id);
		
		Employee e=new Employee();
		e.setSalary(55000);
		System.out.println("Salary for given employee id "+emp_id+" is "+e.getSalary());
	}

}
