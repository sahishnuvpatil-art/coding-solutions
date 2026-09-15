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
**Runtime:** 7 ms (beats 44.97%)  
**Memory:** 63.1 MB (beats 7.20%)  
**Submitted:** 2026-09-15T03:18:19.959Z  

```java
class Solution {
    public int majorityElement(int[] nums) {
         int l=nums.length/2;
         Arrays.sort(nums);
         int ans=nums[l];
         return ans;
        
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/majority-element/)