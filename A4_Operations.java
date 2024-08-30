/*Addition,subtraction,multiplication and division*/
package assignment.basicprograms;

public class A4_Operations {
    static void add(int a,int b)
    {
    	int sum=a+b;
    	System.out.println(sum);
    }
    static void sub(int a,int b)
    {
    	int sub=a-b;
    	System.out.println(sub);
    }
    static void mul(int a,int b)
    {
    	int mul=a*b;
    	System.out.println(mul);
    }
    static void div(int a,int b)
    {
    	int div=a/b;
    	System.out.println(div);
    }
    
	public static void main(String[] args) 
	{
		add(101,201); //calls static method for add operation
		sub(200,500); //calls static method for sub operation
		mul(25,40); //calls static method for mul operation
		div(44,15); //calls static method for div operation
	}
}
