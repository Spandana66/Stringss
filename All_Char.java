package Stringssss;
import java.util.*;
public class All_Char
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:");
	String s= sc.next();
	for(int i=0;i<=s.length()-1;i++)
	{
		System.out.println(s.charAt(i));
	}
}
}
