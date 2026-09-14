import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		

        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        long left = 1;
        long right = 2000000001L;
        long ans = right;

        while (left <= right) {

            long mid = left + (right - left) / 2;

            long pairs = mid * (mid - 1) / 2;

            if (pairs >= n) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(ans);
    }
}