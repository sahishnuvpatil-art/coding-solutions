import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int h=sc.nextInt();
		int c=sc.nextInt();
		int in=h+c;
		int count=0;
		while(b>1 && in>0){
		    count++;
		    b-=2;
		    in--;
		}
		System.out.println(count);

	}
}
