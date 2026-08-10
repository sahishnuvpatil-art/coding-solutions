# Count Digits in a Number

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a number  **n**, return the count of digits in this number.

 **Examples :** 

```
Input: n = 1567
Output: 4
Explanation: There are 4 digits in 1567, which are 1, 5, 6 and 7.
```

```
Input: n = 99999
Output: 5
Explanation: Number of digit in 99999 is 5
```

 **Constraints:** 
1 ≤ n ≤ 109

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-08-10T17:44:12.322Z  

```java
class Solution {
    public static int countDigits(int n) {
        
        int count =0;
         while (n>0){
          count++;
          n/=10;
         }
         return count;
    }
}
        
    
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/count-total-digits-in-a-number/1)