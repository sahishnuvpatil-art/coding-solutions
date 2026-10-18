# Minimum Swaps to Sort by Digit Sum

![Difficulty](https://img.shields.io/badge/Difficulty-1506-red)

## Problem

You are given an array `nums` of  **distinct**  positive integers. You need to sort the array in  **increasing**  order based on the sum of the digits of each number. If two numbers have the same digit sum, the  **smaller**  number appears first in the sorted order.

Return the  **minimum**  number of swaps required to rearrange `nums` into this sorted order.

A  **swap**  is defined as exchanging the values at two distinct positions in the array.

 

 **Example 1:** 

 **Input:**  nums = [37,100]

 **Output:**  1

 **Explanation:** 

- Compute the digit sum for each integer: [3 + 7 = 10, 1 + 0 + 0 = 1] → [10, 1]
- Sort the integers based on digit sum: [100, 37]. Swap 37 with 100 to obtain the sorted order.
- Thus, the minimum number of swaps required to rearrange nums is 1.

 **Example 2:** 

 **Input:**  nums = [22,14,33,7]

 **Output:**  0

 **Explanation:** 

- Compute the digit sum for each integer: [2 + 2 = 4, 1 + 4 = 5, 3 + 3 = 6, 7 = 7] → [4, 5, 6, 7]
- Sort the integers based on digit sum: [22, 14, 33, 7]. The array is already sorted.
- Thus, the minimum number of swaps required to rearrange nums is 0.

 **Example 3:** 

 **Input:**  nums = [18,43,34,16]

 **Output:**  2

 **Explanation:** 

- Compute the digit sum for each integer: [1 + 8 = 9, 4 + 3 = 7, 3 + 4 = 7, 1 + 6 = 7] → [9, 7, 7, 7]
- Sort the integers based on digit sum: [16, 34, 43, 18]. Swap 18 with 16, and swap 43 with 34 to obtain the sorted order.
- Thus, the minimum number of swaps required to rearrange nums is 2.

 

 **Constraints:** 

- 1 <= nums.length <= 105
- 1 <= nums[i] <= 109
- nums consists of distinct positive integers.

## Solution

**Language:** Java  
**Runtime:** 232 ms (beats 98.66%)  
**Memory:** 123.7 MB (beats 48.32%)  
**Submitted:** 2026-10-18T07:53:28.749Z  

```java
class Solution {
    class State {
        int num;
        int digitSum;
        int originalIndex;
        public State(int num, int originalIndex) {
            this.num = num;
            this.originalIndex = originalIndex;
            int c = num;
            while(c > 0) {
                this.digitSum += c % 10;
                c /= 10;
            }
        }
        @Override
        public String toString() {
            return "State{num="+num+",digitSum="+digitSum+",originalIndex="+originalIndex+"}";
        }
    }
    public int minSwaps(int[] nums) {
        State[] states = new State[nums.length];
        for(int i = 0; i < nums.length; i++) {
            states[i] = new State(nums[i],i);
        }
        
        Arrays.sort(states, (a,b) -> {
            if(a.digitSum != b.digitSum) return a.digitSum - b.digitSum;
            return a.num - b.num;
        });
        int r = 0;
        for(int i = 0; i < states.length; i++) {
            if(states[i].originalIndex == i) continue;
            boolean redo = false;
            if(states[states[i].originalIndex].originalIndex != states[i].originalIndex) {
                redo = true;
            }
            int temp = states[i].originalIndex;
            states[i].originalIndex = states[states[i].originalIndex].originalIndex;
            states[temp].originalIndex = temp;
            r++;
            if(redo) i--;
        }
        return r;
    }
    
}
```

---

[View on LeetCode](https://leetcode.com/problems/minimum-swaps-to-sort-by-digit-sum/)