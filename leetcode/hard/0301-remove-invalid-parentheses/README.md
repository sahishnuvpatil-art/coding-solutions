# Remove Invalid Parentheses

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

Given a string `s` that contains parentheses and letters, remove the minimum number of invalid parentheses to make the input string valid.

Return  *a list of  **unique strings**  that are valid with the minimum number of removals*. You may return the answer in  **any order**.

 

 **Example 1:** 

```
Input: s = "()())()"
Output: ["(())()","()()()"]

```

 **Example 2:** 

```
Input: s = "(a)())()"
Output: ["(a())()","(a)()()"]

```

 **Example 3:** 

```
Input: s = ")("
Output: [""]

```

 

 **Constraints:** 

- 1 <= s.length <= 25
- s consists of lowercase English letters and parentheses '(' and ')'.
- There will be at most 20 parentheses in s.

## Solution

**Language:** Java  
**Runtime:** 154 ms (beats 17.72%)  
**Memory:** 44 MB (beats 74.10%)  
**Submitted:** 2026-10-07T16:09:07.050Z  

```java
class Solution {
    Set<String> result = new HashSet<>();

    public List<String> removeInvalidParentheses(String s) {
        int leftRemove = 0;
        int rightRemove = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                leftRemove++;
            } else if (c == ')') {
                if (leftRemove > 0) {
                    leftRemove--;
                } else {
                    rightRemove++;
                }
            }
        }

        dfs(s, 0, leftRemove, rightRemove, 0, new StringBuilder());

        return new ArrayList<>(result);
    }

    private void dfs(String s, int index, int leftRemove,
                     int rightRemove, int balance, StringBuilder path) {

        if (balance < 0) return;

        if (index == s.length()) {
            if (leftRemove == 0 && rightRemove == 0 && balance == 0) {
                result.add(path.toString());
            }
            return;
        }

        char c = s.charAt(index);

        path.append(c);

        if (c == '(') {
            dfs(s, index + 1, leftRemove, rightRemove,
                balance + 1, path);
        } else if (c == ')') {
            if (balance > 0) {
                dfs(s, index + 1, leftRemove, rightRemove,
                    balance - 1, path);
            }
        } else {
            dfs(s, index + 1, leftRemove, rightRemove,
                balance, path);
        }

        path.deleteCharAt(path.length() - 1);

        if (c == '(' && leftRemove > 0) {
            dfs(s, index + 1, leftRemove - 1, rightRemove,
                balance, path);
        }

        if (c == ')' && rightRemove > 0) {
            dfs(s, index + 1, leftRemove, rightRemove - 1,
                balance, path);
        }
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/remove-invalid-parentheses/)