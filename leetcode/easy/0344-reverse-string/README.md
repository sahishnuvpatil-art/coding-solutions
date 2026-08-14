# Reverse String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Write a function that reverses a string. The input string is given as an array of characters `s`.

You must do this by modifying the input array in-place with `O(1)` extra memory.

 

 **Example 1:** 

```
Input: s = ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]

```

 **Example 2:** 

```
Input: s = ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]

```

 

 **Constraints:** 

- 1 <= s.length <= 105
- s[i] is a printable ascii character.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 23.08%)  
**Memory:** 49.4 MB (beats 5.60%)  
**Submitted:** 2026-08-14T07:16:13.454Z  

```java
// by sahishu patil
//on 14 aug 26 at 12:46


class Solution {
    
    void f(int i, char[] s, int n) {
        if (i >= n / 2) return; 
       
        char temp = s[i];
        s[i] = s[n - i - 1];
        s[n - i - 1] = temp;
        
      
        f(i + 1, s, n);
    }

    public void reverseString(char[] s) {
        f(0, s, s.length);
    }
}

```

---

[View on LeetCode](https://leetcode.com/problems/reverse-string/)