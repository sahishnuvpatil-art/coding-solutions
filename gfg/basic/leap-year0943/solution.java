class Solution {
    static boolean checkYear(int n) {
if (n % 400 == 0) return true;
        // Not leap year if divisible by 100
        if (n % 100 == 0) return false;
        // Leap year if divisible by 4
        if (n % 4 == 0) return true;
        // Otherwise not a leap year
        return false;
    }
}
        