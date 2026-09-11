# Maximum Width Ramp

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

A  **ramp**  in an integer array `nums` is a pair `(i, j)` for which `i < j` and `nums[i] <= nums[j]`. The  **width**  of such a ramp is `j - i`.

Given an integer array `nums`, return  *the maximum width of a  **ramp**  in* `nums`. If there is no  **ramp**  in `nums`, return `0`.

 

 **Example 1:** 

```
Input: nums = [6,0,8,2,1,5]
Output: 4
Explanation: The maximum width ramp is achieved at (i, j) = (1, 5): nums[1] = 0 and nums[5] = 5.

```

 **Example 2:** 

```
Input: nums = [9,8,1,0,1,9,4,0,4,1]
Output: 7
Explanation: The maximum width ramp is achieved at (i, j) = (2, 9): nums[2] = 1 and nums[9] = 1.

```

 

 **Constraints:** 

- 2 <= nums.length <= 5 * 104
- 0 <= nums[i] <= 5 * 104

## Solution

**Language:** Java  
**Runtime:** 34 ms (beats 11.93%)  
**Memory:** 61.6 MB (beats 11.69%)  
**Submitted:** 2026-09-11T03:32:38.090Z  

```java
class Solution {
    public int maxWidthRamp(int[] nums) {
        int ans = 0;
        int n = nums.length;

        // Create a list of pairs (element, index)
        List<int[]> vp = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            vp.add(new int[]{nums[i], i});
        }

        // Sort the list based on the element values
        vp.sort((a, b) -> a[0] - b[0]);

        // Keep track of the minimum index seen so far
        int minIndex = vp.get(0)[1];

        // Traverse the sorted list to calculate the maximum width ramp
        for (int i = 1; i < n; i++) {
            int currentIndex = vp.get(i)[1];
            ans = Math.max(ans, currentIndex - minIndex);
            minIndex = Math.min(minIndex, currentIndex);
        }

        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-width-ramp/)