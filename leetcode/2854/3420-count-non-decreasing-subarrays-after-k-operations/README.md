# Count Non-Decreasing Subarrays After K Operations

![Difficulty](https://img.shields.io/badge/Difficulty-2854-red)

## Problem

You are given an array `nums` of `n` integers and an integer `k`.

For each subarray of `nums`, you can apply  **up to**  `k` operations on it. In each operation, you increment any element of the subarray by 1.

 **Note**  that each subarray is considered independently, meaning changes made to one subarray do not persist to another.

Return the number of subarrays that you can make  **non-decreasing**  ​​​​​after performing at most `k` operations.

An array is said to be  **non-decreasing**  if each element is greater than or equal to its previous element, if it exists.

 

Original
Java
 **Example 1:** 

 **Input:**  nums = [6,3,1,2,4,4], k = 7

 **Output:**  17

 **Explanation:** 

Out of all 21 possible subarrays of `nums`, only the subarrays `[6, 3, 1]`, `[6, 3, 1, 2]`, `[6, 3, 1, 2, 4]` and `[6, 3, 1, 2, 4, 4]` cannot be made non-decreasing after applying up to k = 7 operations. Thus, the number of non-decreasing subarrays is `21 - 4 = 17`.

 **Example 2:** 

 **Input:**  nums = [6,3,1,3,6], k = 4

 **Output:**  12

 **Explanation:** 

The subarray `[3, 1, 3, 6]` along with all subarrays of `nums` with three or fewer elements, except `[6, 3, 1]`, can be made non-decreasing after `k` operations. There are 5 subarrays of a single element, 4 subarrays of two elements, and 2 subarrays of three elements except `[6, 3, 1]`, so there are `1 + 5 + 4 + 2 = 12` subarrays that can be made non-decreasing.

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 109
- 1 <= k <= 109

## Solution

**Language:** Java  
**Runtime:** 32 ms (beats 53.57%)  
**Memory:** 128.5 MB (beats 85.71%)  
**Submitted:** 2026-11-13T08:56:11.539Z  

```java
class Solution {
    public long countNonDecreasingSubarrays(int[] nums, int k) {
        long ans = 0;
        long cost = 0;
        Deque<int[]> dq = new ArrayDeque<>();
        int n = nums.length;
        for (int i = n - 1, j = n - 1; i >= 0; --i) {
            int num = nums[i];
            int count = 1;
            while (!dq.isEmpty() && dq.peekLast()[0] < num) {
                int[] back = dq.pollLast();
                count += back[1];
                cost += (long) (num - back[0]) * back[1];
            }
            dq.offerLast(new int[]{num, count});
            while (cost > k) {
                int[] front = dq.pollFirst();
                cost -= (long) (front[0] - nums[j]);
                --j;
                if (front[1] > 1) {
                    dq.offerFirst(new int[]{front[0], front[1] - 1});
                }
            }
            ans += j - i + 1;
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/count-non-decreasing-subarrays-after-k-operations/)