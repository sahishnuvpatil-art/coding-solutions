# Smallest Divisible Digit Product II

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given a string `num` which represents a  **positive**  integer, and an integer `t`.

A number is called  **zero-free**  if  *none*  of its digits are 0.

Return a string representing the  **smallest**   **zero-free**  number greater than or equal to `num` such that the  **product of its digits**  is divisible by `t`. If no such number exists, return `"-1"`.

 

 **Example 1:** 

 **Input:**  num = "1234", t = 256

 **Output:**  "1488"

 **Explanation:** 

The smallest zero-free number that is greater than 1234 and has the product of its digits divisible by 256 is 1488, with the product of its digits equal to 256.

 **Example 2:** 

 **Input:**  num = "12355", t = 50

 **Output:**  "12355"

 **Explanation:** 

12355 is already zero-free and has the product of its digits divisible by 50, with the product of its digits equal to 150.

 **Example 3:** 

 **Input:**  num = "11111", t = 26

 **Output:**  "-1"

 **Explanation:** 

No number greater than 11111 has the product of its digits divisible by 26.

 

 **Constraints:** 

- 2 <= num.length <= 2 * 105
- num consists only of digits in the range ['0', '9'].
- num does not contain leading zeros.
- 1 <= t <= 1014

## Solution

**Language:** C++  
**Runtime:** 112 ms (beats 32.76%)  
**Memory:** 34.3 MB (beats 55.17%)  
**Submitted:** 2026-08-07T05:52:14.465Z  

```cpp
class Solution {
public:
    string smallestNumber(string num, long long t) {
        int req2 = 0, req3 = 0, req5 = 0, req7 = 0;
        long long temp = t;
        while (temp % 2 == 0) { temp /= 2; req2++; }
        while (temp % 3 == 0) { temp /= 3; req3++; }
        while (temp % 5 == 0) { temp /= 5; req5++; }
        while (temp % 7 == 0) { temp /= 7; req7++; }
        if (temp > 1) return "-1";

        int dp[60][40];
        for (int i = 0; i < 60; ++i) {
            for (int j = 0; j < 40; ++j) {
                dp[i][j] = 1e9;
            }
        }
        dp[0][0] = 0;
        
        int trans[6][2] = {{1, 0}, {0, 1}, {2, 0}, {1, 1}, {3, 0}, {0, 2}};
        for (int i = 0; i < 60; ++i) {
            for (int j = 0; j < 40; ++j) {
                if (dp[i][j] == 1e9) continue;
                for (auto& tr : trans) {
                    int ni = min(59, i + tr[0]);
                    int nj = min(39, j + tr[1]);
                    dp[ni][nj] = min(dp[ni][nj], dp[i][j] + 1);
                }
            }
        }
        for (int i = 59; i >= 0; --i) {
            for (int j = 39; j >= 0; --j) {
                if (i < 59) dp[i][j] = min(dp[i][j], dp[i + 1][j]);
                if (j < 39) dp[i][j] = min(dp[i][j], dp[i][j + 1]);
            }
        }

        int F2[] = {0, 0, 1, 0, 2, 0, 1, 0, 3, 0};
        int F3[] = {0, 0, 0, 1, 0, 0, 1, 0, 0, 2};
        int F5[] = {0, 0, 0, 0, 0, 1, 0, 0, 0, 0};
        int F7[] = {0, 0, 0, 0, 0, 0, 0, 1, 0, 0};

        int n = num.length();
        bool has_zero = false;
        int first_zero = n;
        for (int i = 0; i < n; ++i) {
            if (num[i] == '0') {
                has_zero = true;
                first_zero = i;
                break;
            }
        }

        if (!has_zero) {
            int r2 = req2, r3 = req3, r5 = req5, r7 = req7;
            for (char c : num) {
                int d = c - '0';
                r2 = max(0, r2 - F2[d]);
                r3 = max(0, r3 - F3[d]);
                r5 = max(0, r5 - F5[d]);
                r7 = max(0, r7 - F7[d]);
            }
            if (r2 == 0 && r3 == 0 && r5 == 0 && r7 == 0) return num;
        }

        int limit = min(n - 1, first_zero);
        int p2 = 0, p3 = 0, p5 = 0, p7 = 0;
        for (int i = 0; i < limit; ++i) {
            int d = num[i] - '0';
            p2 += F2[d];
            p3 += F3[d];
            p5 += F5[d];
            p7 += F7[d];
        }

        for (int i = limit; i >= 0; --i) {
            int start_d = (num[i] - '0') + 1;
            for (int d = start_d; d <= 9; ++d) {
                int n2 = max(0, req2 - p2 - F2[d]);
                int n3 = max(0, req3 - p3 - F3[d]);
                int n5 = max(0, req5 - p5 - F5[d]);
                int n7 = max(0, req7 - p7 - F7[d]);
                int L = n - 1 - i;
                
                if (n7 + n5 + dp[n2][n3] <= L) {
                    string ans = num.substr(0, i) + to_string(d);
                    int rem2 = n2, rem3 = n3, rem5 = n5, rem7 = n7;
                    for (int pos = 0; pos < L; ++pos) {
                        for (int x = 1; x <= 9; ++x) {
                            int nn2 = max(0, rem2 - F2[x]);
                            int nn3 = max(0, rem3 - F3[x]);
                            int nn5 = max(0, rem5 - F5[x]);
                            int nn7 = max(0, rem7 - F7[x]);
                            if (nn7 + nn5 + dp[nn2][nn3] <= L - 1 - pos) {
                                ans += to_string(x);
                                rem2 = nn2; rem3 = nn3; rem5 = nn5; rem7 = nn7;
                                break;
                            }
                        }
                    }
                    return ans;
                }
            }
            if (i > 0) {
                int d = num[i - 1] - '0';
                p2 -= F2[d];
                p3 -= F3[d];
                p5 -= F5[d];
                p7 -= F7[d];
            }
        }

        int min_len_needed = req7 + req5 + dp[req2][req3];
        int M = max(n + 1, min_len_needed);
        string ans = "";
        int rem2 = req2, rem3 = req3, rem5 = req5, rem7 = req7;
        
        for (int pos = 0; pos < M; ++pos) {
            for (int x = 1; x <= 9; ++x) {
                int nn2 = max(0, rem2 - F2[x]);
                int nn3 = max(0, rem3 - F3[x]);
                int nn5 = max(0, rem5 - F5[x]);
                int nn7 = max(0, rem7 - F7[x]);
                if (nn7 + nn5 + dp[nn2][nn3] <= M - 1 - pos) {
                    ans += to_string(x);
                    rem2 = nn2; rem3 = nn3; rem5 = nn5; rem7 = nn7;
                    break;
                }
            }
        }
        return ans;
    }
};
```

---

[View on LeetCode](https://leetcode.com/problems/smallest-divisible-digit-product-ii/)