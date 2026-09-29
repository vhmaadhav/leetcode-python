// Last updated: 9/29/2026, 9:32:11 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans = new int[2 * n];
        int i = 0;      
        int j = n;      
        int k = 0;      

        while (i < n) {
            ans[k++] = nums[i++]; // x
            ans[k++] = nums[j++]; // y
        }

        return ans;
    }
}
