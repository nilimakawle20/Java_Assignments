/*Calling static method with and without parameters inside main method*/
package assignment.basicprograms;

public class A12_CallStatic {
	static void gross_salary_jr_emp()  //static method without parameters
	{
	int basic_sal=20000;
	int hra=5000;
	int allowances=6000;
	int gross_salary=basic_sal+hra+allowances;
	System.out.println("Jr. employee gross salary:"+gross_salary);
	}
	
	static void gross_salary_sr_emp(int basic_sal, int hra, int allowances) //static method without parameters
	{
	int gross_salary=basic_sal+hra+allowances;
	System.out.println("Sr. employee gross salary:"+gross_salary);
	}
	
	public static void main(String[] args) 
	{
	gross_salary_jr_emp(); //calling static method without parameters
	gross_salary_sr_emp(30000,8000,15000); //calling static method with parameters
	}

}
