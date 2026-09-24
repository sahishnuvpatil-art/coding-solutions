# All Subsequences of String

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given a string  **s**, generate all possible subsequences of the string (including the empty subsequence) and return them in lexicographical order.

A subsequence is obtained by deleting zero or more characters from the string without changing the relative order of the remaining characters.

 **Examples:** 

```
Input : s = "abc"
Output: ["", "a", "ab", "abc", "ac", "b", "bc", "c"]
Explanation: There are a total of 8 non-empty subsequences for the given string. 
```

```
Input: s = "aa"
Output: ["", "a", "a", "aa"]
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-24T04:00:45.284Z  

```java
import java.util.*;

class Solution {
    void allSubsequence(String p, String up, List<String> sahi) {
        if (up.length() == 0) {
            sahi.add(p);
            return;
        }
        char ch = up.charAt(0);

   
        allSubsequence(p + ch, up.substring(1), sahi);

        allSubsequence(p, up.substring(1), sahi);
    }

    public List<String> powerSet(String s) {
        List<String> sahi = new ArrayList<>();
        allSubsequence("", s, sahi);
        Collections.sort(sahi);
        return sahi;
    }
}

```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/power-set4302/1)