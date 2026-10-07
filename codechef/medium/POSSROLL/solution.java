import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int K = sc.nextInt();
        int Y = sc.nextInt();

        if (Y % K == 0 && Y / K <= X) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

	}
}
