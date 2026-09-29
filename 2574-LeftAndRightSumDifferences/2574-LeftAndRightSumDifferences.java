// Last updated: 9/29/2026, 9:31:28 AM
class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        int[] leftSum = new int[n];
        int[] rightSum = new int[n];

        int prefixSum = 0;
        for(int i=0; i<n; i++){
            leftSum[i] = prefixSum;
            prefixSum += nums[i];
        }

        int suffixSum = 0;
        for(int i=n-1; i>=0; i--){
            rightSum[i] = suffixSum;
            suffixSum += nums[i];
        }

        for(int i=0; i<n; i++){
            nums[i] = Math.abs(rightSum[i] - leftSum[i]);
        }

        return nums;
    }
}