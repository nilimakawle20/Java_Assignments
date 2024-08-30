/*Calling non-static method with and without parameters inside main method*/
package assignment.basicprograms;

public class A13_Callnonstatic {
	void gross_salary_jr_emp()  //non-static method without parameters
	{
	int basic_sal=20000;
	int hra=5000;
	int allowances=6000;
	int gross_salary=basic_sal+hra+allowances;
	System.out.println("Jr. employee gross salary:"+gross_salary);
	}
	
	void gross_salary_sr_emp(int basic_sal, int hra, int allowances) //non-static method without parameters
	{
	int gross_salary=basic_sal+hra+allowances;
	System.out.println("Sr. employee gross salary:"+gross_salary);
	}
	
	public static void main(String[] args) 
	{
	A13_Callnonstatic gs=new A13_Callnonstatic();
	gs.gross_salary_jr_emp(); //calling non-static method without parameters
	gs.gross_salary_sr_emp(30000,8000,15000); //calling non-static method with parameters
	}

}
