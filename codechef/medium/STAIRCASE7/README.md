# STAIRCASE7

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Staircase Edits

An array $A$ is called a staircase if it satisfies the following condition:

- $A_i - A_{i - 1} = 1$ for all $2 \le i \le |A|$

You are given an array $A$ of $N$ integers, which you want to convert into a staircase array. In one operation, you can change the value of any one position in the array $A$ to any integer you want.

Find the minimum number of edits needed to transform the array $A$ into a staircase.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains one integer $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the minimum edits to make the array $A$ a staircase.

### Constraints
- $1 \le T \le 10^4$
- $2 \le N \le 2 \cdot 10^5$
- $1 \le A_i \le N$
- The sum of $N$ over all test cases does not exceed $2 \cdot 10^5$.
### Sample 1:
Input
Output

```
3
4
1 2 3 4
4
4 4 1 2
3
3 2 1

```

```
0
2
2
```

### Explanation:

 **Test Case 1:**  The array is already a staircase.

 **Test Case 2:**  You can change $A_1$ and $A_2$ to get the array $[-1, 0, 1, 2]$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T15:32:12.600Z  

```java
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

          
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = a[i] - i;
            }

            
            int max = 0;
            for (int i = 0; i < n; i++) {
                int count = 0;
                for (int j = 0; j < n; j++) {
                    if (b[i] == b[j]) {
                        count++;
                    }
                }
                if (count > max) {
                    max = count;
                }
            }

            int e= n - max;
            System.out.println(e);
        }
        sc.close();

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/STAIRCASE7)