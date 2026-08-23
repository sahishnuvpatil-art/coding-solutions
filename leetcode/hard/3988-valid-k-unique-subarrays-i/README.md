# Q4. Valid K-Unique Subarrays I

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an integer array `nums` and an integer `k`.

You are also given a 2D integer array `queries`, where `queries[i] = [li, ri]` represents the  **subarray**  `nums[li..ri]`.

For each query, the  **subarray**  `nums[li..ri]` is considered  **valid**  if:

- It contains exactly k distinct numbers, and
- The frequency of every number in the subarray is even.

Return a boolean array `ans`, where `ans[i]` is `true` if `nums[li..ri]` is  **valid**, and `false` otherwise.

 

 **Example 1:** 

 **Input:**  nums = [1,2,2,1], k = 2, queries = [[0,1],[0,3],[1,2]]

 **Output:**  [false,true,false]

 **Explanation:** 

`i`	`[li, ri]`	Subarray	Unique numbers	Frequency	Validity check
0	[0, 1]	[1, 2]	{1, 2} → 2	{1: 1, 2: 1}	`false`: Element counts are not even.
1	[0, 3]	[1, 2, 2, 1]	{1, 2} → 2	{1: 2, 2: 2}	`true`: Exactly `k = 2` distinct elements, all appear an even number of times.
2	[1, 2]	[2, 2]	{2} → 1	{2: 2}	`false`: Number of distinct elements is less than `k = 2`.

Thus, `ans = [false, true, false]`.

 **Example 2:** 

 **Input:**  nums = [3,3,3], k = 1, queries = [[1,2],[0,2]]

 **Output:**  [true,false]

 **Explanation:** 

`i`	`[li, ri]`	Subarray	Unique numbers	Frequency	Validity check
0	[1, 2]	[3, 3]	{3} → 1	{3: 2}	`true`: Exactly `k = 1` distinct element, appears an even number of times.
1	[0, 2]	[3, 3, 3]	{3} → 1	{3: 3}	`false`: 3 does not appear an even number of times.

Thus, `ans = [true, false]`.

 

 **Constraints:** 

- 2 <= n == nums.length <= 105
- 1 <= nums[i] <= 105
- 1 <= k <= n
- 1 <= queries.length <= 105
- queries[i] == [li, ri]
- 0 <= li < ri <= n - 1

## Solution

**Language:** Java  
**Runtime:** 143 ms (beats 100.00%)  
**Memory:** 213.2 MB (beats 100.00%)  
**Submitted:** 2026-08-23T16:56:11.072Z  

```java
class Solution {
    public boolean[] validSubarrays(int[] nums, int k, int[][] queries) {
        int n = nums.length;

        long[] h = new long[100001];

        for (int i = 1; i <= 100000; i++) {
            long x = i;
            x += 0x9e3779b97f4a7c15L;
            x = (x ^ (x >>> 30)) * 0xbf58476d1ce4e5b9L;
            x = (x ^ (x >>> 27)) * 0x94d049bb133111ebL;
            h[i] = x ^ (x >>> 31);
        }

        long[] pref = new long[n + 1];

        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] ^ h[nums[i]];
        }

        int[] leftK = computeLeft(nums, k);
        int[] leftKMinus1 = computeLeft(nums, k - 1);

        boolean[] ans = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            boolean exactK = leftK[r] <= l && l < leftKMinus1[r];
            boolean even = pref[l] == pref[r + 1];

            ans[i] = exactK && even;
        }

        return ans;
    }

    private int[] computeLeft(int[] nums, int k) {
        int n = nums.length;
        int[] left = new int[n];

        if (k == 0) {
            java.util.Arrays.fill(left, n);
            return left;
        }

        int[] freq = new int[100001];
        int distinct = 0;
        int l = 0;

        for (int r = 0; r < n; r++) {
            if (freq[nums[r]]++ == 0) {
                distinct++;
            }

            while (distinct > k) {
                if (--freq[nums[l]] == 0) {
                    distinct--;
                }
                l++;
            }

            left[r] = l;
        }

        return left;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/valid-k-unique-subarrays-i/)