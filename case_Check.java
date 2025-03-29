package Stringssss;
import java.util.*;
public class Case_CheckStr 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Read the Question carefully");
	System.out.println("****Sun rises in the East****");
	System.out.println("Enter whether it is true or false:");
	String ans=sc.next();
	if(ans.equalsIgnoreCase("true"))
	{
		System.out.println("It is CORRECT");
	}
	else
	{
		System.out.println("It is INCORRECT");
	}
}
}
