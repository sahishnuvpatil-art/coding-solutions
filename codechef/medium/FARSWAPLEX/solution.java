import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
        Scanner sc = new Scanner(System.in);

        int testCases = sc.nextInt();

        while (testCases-- > 0) {

            int n = sc.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }

            for (int start = 0; start < n; start++) {

                int best = start;

                for (int current = start + 1; current < n; current++) {

                    // Check if nums[current] can reach start
                    boolean possible = true;

                    for (int position = current - 1;
                         position >= start;
                         position--) {

                        if (Math.abs(nums[current] - nums[position]) <= 1) {
                            possible = false;
                            break;
                        }
                    }

                    if (possible && nums[current] < nums[best]) {
                        best = current;
                    }
                }

                int chosen = nums[best];

                for (int position = best; position > start; position--) {
                    nums[position] = nums[position - 1];
                }

                nums[start] = chosen;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(nums[i] + " ");
            }

            System.out.println();
        }

      

	}
}
