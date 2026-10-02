# Check if There Is a Valid Parentheses String Path

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

A parentheses string is a  **non-empty**  string consisting only of `'('` and `')'`. It is  **valid**  if  **any**  of the following conditions is  **true** :

- It is ().
- It can be written as AB (A concatenated with B), where A and B are valid parentheses strings.
- It can be written as (A), where A is a valid parentheses string.

You are given an `m x n` matrix of parentheses `grid`. A  **valid parentheses string path**  in the grid is a path satisfying  **all**  of the following conditions:

- The path starts from the upper left cell (0, 0).
- The path ends at the bottom-right cell (m - 1, n - 1).
- The path only ever moves down or right.
- The resulting parentheses string formed by the path is valid.

Return `true`  *if there exists a  **valid parentheses string path**  in the grid.*  Otherwise, return `false`.

 

 **Example 1:** 

```
Input: grid = [["(","(","("],[")","(",")"],["(","(",")"],["(","(",")"]]
Output: true
Explanation: The above diagram shows two possible paths that form valid parentheses strings.
The first path shown results in the valid parentheses string "()(())".
The second path shown results in the valid parentheses string "((()))".
Note that there may be other valid parentheses string paths.

```

 **Example 2:** 

```
Input: grid = [[")",")"],["(","("]]
Output: false
Explanation: The two possible paths form the parentheses strings "))(" and ")((". Since neither of them are valid parentheses strings, we return false.

```

 

 **Constraints:** 

- m == grid.length
- n == grid[i].length
- 1 <= m, n <= 100
- grid[i][j] is either '(' or ')'.

## Solution

**Language:** Java  
**Runtime:** 5 ms (beats 78.24%)  
**Memory:** 123.3 MB (beats 29.77%)  
**Submitted:** 2026-10-02T13:33:27.590Z  

```java
class Solution {
    public boolean hasValidPath(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        if((n+m-1)%2==1) return false;
        if(grid[0][0]==')' || grid[n-1][m-1]=='(') return false;
        return memo(0, 0, 0, grid, new Boolean[n][m][n + m], n, m);
    }
    public boolean memo(int r, int c, int open, char[][] grid, Boolean[][][] dp, int n, int m) {
        if (r == n - 1 && c == m - 1) {
            return open == 1;
        }
        if (r >= n || c >= m) return false;
        if (dp[r][c][open] != null) return dp[r][c][open];
        int nOpen = open;
        if (grid[r][c] == '(') nOpen++;
        else nOpen--;
        if(nOpen<0) return dp[r][c][open]=false;
        return dp[r][c][open] = memo(r + 1, c, nOpen, grid, dp, n, m) || memo(r, c + 1, nOpen, grid, dp, n, m);
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/check-if-there-is-a-valid-parentheses-string-path/)