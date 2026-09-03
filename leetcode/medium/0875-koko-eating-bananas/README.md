# Koko Eating Bananas

![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)

## Problem

Koko loves to eat bananas. There are `n` piles of bananas, the `ith` pile has `piles[i]` bananas. The guards have gone and will come back in `h` hours.

Koko can decide her bananas-per-hour eating speed of `k`. Each hour, she chooses some pile of bananas and eats `k` bananas from that pile. If the pile has less than `k` bananas, she eats all of them instead and will not eat any more bananas during this hour.

Koko likes to eat slowly but still wants to finish eating all the bananas before the guards return.

Return  *the minimum integer*  `k`  *such that she can eat all the bananas within*  `h`  *hours*.

 

 **Example 1:** 

```
Input: piles = [3,6,7,11], h = 8
Output: 4

```

 **Example 2:** 

```
Input: piles = [30,11,23,4,20], h = 5
Output: 30

```

 **Example 3:** 

```
Input: piles = [30,11,23,4,20], h = 6
Output: 23

```

 

 **Constraints:** 

- 1 <= piles.length <= 104
- piles.length <= h <= 109
- 1 <= piles[i] <= 109

## Solution

**Language:** Java  
**Runtime:** 8 ms (beats 67.38%)  
**Memory:** 48.3 MB (beats 15.39%)  
**Submitted:** 2026-09-03T03:40:59.271Z  

```java
class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int s=1;
        int max=-1;
        for(int i=0;i<piles.length;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }

        int e=max;

        while(s<e){
            int mid=(s+e)/2;

            int time=0;
            for(int i=0;i<piles.length;i++){
                time+= (piles[i]+mid-1)/mid;
            }

            if(time>h){
                s=mid+1;
            }
            else{
                e=mid;
            }
        }
        return s;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/koko-eating-bananas/)