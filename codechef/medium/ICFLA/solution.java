import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long bhalu = 1;

        while (bhalu * (bhalu - 1) / 2 < n) {
            bhalu++;
        }

        System.out.println(bhalu);
    }
}

	
