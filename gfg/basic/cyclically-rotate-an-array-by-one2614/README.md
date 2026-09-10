# Rotate Array by One

![Difficulty](https://img.shields.io/badge/Difficulty-Basic-red)

## Problem

Given an array  **arr**, rotate the array by one position in clockwise direction.

 **Examples:** 

```
Input: arr[] = [1, 2, 3, 4, 5]
Output: [5, 1, 2, 3, 4]
Explanation: If we rotate arr by one position in clockwise 5 come to the front and remaining those are shifted to the end.
```

```
Input: arr[] = [9, 8, 7, 6, 4, 2, 1, 3]
Output: [3, 9, 8, 7, 6, 4, 2, 1]
Explanation: After rotating clock-wise 3 comes in first position.
```

 **Constraints:** 
1 ≤ arr.size() ≤ 105
0 ≤ arr[i] ≤ 105

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-10T04:31:09.221Z  

```java
class Solution {
    public void rotate(int[] arr) {
             int n =arr.length;
                int last = arr[arr.length- 1];

                // Shift all elements one step to the right
                for (int i = n - 1; i > 0; i--) {
                    arr[i] = arr[i - 1];
                }

                // Place the last element at the front
                arr[0] = last;
            
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/cyclically-rotate-an-array-by-one2614/1)