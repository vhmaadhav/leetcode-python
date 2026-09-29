// Last updated: 9/29/2026, 9:34:54 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // Step 1: Ensure nums1 is the smaller array
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;

        while (low <= high) {
            // Partition index for nums1
            int i = (low + high) / 2;
            // Partition index for nums2 (derived to keep half_len balanced)
            int j = (m + n + 1) / 2 - i;

            // Boundary values (handling empty halves with Infinity)
            int maxLeft1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int minRight1 = (i == m) ? Integer.MAX_VALUE : nums1[i];

            int maxLeft2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int minRight2 = (j == n) ? Integer.MAX_VALUE : nums2[j];

            // Check if we found the correct partition
            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // If total length is odd
                if ((m + n) % 2 != 0) {
                    return Math.max(maxLeft1, maxLeft2);
                }
                // If total length is even
                return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
            } 
            // If we are too far right in nums1, move left
            else if (maxLeft1 > minRight2) {
                high = i - 1;
            } 
            // If we are too far left in nums1, move right
            else {
                low = i + 1;
            }
        }

        return 0.0; // Should never reach here if inputs are sorted
    }
}