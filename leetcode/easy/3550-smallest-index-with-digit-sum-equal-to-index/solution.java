class Solution {
    public int smallestIndex(int[] nums) {
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            int b = nums[i];
            int dsum = 0;
            while (b > 0) {
                dsum += b % 10;
                b /= 10;
            }
            if (dsum == i) {   
                return i;
            }
        }
        return -1;
    }
}
