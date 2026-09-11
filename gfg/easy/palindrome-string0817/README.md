# Palindrome String

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a string  **s**, find if it is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.

 **Examples :** 

```
Input: s = "abba"
Output: true
Explanation: "abba" reads the same forwards and backwards, so it is a palindrome.
```

```
Input: s = "abc" 
Output: false
Explanation: "abc" does not read the same forwards and backwards, so it is not a palindrome.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-11T05:39:41.012Z  

```java
class Solution {
    boolean isPalindrome(String s) {
       
        StringBuilder sb=new StringBuilder(s);
       
                sb.reverse();
            String b=  sb.toString();
              return b.equals(s);
       
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/palindrome-string0817/1)