package Stringssss;
import java.util.*;
public class Check_SubString 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Gamailid:");
	String mail=sc.next();
	if(mail.contains("@gmail.com"))
	{
		System.out.println("valid gmailid");
	}
	else
	{
		System.out.println("Invalid gmailid");
	}
}
}
