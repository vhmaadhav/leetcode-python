// Last updated: 9/29/2026, 9:32:04 AM
class Solution {
    public int[] runningSum(int[] nums) {
        int runningSum[] = new int[nums.length];
        runningSum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            runningSum[i] = runningSum[i-1]+nums[i];

        }
        return runningSum;
    }
}