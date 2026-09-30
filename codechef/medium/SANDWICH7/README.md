# SANDWICH7

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Sandwiches

Chef is running a sandwich shop. He has $B$ pieces of bread, $H$ pieces of ham, and $C$ pieces of cheese.

To make a sandwich, Chef uses $2$ pieces of bread, and one piece of either ham or cheese, not both.

Find the maximum number of sandwiches Chef can make.

### Input Format
- The first line contains $3$ integers - $B$, $H$ and $C$.
### Output Format

Output the maximum number of sandwiches Chef can make.

### Constraints
- $1 \le B, H, C \le 10$
### Sample 1:
Input
Output

```
8 3 1

```

```
4

```

### Explanation:

Chef can make $3$ ham sandwiches, and $1$ cheese sandwich, using exactly $8$ pieces of bread, $3$ pieces of ham, and $1$ piece of cheese.

### Sample 2:
Input
Output

```
3 2 2

```

```
1

```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-30T15:00:40.514Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int b=sc.nextInt();
		int h=sc.nextInt();
		int c=sc.nextInt();
		int in=h+c;
		int count=0;
		while(b>1 && in>0){
		    count++;
		    b-=2;
		    in--;
		}
		System.out.println(count);

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/SANDWICH7)