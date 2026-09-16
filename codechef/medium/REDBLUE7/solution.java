import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            long sum = 0;
            long max = 0;

            for (int i = 0; i < N; i++) {
                long x = sc.nextLong();

                sum += x;
                max = Math.max(max, x);
            }

            long answer = sum + (N - 2L) * max;

            System.out.println(answer);
        }

       
	}
}
