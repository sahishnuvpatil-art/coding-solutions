# JUMPCOST

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

### Jumping Cost

You have an array $A$ of $N$ elements.

You are currently at index $1$ with a balance of $0$, and you can do the following jump operation as many times as you want:

- Choose to jump from index $i$ to index $j$ ($i < j$), and add $(A_j - j + i)$ to your balance.

Find the maximum possible balance you can have at any point using these jump operations.

### Input Format
- The first line of input will contain a single integer $T$, denoting the number of test cases.
- Each test case consists of multiple lines of input. The first line contains a single integer $N$. The second line contains $N$ integers - $A_1, A_2, \ldots, A_N$.
### Output Format

For each test case, output on a new line the maximum balance you can have.

### Constraints
- $1 \le T \le 100$
- $2 \le N \le 100$
- $-100 \le A_i \le 100$
### Sample 1:
Input
Output

```
3
6
5 5 -1 5 -1 1
5
5 5 5 5 5
3
-4 -1 -5

```

```
7
16
0

```

### Explanation:

 **Test Case 1:**  Optimal is to jump from index $1$ to $2$ and then to $4$.

 **Test Case 3:**  Optimal is to not take any jumps at all.

## Solution

**Language:** Python  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-05T16:30:07.449Z  

```py
# cook your dish here
impoer sys 

def solve();
input =sys.stdin.read
data=input().split()

if not data:
    return 

t=int(data(0))
idx=1

out =[]
for _ in range(t);
n=int(data[idx])
a=[0] +[int(x) for x in data[idx+1: idx+1+n]]

dp=[-float ('inf')]*(n*1)

dp[1]=0

max_prev_expr=dp[1]+1;
for j in range (2,n+1)

dp[j]=
```

---

[View on CodeChef](https://www.codechef.com/problems/JUMPCOST)