# CUTESTR - Rating 271

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

### Cute Strings

A string $S$ of length $3$ is called  *cute*  if it satisfies the following conditions:

- $S_1 = S_3$, i.e. its first and last characters are equal, and
- $S_2 = \texttt{w}$, i.e. its middle character is w.

Some examples of  *cute*  strings are `"owo"`, `"uwu"`, and `"qwq"`; whereas `"wwf"` and `"oco"` are examples of strings that are not  *cute*.

You are given a string $S$ of length $3$. Is it  *cute* ?

### Input Format
- The first and only line of input contains a string $S$ of length $3$.
### Output Format

On a single line, output the answer: `"Cute"` (without quotes) if $S$ is a  *cute*  string, and `"No"` (without quotes) otherwise.

Each character may be printed in either uppercase or lowercase, i.e. the strings `NO`, `No`, `nO`, and `no` will all be treated as equivalent.

### Constraints
- $S$ has length $3$.
- Each character of $S$ is a lowercase English letter, i.e. one of $\{\text{'a', 'b', } \ldots, \text{'z'}\}$.
### Sample 1:
Input
Output

```
owo
```

```
Cute
```

### Explanation:

`"owo"` is a  *cute*  string, because its middle character is `w` and its first and third characters are equal.

### Sample 2:
Input
Output

```
pwp
```

```
Cute
```

### Explanation:

`"pwp"` is a  *cute*  string, because its middle character is `w` and its first and third characters are equal.

### Sample 3:
Input
Output

```
pvp
```

```
No
```

### Explanation:

`"pvp"` is not a  *cute*  string, because its middle character is not `w`.

### Sample 4:
Input
Output

```
awe
```

```
No

```

### Explanation:

`"awe"` is not a  *cute*  string, because its first and third characters don't match.

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-10-06T06:54:02.169Z  

```java
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.charAt(0)==s.charAt(2)&&s.charAt(1)=='w')System.out.println("cute");
		else System.out.println("no");

	}
}

```

---

[View on CodeChef](https://www.codechef.com/problems/CUTESTR)