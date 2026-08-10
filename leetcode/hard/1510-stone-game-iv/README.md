# Stone Game IV

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Alice and Bob take turns playing a game, with Alice starting first.

Initially, there are `n` stones in a pile. On each player's turn, that player makes a  *move*  consisting of removing  **any**  non-zero  **square number**  of stones in the pile.

Also, if a player cannot make a move, he/she loses the game.

Given a positive integer `n`, return `true` if and only if Alice wins the game otherwise return `false`, assuming both players play optimally.

 

 **Example 1:** 

```
Input: n = 1
Output: true
Explanation: Alice can remove 1 stone winning the game because Bob doesn't have any moves.
```

 **Example 2:** 

```
Input: n = 2
Output: false
Explanation: Alice can only remove 1 stone, after that Bob removes the last one winning the game (2 -> 1 -> 0).

```

 **Example 3:** 

```
Input: n = 4
Output: true
Explanation: n is already a perfect square, Alice can win with one move, removing 4 stones (4 -> 0).

```

 

 **Constraints:** 

- 1 <= n <= 105

## Solution

**Language:** Java  
**Runtime:** 42 ms (beats 26.37%)  
**Memory:** 49.4 MB (beats 46.48%)  
**Submitted:** 2026-08-10T15:16:45.364Z  

```java
class Solution {
    int N; 
    int mx = 1_00_001; 
    int memo[]; 
    private boolean canWin(int pos) {
        if(pos >= N) return false; 

        if(memo[pos] != -1) return memo[pos] > 0; 

        for(int i = 1; i * i < mx ; i++) {
            int cur = i * i; 
            if((pos + i * i) > N) {
                break; 
            }

            if(!canWin(pos + cur)) {
                memo[pos] = 1; 
                return true; 
            } 
        }
        memo[pos] = 0; 
        return false;  
    }
    public boolean winnerSquareGame(int n) {
        
        this.N = n; 
        memo = new int[n + 1]; 
        Arrays.fill(memo, -1);
      
        return canWin(0); 
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/stone-game-iv/)