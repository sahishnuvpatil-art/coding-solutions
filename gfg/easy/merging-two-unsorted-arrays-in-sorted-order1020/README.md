# Merge two Unsorted Arrays

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given two different unsorted arrays  **a[ ]**  and  **b[ ]**, the task is to merge the two unsorted arrays and return a sorted array.

 **Examples:** 

```
Input: a[] = [10, 5, 15], b[] = [20, 3, 2]
Output: [2, 3, 5, 10, 15, 20]
Explanation: After merging both the array's and sorting it, we get the above output.  

```

```
Input: a[] = [1, 10, 5, 15], b[] = [20, 0, 2]
Output: [0, 1, 2, 5, 10, 15, 20]
Explanation: After merging both the array's and sorting it, we get the above output.  
```

 **Constraints:** 
1 ≤ a.size(), b.size()≤ 105
-105 ≤ a[i], b[i]≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-25T03:01:24.696Z  

```java
class Solution {
    public int[] sortedMerge(int[] a, int[] b) {
        int []ans= new int[a.length+b.length];
        int index=0;
        for(int i=0;i<a.length;i++){
            ans[index++]=a[i];
        }
        for(int i=0;i<b.length;i++){
            ans[index++]=b[i];
        }
        Arrays.sort(ans);
        return ans;
       
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/merging-two-unsorted-arrays-in-sorted-order1020/1)