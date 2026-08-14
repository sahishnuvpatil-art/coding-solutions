class Solution {
    public boolean isPossible(int[] arr, int s, int x) {
        ArrayList<Long> nums = new ArrayList<>();

        long total = s;
        nums.add((long) s);

        
        for (int a : arr) {
            long next = total + a;

         
            if (next > x)
                break;

            nums.add(next);
            total += next;
        }

        
        long target = x;

        for (int i = nums.size() - 1; i >= 0; i--) {
            if (nums.get(i) <= target) {
                target -= nums.get(i);
            }

            if (target == 0)
                return true;
        }

        return false;
    }
}