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

            long[] arr = new long[N];
            long total = 0;

            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextLong();
                total += arr[i];
            }

            Arrays.sort(arr);

            long redSum = 0;
            long answer = 0;

            for (int redCount = 1; redCount < N; redCount++) {


                redSum = redSum + arr[N - redCount];

                long blueSum = total - redSum;

                int blueCount = N - redCount;

                long value = redSum * blueCount
                           + blueSum * redCount;

                if (value > answer) {
                    answer = value;
                }
            }

            System.out.println(answer);
        }

        
    }
}
