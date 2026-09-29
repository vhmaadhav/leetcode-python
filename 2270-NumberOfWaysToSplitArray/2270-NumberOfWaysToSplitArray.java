// Last updated: 9/29/2026, 9:31:33 AM
class Solution {
    public int waysToSplitArray(int[] nums) {
        int count = 0;
        long left = 0;
        long total = 0;
        for(int n: nums){
            total += n;
        }
        for(int i=0; i<nums.length-1; i++){
            left += nums[i];
            if(left>=(total-left)){
                count++;
            }

        }
        return (int) count;
    }
}