# Reverse Substrings Between Each Pair of Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given a string `s` that consists of lower case English letters and brackets.

Reverse the strings in each pair of matching parentheses, starting from the innermost one.

Your result should  **not**  contain any brackets.

 

 **Example 1:** 

```
Input: s = "(abcd)"
Output: "dcba"

```

 **Example 2:** 

```
Input: s = "(u(love)i)"
Output: "iloveu"
Explanation: The substring "love" is reversed first, then the whole string is reversed.

```

 **Example 3:** 

```
Input: s = "(ed(et(oc))el)"
Output: "leetcode"
Explanation: First, we reverse the substring "oc", then "etco", and finally, the whole string.

```

 

 **Constraints:** 

- 1 <= s.length <= 2000
- s only contains lower case English characters and parentheses.
- It is guaranteed that all parentheses are balanced.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 100.00%)  
**Memory:** 42.9 MB (beats 90.82%)  
**Submitted:** 2026-09-27T08:54:01.740Z  

```java
class Solution {
    public String reverseParentheses(String s) {
        int n = s.length();
        int[] link = new int[n];
        Stack<Integer> stk = new Stack<>();

        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(')
                stk.push(i);
            else if (s.charAt(i) == ')') {
                link[i] = stk.pop();
                link[link[i]] = i;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0, dir = 1; i < n; i += dir) {
            if (s.charAt(i) >= 'a')
                sb.append(s.charAt(i));
            else {
                i = link[i];
                dir = -dir;
            }
        }
        
        return sb.toString();
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/reverse-substrings-between-each-pair-of-parentheses/)