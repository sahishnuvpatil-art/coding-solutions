# Three Consecutive Odds

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `arr`, return `true` if there are three consecutive odd numbers in the array. Otherwise, return `false`.

 

 **Example 1:** 

```
Input: arr = [2,6,4,1]
Output: false
Explanation: There are no three consecutive odds.

```

 **Example 2:** 

```
Input: arr = [1,2,34,3,4,5,7,23,12]
Output: true
Explanation: [5,7,23] are three consecutive odds.

```

 

 **Constraints:** 

- 1 <= arr.length <= 1000
- 1 <= arr[i] <= 1000

## Solution

**Language:** Java  
**Runtime:** 0 ms (beats 100.00%)  
**Memory:** 43.9 MB (beats 75.86%)  
**Submitted:** 2026-09-07T14:23:46.924Z  

```java
class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int c=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2!=0){
                count++;
                if(count>=3){
                    c++;
                }
            }else{

             count =0;
             }
        }
        if(c==0)return false;
        else return true;
       }
}
```

---

[View on LeetCode](https://leetcode.com/problems/three-consecutive-odds/)