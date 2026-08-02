# Number of Unique XOR Triplets II

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

You are given an integer array `nums`.

A  **XOR triplet**  is defined as the XOR of three elements `nums[i] XOR nums[j] XOR nums[k]` where `i <= j <= k`.

Return the number of  **unique**  XOR triplet values from all possible triplets `(i, j, k)`.

 

 **Example 1:** 

 **Input:**  nums = [1,3]

 **Output:**  2

 **Explanation:** 

The possible XOR triplet values are:

- (0, 0, 0) → 1 XOR 1 XOR 1 = 1
- (0, 0, 1) → 1 XOR 1 XOR 3 = 3
- (0, 1, 1) → 1 XOR 3 XOR 3 = 1
- (1, 1, 1) → 3 XOR 3 XOR 3 = 3

The unique XOR values are `{1, 3}`. Thus, the output is 2.

 **Example 2:** 

 **Input:**  nums = [6,7,8,9]

 **Output:**  4

 **Explanation:** 

The possible XOR triplet values are `{6, 7, 8, 9}`. Thus, the output is 4.

 

 **Constraints:** 

- 1 <= nums.length <= 1500
- 1 <= nums[i] <= 1500

## Solution

**Language:** C++  
**Runtime:** 991 ms (beats 39.14%)  
**Memory:** 35.6 MB (beats 72.82%)  
**Submitted:** 2026-08-02T10:46:28.111Z  

```cpp
class Solution {
public:
    int uniqueXorTriplets(vector<int>& nums) {

        if(nums.size() == 1) return 1;

        const int MAX = 2048;

        vector<bool> one(MAX, false);
        vector<bool> two(MAX, false);
        vector<bool> three(MAX, false);

        // Build XOR values using one and two elements
        for (int val : nums) {
            for (int x = 0; x < MAX; x++) {
                if (one[x])
                    two[x ^ val] = true;
            }
            one[val] = true;
        }

        // Build XOR values using three elements
        for (int val : nums) {
            for (int x = 0; x < MAX; x++) {
                if (two[x])
                    three[x ^ val] = true;
            }
        }

        int ans = 0;
        for (bool exists : three)
            ans += exists;

        return ans;
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/number-of-unique-xor-triplets-ii/)