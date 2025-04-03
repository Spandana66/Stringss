package Stringssss;
import java.util.*;
public class Two_Halfs 
{
public static void main(String[] args)
{
	String s="vamshi";
	String First_half="";
	String Second_half="";
	int size=s.length();
	int half=(size/2)-1;
	for(int i=0;i<=size-1;i++)
	{
		char ch=s.charAt(i);
		if(i<=half)
		{
			First_half=First_half+ch;
			
		}
		else
		{
			Second_half=Second_half+ch;
		}
	}
	System.out.println(First_half);
	System.out.println(Second_half);
}
}
