# Get Smaller

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)

## Problem

Given an array  **arr,**  return all the elements which are less than a given value **x**. The order of returned smaller elements should be according their appearance in the input array. 

 **Examples:** 

```
Input: arr[] = [54, 43, 2, 1, 5], x = 7
Output: 2 1 5
Explanation: 2, 1, 5 are smaller than 7.
```

```
Input: arr[] = [324, 5, 2, 2, 3], x = 3
Output: 2 2
Explanation: 2, 2 are smaller than 3.
```

## Solution

**Language:** Java  
**Runtime:** N/A  
**Memory:** N/A  
**Submitted:** 2026-09-17T06:00:52.315Z  

```java
class Solution {
    public static ArrayList<Integer> getSmaller(int arr[], int x) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr){
            if(i<x){
                list.add(i);
            }
        }
        return list;
    }
}
```

---

[View on GeeksforGeeks](https://practice.geeksforgeeks.org/problems/get-smaller-elements/1)