# Kth Smallest Amount With Single Denomination Combination

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an integer array `coins` representing coins of different denominations and an integer `k`.

You have an infinite number of coins of each denomination. However, you are  **not allowed**  to combine coins of different denominations.

Return the `kth`  **smallest**  amount that can be made using these coins.

 

 **Example 1:** 

 **Input:**  coins = [3,6,9], k = 3

 **Output:**  9

 **Explanation:**  The given coins can make the following amounts:
Coin 3 produces multiples of 3: 3, 6, 9, 12, 15, etc.
Coin 6 produces multiples of 6: 6, 12, 18, 24, etc.
Coin 9 produces multiples of 9: 9, 18, 27, 36, etc.
All of the coins combined produce: 3, 6,  **9**, 12, 15, etc.

 **Example 2:** 

 **Input:**  coins = [5,2], k = 7

 **Output:**  12

 **Explanation:**  The given coins can make the following amounts:
Coin 5 produces multiples of 5: 5, 10, 15, 20, etc.
Coin 2 produces multiples of 2: 2, 4, 6, 8, 10, 12, etc.
All of the coins combined produce: 2, 4, 5, 6, 8, 10,  **12**, 14, 15, etc.

 

 **Constraints:** 

- 1 <= coins.length <= 15
- 1 <= coins[i] <= 25
- 1 <= k <= 2 * 109
- coins contains pairwise distinct integers.

## Solution

**Language:** Java  
**Runtime:** 20 ms (beats 80.39%)  
**Memory:** 46.3 MB (beats 47.06%)  
**Submitted:** 2026-08-21T13:00:12.389Z  

```java
class Solution {
    long gcd(long a, long b) {
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    long lcm(long a, long b) {
        return a / gcd(a, b) * b;
    }

    public long findKthSmallest(int[] coins, int k) {
        int n = coins.length;

        List<long[]> subsets = new ArrayList<>();

        for (int mask = 1; mask < (1 << n); ++mask) {
            long curLcm = 1;
            int bits = 0;

            for (int i = 0; i < n; ++i) {
                if ((mask & (1 << i)) != 0) {
                    ++bits;
                    curLcm = lcm(curLcm, coins[i]);
                }
            }

            subsets.add(new long[]{
                curLcm,
                (bits & 1) == 1 ? 1 : -1
            });
        }

        long left = 1;
        long minCoin = Integer.MAX_VALUE;

        for (int coin : coins)
            minCoin = Math.min(minCoin, coin);

        long right = minCoin * (long) k;

        while (left < right) {
            long mid = left + (right - left) / 2;

            long total = 0;

            for (long[] sub : subsets) {
                if (sub[0] <= mid)
                    total += sub[1] * (mid / sub[0]);
            }

            if (total >= k)
                right = mid;
            else
                left = mid + 1;
        }

        return left;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/kth-smallest-amount-with-single-denomination-combination/)