# Count Odd Numbers in an Interval Range

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two non-negative integers `low` and `high`. Return the  *count of odd numbers between* `low` *and* `high` *(inclusive)*.

 

 **Example 1:** 

```
Input: low = 3, high = 7
Output: 3
Explanation: The odd numbers between 3 and 7 are [3,5,7].
```

 **Example 2:** 

```
Input: low = 8, high = 10
Output: 1
Explanation: The odd numbers between 8 and 10 are [9].
```

 

 **Constraints:** 

- 0 <= low <= high <= 10^9

## Solution

**Language:** Java  
**Runtime:** 823 ms (beats 5.08%)  
**Memory:** 42.1 MB (beats 41.93%)  
**Submitted:** 2026-09-08T08:01:47.195Z  

```java
class Solution {
    public int countOdds(int low, int high) {
        int count=0;
        int newl=0;
        if(low%2!=0){
            newl=low;

        }else{
            newl=low+1;
        }
        for(int i=newl;i<=high;i=i+2){
            count++;
        }
        return count;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/)