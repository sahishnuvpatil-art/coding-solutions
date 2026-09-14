import java.util.*;
import java.lang.*;
import java.io.*;


class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int m = sc.nextInt();

        int[] b = new int[m];

        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }

        ArrayList<Integer> chutney = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            int x = b[i];

            int bhalu = 0;
            int sher = 0;

            for (int j = 0; j < m; j++) {
                if (b[j] == x) {
                    bhalu++;
                }
            }

            for (int j = 0; j < n; j++) {
                if (a[j] == x) {
                    sher++;
                }
            }

            if (bhalu > sher && !chutney.contains(x)) {
                chutney.add(x);
            }
        }

        Collections.sort(chutney);

        if (chutney.size() == 0) {
            System.out.println(-1);
        } else {
            for (int x : chutney) {
                System.out.print(x + " ");
            }
        }
    }
}