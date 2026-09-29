// Last updated: 9/29/2026, 9:32:49 AM
class Solution {
    public int pivotIndex(int[] nums) {
     int leftSum = 0;
     int rightSum = 0;
     for(int i=0; i<nums.length; i++){
        if(i==0){
            leftSum = 0;
        }
        else if(i==nums.length-1){
            rightSum = 0;
        }
        leftSum = findSum(nums, 0, i);
        rightSum = findSum(nums,i+1,nums.length);
        if(leftSum == rightSum){
            return i;
        }
     }
     return -1;

      
    }
    public int findSum(int[] nums, int left, int right){
        int sum = 0;
        for(int i=left; i<right; i++){
            sum += nums[i];
        }
        return sum;
     }  
}