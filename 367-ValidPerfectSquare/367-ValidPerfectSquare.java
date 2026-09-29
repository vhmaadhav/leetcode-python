// Last updated: 9/29/2026, 9:33:08 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        // Edge case: 1 is a perfect square
        if (num == 1) return true;

        // We search for the square root between 1 and num/2
        // (Since sqrt(x) <= x/2 for all x > 1)
        long start = 1;
        long end = num / 2;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long squared = mid * mid; // Use long to prevent overflow

            if (squared == num) {
                return true;
            } else if (squared < num) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}