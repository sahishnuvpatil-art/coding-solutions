class Solution {
    public int binarySearch(int[] arr, int k) {
        int a = arr.length;

        for (int i = 0; i < a; i++) {
            if (arr[i] == k)
                return i;
        }

        return -1;
    }
}