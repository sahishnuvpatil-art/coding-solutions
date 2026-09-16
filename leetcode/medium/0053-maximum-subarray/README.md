# Maximum Subarray

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Given an integer array `nums`, find the subarray with the largest sum, and return  *its sum*.

 

 **Example 1:** 

```
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.

```

 **Example 2:** 

```
Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.

```

 **Example 3:** 

```
Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

```

 

 **Constraints:** 

- 1 <= nums.length <= 105
- -104 <= nums[i] <= 104

 

 **Follow up:**  If you have figured out the `O(n)` solution, try coding another solution using the  **divide and conquer**  approach, which is more subtle.

## Solution

**Language:** Java  
**Runtime:** 1 ms (beats 99.93%)  
**Memory:** 77.3 MB (beats 48.99%)  
**Submitted:** 2026-09-16T03:26:46.817Z  

```java
class Solution {
    public int maxSubArray(int[] nums) {
        int max=nums[0];

        int currmax=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]+currmax>nums[i]){
                currmax+=nums[i];
            }else{
                currmax=nums[i];
            }
            max=Math.max(max,currmax);
        }
        return max;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/maximum-subarray/)