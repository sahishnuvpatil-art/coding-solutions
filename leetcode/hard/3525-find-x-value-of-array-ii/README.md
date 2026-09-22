# Find X Value of Array II

![Difficulty](https://img.shields.io/badge/Difficulty-Hard-red)

## Problem

You are given an array of  **positive**  integers `nums` and a  **positive**  integer `k`. You are also given a 2D array `queries`, where `queries[i] = [indexi, valuei, starti, xi]`.

You are allowed to perform an operation  **once**  on `nums`, where you can remove any  **suffix**  from `nums` such that `nums` remains  **non-empty**.

The  **x-value**  of `nums`  **for a given**  `x` is defined as the number of ways to perform this operation so that the  **product**  of the remaining elements leaves a  *remainder*  of `x`  **modulo**  `k`.

For each query in `queries` you need to determine the  **x-value**  of `nums` for `xi` after performing the following actions:

- Update nums[indexi] to valuei. Only this step persists for the rest of the queries.
- Remove the prefix nums[0..(starti - 1)] (where nums[0..(-1)] will be used to represent the empty prefix).

Return an array `result` of size `queries.length` where `result[i]` is the answer for the `ith` query.

A  **prefix**  of an array is a subarray that starts from the beginning of the array and extends to any point within it.

A  **suffix**  of an array is a subarray that starts at any point within the array and extends to the end of the array.

 **Note**  that the prefix and suffix to be chosen for the operation can be  **empty**.

 **Note**  that x-value has a  *different*  definition in this version.

 

 **Example 1:** 

 **Input:**  nums = [1,2,3,4,5], k = 3, queries = [[2,2,0,2],[3,3,3,0],[0,1,0,1]]

 **Output:**  [2,2,2]

 **Explanation:** 

- For query 0, nums becomes [1, 2, 2, 4, 5], and the empty prefix must be removed. The possible operations are: Remove the suffix [2, 4, 5]. nums becomes [1, 2]. Remove the empty suffix. nums becomes [1, 2, 2, 4, 5] with a product 80, which gives remainder 2 when divided by 3.
- For query 1, nums becomes [1, 2, 2, 3, 5], and the prefix [1, 2, 2] must be removed. The possible operations are: Remove the empty suffix. nums becomes [3, 5]. Remove the suffix [5]. nums becomes [3].
- For query 2, nums becomes [1, 2, 2, 3, 5], and the empty prefix must be removed. The possible operations are: Remove the suffix [2, 2, 3, 5]. nums becomes [1]. Remove the suffix [3, 5]. nums becomes [1, 2, 2].

 **Example 2:** 

 **Input:**  nums = [1,2,4,8,16,32], k = 4, queries = [[0,2,0,2],[0,2,0,1]]

 **Output:**  [1,0]

 **Explanation:** 

- For query 0, nums becomes [2, 2, 4, 8, 16, 32]. The only possible operation is: Remove the suffix [2, 4, 8, 16, 32].
- For query 1, nums becomes [2, 2, 4, 8, 16, 32]. There is no possible way to perform the operation.

 **Example 3:** 

 **Input:**  nums = [1,1,2,1,1], k = 2, queries = [[2,1,0,1]]

 **Output:**  [5]

 

 **Constraints:** 

- 1 <= nums[i] <= 109
- 1 <= nums.length <= 105
- 1 <= k <= 5
- 1 <= queries.length <= 2 * 104
- queries[i] == [indexi, valuei, starti, xi]
- 0 <= indexi <= nums.length - 1
- 1 <= valuei <= 109
- 0 <= starti <= nums.length - 1
- 0 <= xi <= k - 1

## Solution

**Language:** Java  
**Runtime:** 405 ms (beats 21.05%)  
**Memory:** 281.7 MB (beats 42.10%)  
**Submitted:** 2026-09-22T16:56:53.107Z  

```java
class Solution {
    static class Node {
        int prod;
        int[] freq;
        Node(int k) {
            prod = 1;
            freq = new int[k];
        }
    }
    
    int k;
    Node[] tree;
    int[] nums;
    
    Node merge(Node L, Node R) {
        Node res = new Node(k);
        res.prod = (int)((1L * L.prod * R.prod) % k);
        System.arraycopy(L.freq, 0, res.freq, 0, k);
        for (int r = 0; r < k; r++) {
            if (R.freq[r] != 0) {
                int nr = (int)((1L * L.prod * r) % k);
                res.freq[nr] += R.freq[r];
            }
        }
        return res;
    }
    
    void build(int v, int tl, int tr) {
        if (tl == tr) {
            tree[v].prod = nums[tl] % k;
            tree[v].freq[tree[v].prod] = 1;
            return;
        }
        int tm = (tl + tr) / 2;
        build(v * 2, tl, tm);
        build(v * 2 + 1, tm + 1, tr);
        tree[v] = merge(tree[v * 2], tree[v * 2 + 1]);
    }
    
    void update(int v, int tl, int tr, int pos, int val) {
        if (tl == tr) {
            tree[v].prod = val % k;
            Arrays.fill(tree[v].freq, 0);
            tree[v].freq[tree[v].prod] = 1;
            return;
        }
        int tm = (tl + tr) / 2;
        if (pos <= tm) update(v * 2, tl, tm, pos, val);
        else update(v * 2 + 1, tm + 1, tr, pos, val);
        tree[v] = merge(tree[v * 2], tree[v * 2 + 1]);
    }
    
    Node query(int v, int tl, int tr, int l, int r) {
        if (l > r) return new Node(k);
        if (l == tl && r == tr) return tree[v];
        int tm = (tl + tr) / 2;
        return merge(query(v * 2, tl, tm, l, Math.min(r, tm)),
                     query(v * 2 + 1, tm + 1, tr, Math.max(l, tm + 1), r));
    }
    
    public int[] resultArray(int[] nums, int k, int[][] queries) {
        this.k = k;
        this.nums = nums;
        int n = nums.length;
        tree = new Node[4 * n];
        for (int i = 0; i < tree.length; i++) tree[i] = new Node(k);
        build(1, 0, n - 1);
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int idx = queries[i][0], val = queries[i][1], start = queries[i][2], x = queries[i][3];
            update(1, 0, n - 1, idx, val);
            Node res = query(1, 0, n - 1, start, n - 1);
            ans[i] = res.freq[x];
        }
        return ans;
    }
}
```

---

[View on LeetCode](https://leetcode.com/problems/find-x-value-of-array-ii/)