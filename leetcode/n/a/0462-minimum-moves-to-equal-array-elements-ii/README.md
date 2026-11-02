# Minimum Moves to Equal Array Elements II

![Difficulty](https://img.shields.io/badge/Difficulty-N/A-red)

## Problem

Myntra
tcs
Microsoft
Google
Amazon

Given an integer array `nums` of size `n`, return  *the minimum number of moves required to make all array elements equal*.

In one move, you can increment or decrement an element of the array by `1`.

Test cases are designed so that the answer will fit in a  **32-bit**  integer.

 

 **Example 1:** 

```
Input: nums = [1,2,3]
Output: 2
Explanation:
Only two moves are needed (remember each move increments or decrements one element):
[1,2,3]  =>  [2,2,3]  =>  [2,2,2]

```

 **Example 2:** 

```
Input: nums = [1,10,2,9]
Output: 16

```

 

 **Constraints:** 

- n == nums.length
- 1 <= nums.length <= 105
- -109 <= nums[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 98.68%)  
**Memory:** 46.3 MB (beats 97.44%)  
**Submitted:** 2026-11-02T17:51:28.958Z  

```java
class Solution {
    private static final Random RNG = new Random();

    public int minMoves2(int[] nums) {
        int med = quickselect(nums, nums.length / 2), moves = 0;
        for (int x : nums) moves += Math.abs(x - med);
        return moves;
    }

    private static int quickselect(int[] a, int k) {
        int lo = 0, hi = a.length - 1;
        while (true) {
            int pivot = a[lo + RNG.nextInt(hi - lo + 1)];
            int lt = lo, i = lo, gt = hi;  // a[lo..lt) < pivot, a[lt..i) == pivot, a(gt..hi] > pivot
            while (i <= gt) {
                if (a[i] < pivot) swap(a, lt++, i++);
                else if (a[i] > pivot) swap(a, i, gt--);
                else i++;
            }
            if (k < lt) hi = lt - 1;
            else if (k > gt) lo = gt + 1;
            else return pivot;
        }
    }

    private static void swap(int[] a, int i, int j) {
        int t = a[i]; a[i] = a[j]; a[j] = t;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-moves-to-equal-array-elements-ii/)