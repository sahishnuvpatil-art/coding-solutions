# Smallest Missing Multiple of K

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an integer array `nums` and an integer `k`, return the  **smallest positive multiple**  of `k` that is  **missing**  from `nums`.

A  **multiple**  of `k` is any positive integer divisible by `k`.

 

 **Example 1:** 

 **Input:**  nums = [8,2,3,4,6], k = 2

 **Output:**  10

 **Explanation:** 

The multiples of `k = 2` are 2, 4, 6, 8, 10, 12... and the smallest multiple missing from `nums` is 10.

 **Example 2:** 

 **Input:**  nums = [1,4,7,10,15], k = 5

 **Output:**  5

 **Explanation:** 

The multiples of `k = 5` are 5, 10, 15, 20... and the smallest multiple missing from `nums` is 5.

 

 **Constraints:** 

- 1 <= nums.length <= 100
- 1 <= nums[i] <= 100
- 1 <= k <= 100

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 82.00%)  
**Memory:** 44.9 MB (beats 76.35%)  
**Submitted:** 2026-08-25T17:05:11.587Z  

```java
class Solution {
    public int missingMultiple(int[] nums, int k) {
        long[] x = {0L, 0L};
        for (int n : nums)
            if (n % k == 0) {
                int i = n / k - 1;
                x[i >> 6] |= 1L << (i & 63);
            }
            
        int z = x[0] == -1L ? 1 : 0;
        return (z * 64 + Long.numberOfTrailingZeros(++x[z] & -x[z]) + 1) * k;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-missing-multiple-of-k/)