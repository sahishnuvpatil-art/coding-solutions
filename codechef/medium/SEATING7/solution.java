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
            int k = sc.nextInt();  

            boolean[] occupied = new boolean[n + 1];
            for (int i = 0; i < m; i++) {
                int seat = sc.nextInt();
                occupied[seat] = true;
            }

            int count = 0;
            for (int seat = 1; seat <= n && count < k; seat++) {
                if (!occupied[seat]) {
                    System.out.print(seat);
                    count++;
                    if (count < k) System.out.print(" ");
                }
            }
            System.out.println();
        }
        sc.close();

	}
}
