// Last updated: 9/29/2026, 9:32:27 AM
class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]%2==0){
                nums[i] = 0;
            }
            else{
                nums[i] = 1;
            }
        }
        HashMap<Integer, Integer> hm = new HashMap<>();

        int prefixSum = 0;
        int count = 0;
        hm.put(0, 1);
        for (int n : nums) {
            prefixSum += n;

            if (hm.containsKey(prefixSum - k)) {
                count += hm.get(prefixSum - k);
            }

            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0) + 1);
        }

        return count;

    }
}