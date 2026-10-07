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
            int m = sc.nextInt();

            String sa = sc.next();
            String la = sc.next();

            int curr = 0;
            int ans = 0;

            char prev = ' ';

            for (int i = 0; i < n; i++) {
                char ch = sa.charAt(i);

                boolean l = la.indexOf(ch) != -1;

                if (i == 0) {
                    curr = 1;
                } else {
                    boolean previousLeft = la.indexOf(prev) != -1;

                    if (l == previousLeft) {
                        curr++;
                    } else {
                        curr = 1;
                    }
                }

                ans = Math.max(ans, curr);
                prev = ch;
            }

            System.out.println(ans);
        }
    }
}