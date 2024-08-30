/*StringBuffer append, insert,replace,delete, reverse,charAt,capacity,length, substring(oneparameter),
substring(oneparameter, two parameter)*/
package stringbuffer.builder;
public class A123_StringBufferFunction {
	public static void main(String[] args) {
		StringBuffer s1=new StringBuffer("Nilima Kawle");
		StringBuffer s2=s1.append(" Student"); //append(String str)
		System.out.println(s2);
		
		StringBuffer s3=s1.insert(6, " Kumari"); //insert(int offset, String str)
		System.out.println(s3);
		
		StringBuffer s4=s1.replace(7, 13, "Rani"); //insert(int startIndex, int endIndex, String str)
		System.out.println(s4);
		
		StringBuffer s5=s1.delete(7, 12); //delete(int startIndex, int endIndex)
		System.out.println(s5);
		
		System.out.println(s1.reverse()); //reverse()
		
		System.out.println(s1.charAt(15)); //charAt(int index)
		
		System.out.println(s1.capacity()); //capacity()
		
		System.out.println(s1.length()); //length()
		
		System.out.println(s1.substring(3)); //substring(int beginIndex)
		
		System.out.println(s1.substring(4,13)); //substring(int beginIndex, int endIndex)
	}

}
