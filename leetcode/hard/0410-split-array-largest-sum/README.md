# Split Array Largest Sum

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given an integer array `nums` and an integer `k`, split `nums` into `k` non-empty subarrays such that the largest sum of any subarray is  **minimized**.

Return  *the minimized largest sum of the split*.

A  **subarray**  is a contiguous part of the array.

 

 **Example 1:** 

```
Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.

```

 **Example 2:** 

```
Input: nums = [1,2,3,4,5], k = 2
Output: 9
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [1,2,3] and [4,5], where the largest sum among the two subarrays is only 9.

```

 

 **Constraints:** 

- 1 <= nums.length <= 1000
- 0 <= nums[i] <= 106
- 1 <= k <= min(50, nums.length)

## Solution

**Language:** Java  
**Runtime:** 2 ms (beats 31.12%)  
**Memory:** 43 MB (beats 50.70%)  
**Submitted:** 2026-09-05T03:35:44.297Z  

```java
class Solution {
    public int splitArray(int[] nums, int k) {
        int low=0;
        int high=0;

        int sum=0;
        int max=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>max){
                max=nums[i];
            }
            sum+=nums[i];
        }
        low=max;
        high=sum;
        
        while(low<high){
            int mid=(low+high)/2;
            int parts=1;
            int currentsum=0;

            for(int i=0;i<nums.length;i++){
                if(currentsum+nums[i]>mid){
                    parts++;
                    currentsum=nums[i];
                }
                else{
                    currentsum+=nums[i];
                }
            }
            if(parts>k){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return low;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/split-array-largest-sum/)