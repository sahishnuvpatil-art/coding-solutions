# WEIGHTLIFT - Rating 270

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Weightlifting

Chef, being an international powerlifter, has participated in a powerlifting competition.

The competition consists of three rounds, i.e., squat, bench press, and, deadlift. In each round, the goal is to lift maximum weight, and Chef gets two attempts to do that.

For each round, the score of best attempt is taken into consideration and the total score is calculated as the sum of scores of all rounds.

You are given Chef's score in both attempts of rounds $1, 2,$ and $3,$ as $A_1, A_2, B_1, B_2, C_1,$ and $C_2$ respectively. Find the value of Chef's total score in the competition.

### Input Format

The first and only line of input consists of $6$ space separated integers $A_1, A_2, B_1, B_2, C_1, C_2$, denoting Chef's score in both attempts of round $1, 2,$ and $3$ respectively.

### Output Format

Output a single integer denoting Chef's total score in the competition.

### Constraints
- $200 \leq A_1, A_2, B_1, B_2, C_1, C_2 \leq 300$
### Sample 1:
Input
Output

```
250 240 205 217 296 299

```

```
766
```

### Explanation:

Chef's score in each round:

- In round $1$, he scored $250$ and $240$ in both attempts. Thus, the score under consideration would be $250$.
- In round $2$, he scored $205$ and $217$ in both attempts. Thus, the score under consideration would be $217$.
- In round $3$, he scored $296$ and $299$ in both attempts. Thus, the score under consideration would be $299$.

Chef's total score in competition is $250+217+299 = 766$.

### Sample 2:
Input
Output

```
207 220 200 200 300 289

```

```
720
```

### Explanation:

Chef's score in each round:

- In round $1$, he scored $207$ and $220$ in both attempts. Thus, the score under consideration would be $220$.
- In round $2$, he scored $200$ in both attempts. Thus, the score under consideration would be $200$.
- In round $3$, he scored $300$ and $289$ in both attempts. Thus, the score under consideration would be $300$.

Chef's total score in competition is $220+200+300 = 720$.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T06:43:21.975Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int a1=sc.nextInt();
		int a2=sc.nextInt();
		int b1=sc.nextInt();
		int b2=sc.nextInt();
		int c1=sc.nextInt();
		int c2=sc.nextInt();
		a1=Math.max(a1,a2);
		b1=Math.max(b1,b2);
		c1=Math.max(c1,c2);
		System.out.println(a1+b1+c1);
		
	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/WEIGHTLIFT)