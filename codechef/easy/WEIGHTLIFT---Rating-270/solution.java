import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		int c1=sc.nextInt();
		int c2=sc.nextInt();
		a1=Math.max(a1,a2);
		b1=Math.max(b1,b2);
		c1=Math.max(c1,c2);
		System.out.println(a1+b1+c1);
		
	}
}
