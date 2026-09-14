import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        long[] t = new long[n];

        for (int i = 0; i < n; i++) {
            t[i] = sc.nextLong();
        }

        long target = t[k];
        long time = 0;

        for (int i = 0; i < n; i++) {

            if (i <= k) {
                time += Math.min(t[i], target);
            } else {
                time += Math.min(t[i], target - 1);
            }
        }

        System.out.println(time);
    }
}

	}
}
