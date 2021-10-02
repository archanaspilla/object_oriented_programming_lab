
import java.io.*;
class StringAndStringBuffer_Pgm18
 {
	public static void main(String[] args)
	{
	StringBuffer s = new StringBuffer("Dhanya");
		int p = s.length();
		int q = s.capacity();
		System.out.println("Length of string Dhanya =" + p);
		System.out.println("Capacity of string Dhanya=" + q);
    s.append(" Jose");
    System.out.println("After Appending="+s);
   
    s.reverse();
    System.out.println("After reversing ="+s);
    s.delete(0, 2);
            System.out.println("After deteting the array from 0 to 2 position="+s);
            s.deleteCharAt(1);
            System.out.println("After deteting a character @1 position="+s);
            s.replace(0,5,"a");
            System.out.println("After replacing with 'a' from 0th to 5th position ="+s);

            String s1="welcome to java programming ";
          char ch[]={'s','t','r','i','n','g','s'};
          String s2=new String(ch);
          System.out.println("string s1="+s1);
          System.out.println("string s2="+s2);
          char c=s1.charAt(5);
           System.out.println("returning the char value at the 5th index of string s1= "+c);
           
           s1=s1.concat(" ... let's crack it");
           System.out.println("After concatenation with string s1 ="+s1);
           String s3="Hello ALEENA";
String s3lower=s3.toLowerCase();
System.out.println("lower case of string 3 is "+s3lower);
String s4=" hello string ";
String s4upper=s4.toUpperCase();
System.out.println("upper case of string 4 is "+s4upper);
System.out.println("without trimming:");
System.out.println(s4+" welcome");
System.out.println("with trimming:");
System.out.println(s4.trim()+" welcome");
}
}
