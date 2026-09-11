# Reverse a String

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

You are given a string  **`s`**, and your task is to reverse the string.

 **Examples:** 

```
Input: s = "Geeks"
Output: "skeeG"

```

```
Input: s = "for"
Output: "rof"
```

```
Input: s = "a"
Output: "a"
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-11T05:31:34.472Z  

```java
class Solution {
    public static String reverseString(String s) {
        StringBuilder sb=new StringBuilder(s);
        sb.reverse();
        
        return sb.toString();
        
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/reverse-a-string/1)