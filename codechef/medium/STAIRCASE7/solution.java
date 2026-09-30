import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            Map<Integer, Integer> mp = new HashMap<>();
            for (int i = 0; i < n; i++) {
                int val = a[i] - i;
                mp.put(val, mp.getOrDefault(val, 0) + 1);
            }

            int mx = 0;
            for (int c : mp.values()) {
                if (c > mx) mx = c;
            }

            int ans = n - mx;
            System.out.println(ans);
        }
        sc.close();
    }
}
