import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc=new Scanner(System.in);
	    int t=sc.nextInt();
		while(t-->0){
		   int points=sc.nextInt();
		   int st=sc.nextInt();
		   int val=points/10;
		   System.out.println(val*st);
		}

	}
}
