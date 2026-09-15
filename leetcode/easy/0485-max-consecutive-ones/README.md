# Max Consecutive Ones

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given a binary array `nums`, return  *the maximum number of consecutive* `1` *'s in the array*.

 

 **Example 1:** 

```
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

```

 **Example 2:** 

```
Input: nums = [1,0,1,1,0,1]
Output: 2

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- nums[i] is either 0 or 1.

## Solution

**Language:** Java  
**Runtime:** 3 ms (beats 58.67%)  
**Memory:** 52.3 MB (beats 92.40%)  
**Submitted:** 2026-09-15T02:34:44.781Z  

```java
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int  count=0;
        int mcount=0;
         for(int n:nums ){
            if(n==1){
                count++;
            }else{
                count=0;
            }
            if(mcount<count)mcount=count;
         }
         return mcount;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/max-consecutive-ones/)