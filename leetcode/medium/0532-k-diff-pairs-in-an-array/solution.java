import java.util.*;

class Solution {
    public int findPairs(int[] nums, int k) {
        if (k < 0) return 0; 

        Arrays.sort(nums);
        int l = 0, r = 1, count = 0;

        while (r < nums.length) {
            if (l == r) {
                r++;
                continue;
            }

            int diff = nums[r] - nums[l];

            if (diff < k) {
                r++;
            } else if (diff > k) {
                l++;
            } else { 
                count++;
                int left = nums[l], right = nums[r];
                while (l < nums.length && nums[l] == left) l++;
                while (r < nums.length && nums[r] == right) r++;
            }
        }
        return count;
    }
}
