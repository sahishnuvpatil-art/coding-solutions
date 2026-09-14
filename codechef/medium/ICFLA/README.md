# ICFLA

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Ice Cream Flavours

Tema makes ice cream cones using  **exactly two balls**. Each ball has a flavour represented by a positive integer.

A cone may contain two balls of the same flavour or two different flavours. The order of the balls does not matter, so $\{1,2\}$ and $\{2,1\}$ represent the same type, while $\{1,1\}$ and $\{1,2\}$ represent different types.

Tema does not need to make all cones at the same time, so the same balls may be reused for different cones. However, to make a cone of type $\{x,x\}$, he must have at least two balls of flavour $x$.

Given an integer $N$, find the  **minimum number of balls**  Tema must have so that he can make exactly $N$ different types of ice cream.

### Input Format
- The first line contains an integer $N$ — the number of different ice cream types Tema wants to make.
### Output Format
- Print a single integer — the minimum number of balls required.
### Constraints
- $1 \le N \le 10^{18}$
### Sample 1:
Input
Output

```
6
```

```
4
```

### Explanation:

With $4$ balls of distinct flavours, for example $\{1,2,3,4\}$, Tema can make $6$ different types:

$\{1,2\},\{1,3\},\{1,4\},\{2,3\},\{2,4\},\{3,4\}$.

With fewer than $4$ balls, it is not possible to make $6$ different types.

Therefore, the minimum number of balls required is  **4**.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-14T15:20:42.090Z  

```java
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
```

---

[View on CodeChef](https://www.codechef.com/problems/ICFLA)