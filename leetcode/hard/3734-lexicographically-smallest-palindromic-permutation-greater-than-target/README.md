# Lexicographically Smallest Palindromic Permutation Greater Than Target

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given two strings `s` and `target`, each of length `n`, consisting of lowercase English letters.

Return the  **lexicographically smallest string**  that is  **both**  a  **palindromic permutation**  of `s` and  **strictly**  greater than `target`. If no such permutation exists, return an empty string.

 

 **Example 1:** 

 **Input:**  s = "baba", target = "abba"

 **Output:**  "baab"

 **Explanation:** 

- The palindromic permutations of s (in lexicographical order) are "abba" and "baab".
- The lexicographically smallest permutation that is strictly greater than target is "baab".

 **Example 2:** 

 **Input:**  s = "baba", target = "bbaa"

 **Output:**  ""

 **Explanation:** 

- The palindromic permutations of s (in lexicographical order) are "abba" and "baab".
- None of them is lexicographically strictly greater than target. Therefore, the answer is "".

 **Example 3:** 

 **Input:**  s = "abc", target = "abb"

 **Output:**  ""

 **Explanation:** 

`s` has no palindromic permutations. Therefore, the answer is `""`.

 **Example 4:** 

 **Input:**  s = "aac", target = "abb"

 **Output:**  "aca"

 **Explanation:** 

- The only palindromic permutation of s is "aca".
- "aca" is strictly greater than target. Therefore, the answer is "aca".

 

 **Constraints:** 

- 1 <= n == s.length == target.length <= 300
- s and target consist of only lowercase English letters.

## Solution

**Language:** Java  
**Runtime:** 6 ms (beats 76.19%)  
**Memory:** 47.5 MB (beats 33.33%)  
**Submitted:** 2026-08-28T14:16:18.350Z  

```java
class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i) - 'a']++;

        char center = 0;
        for (int i = 0; i < 26; i++) {
            if (freq[i] % 2 != 0) {
                if (center != 0)
                    return "";
                center = (char) ('a' + i);
                freq[i]--;
            }
        }

        int sz = s.length();
        int half = sz / 2;
        for (int i = 0; i < half; i++)
            freq[target.charAt(i) - 'a'] -= 2;

        if (check(freq)) {
            String head = target.substring(0, half);
            String rev = new StringBuilder(head).reverse().toString();
            String tail = "";
            if (center != 0)
                tail += center;
            tail += rev;
            if (tail.compareTo(target.substring(half)) > 0)
                return head + tail;
        }

        for (int i = half - 1; i >= 0; i--) {
            char w = target.charAt(i);
            freq[w - 'a'] += 2;
            if (!check(freq))
                continue;

            for (int j = (w - 'a') + 1; j < 26; j++) {
                if (freq[j] == 0)
                    continue;
                freq[j] -= 2;
                StringBuilder answer = new StringBuilder(target.substring(0, i + 1));
                answer.setCharAt(i, (char) ('a' + j));

                for (int k = 0; k < 26; k++) {
                    int cnt = freq[k] / 2;
                    for (int m = 0; m < cnt; m++)
                        answer.append((char) ('a' + k));
                }

                String part = new StringBuilder(answer).reverse().toString();
                if (center != 0)
                    answer.append(center);
                answer.append(part);
                return answer.toString();
            }
        }

        return "";
    }

    boolean check(int[] freq) {
        for (int v : freq)
            if (v < 0)
                return false;
        return true;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/lexicographically-smallest-palindromic-permutation-greater-than-target/)