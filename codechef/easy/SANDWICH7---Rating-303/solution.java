import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
			int c=sc.nextInt();
				int h=sc.nextInt();
				int m=c+h;
				int count=0;
				while(b>1&&m>0){
				    b-=2;
				    m--;
				    count++;
				}
				System.out.println(count);

	}
}
