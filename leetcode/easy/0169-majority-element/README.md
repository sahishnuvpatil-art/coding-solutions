# Majority Element

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array `nums` of size `n`, return  *the majority element*.

The majority element is the element that appears more than `⌊n / 2⌋` times. You may assume that the majority element always exists in the array.

 

 **Example 1:** 

```
Input: nums = [3,2,3]
Output: 3

```

 **Example 2:** 

```
Input: nums = [2,2,1,1,1,2,2]
Output: 2

```

 

 **Constraints:** 

- n == nums.length
- 1 <= n <= 5 * 104
- -109 <= nums[i] <= 109
- The input is generated such that a majority element will exist in the array.

 

 **Follow-up:**  Could you solve the problem in linear time and in `O(1)` space?

## Solution

**Language:** Java  
**Runtime:** 1 ms  
**Memory:** 42.9 MB  
**Submitted:** 2026-09-15T03:16:48.414Z  

```java
class Solution {
    public int majorityElement(int[] nums) {
         int l=nums.length;
        int newl=0;
        int ans=0;
        if(l%2==0){
          newl=l/2;
        }else{
            newl=(l/2);
        }
        Arrays.sort(nums);
        if(nums[l-1]==nums[newl]){
           ans=nums[l-1];

        }else{
            ans=nums[0];
        }
        ans=ans*1;
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)