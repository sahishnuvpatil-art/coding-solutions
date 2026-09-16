import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int cookies=0;
    if((a+b)%2!=0){
        return -1;
    }else{
       cookies=(a-b)/2;
       
    }
    return cookies;
	}
}
