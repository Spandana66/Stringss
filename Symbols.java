package Stringssss;
import java.util.*;
public class Symbols 
{
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the string:");
	String s=sc.next();
	System.out.println("Symbols in the given String:");
	for(int i=0;i<=s.length()-1;i++)
	{
	char ch=s.charAt(i);
	if(!(ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch>='9'))
	{
		System.out.println(ch);
	}
	}
	
}
}
