import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int t= sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            String sa = sc.next();
            String la = sc.next();

            int curr = 0;
            int ans = 0;

            char prev = ' ';

            for (int i = 0; i < n; i++) {
                char ch = S.charAt(i);

                boolean l = la.indexOf(ch) != -1;

                if (i == 0) {
                    current = 1;
                } else {
                    boolean previousLeft = L.indexOf(previous) != -1;

                    if (left == previousLeft) {
                        current++;
                    } else {
                        current = 1;
                    }
                }

                answer = Math.max(answer, current);
                previous = ch;
            }

            System.out.println(answer);
        }


	}
}
