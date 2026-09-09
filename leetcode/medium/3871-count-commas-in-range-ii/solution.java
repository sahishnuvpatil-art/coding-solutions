public class Solution {
    public long countCommas(long n) {
        long res = 0;
        long p = 999;
        while (n > p) {
            res += n - p;
            p = p * 1000 + 999;
        }
        return res;
    }
}