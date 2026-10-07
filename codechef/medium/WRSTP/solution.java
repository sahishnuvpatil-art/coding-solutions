import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0)
        {
            int n = sc.nextInt();
            String s = sc.next();

            int a = 0;
            int b = 0;

            for (int i = 0; i < n; i++)
            {
                char ch = s.charAt(i);

                if (ch == 'U')
                    b++;
                else if (ch == 'D')
                    b--;
                else if (ch == 'L')
                    a--;
                else if (ch == 'R')
                    a++;
            }

           
            if ((Math.abs(a) == 2 && b == 0) || (Math.abs(b) == 2 && a == 0))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}