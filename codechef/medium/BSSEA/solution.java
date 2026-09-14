import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
      Scanner sc=new Scanner (System.in);
      int n=sc.nextInt();
      int []st=new int[n];
      
      for(int i=0;i<n;i++){
          st[i]=sc.nextInt();
      }
      Arrays.sort(st);
      int one=st[0];
      int last=st[st.length-1];
      int ot=(one+last)/2;
      System.out.print(ot);

	}
}
