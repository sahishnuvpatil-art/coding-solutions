class Solution {
    public boolean[] validSubarrays(int[] nums, int k, int[][] queries) {
        int n = nums.length;

        long[] h = new long[100001];

        for (int i = 1; i <= 100000; i++) {
            long x = i;
            x += 0x9e3779b97f4a7c15L;
            x = (x ^ (x >>> 30)) * 0xbf58476d1ce4e5b9L;
            x = (x ^ (x >>> 27)) * 0x94d049bb133111ebL;
            h[i] = x ^ (x >>> 31);
        }

        long[] pref = new long[n + 1];

        for (int i = 0; i < n; i++) {
            pref[i + 1] = pref[i] ^ h[nums[i]];
        }

        int[] leftK = computeLeft(nums, k);
        int[] leftKMinus1 = computeLeft(nums, k - 1);

        boolean[] ans = new boolean[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int l = queries[i][0];
            int r = queries[i][1];

            boolean exactK = leftK[r] <= l && l < leftKMinus1[r];
            boolean even = pref[l] == pref[r + 1];

            ans[i] = exactK && even;
        }

        return ans;
    }

    private int[] computeLeft(int[] nums, int k) {
        int n = nums.length;
        int[] left = new int[n];

        if (k == 0) {
            java.util.Arrays.fill(left, n);
            return left;
        }

        int[] freq = new int[100001];
        int distinct = 0;
        int l = 0;

        for (int r = 0; r < n; r++) {
            if (freq[nums[r]]++ == 0) {
                distinct++;
            }

            while (distinct > k) {
                if (--freq[nums[l]] == 0) {
                    distinct--;
                }
                l++;
            }

            left[r] = l;
        }

        return left;
    }
}