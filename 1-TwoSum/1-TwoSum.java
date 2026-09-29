// Last updated: 9/29/2026, 9:35:08 AM
import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length; i++){
            int needed = target - nums[i];
            if(map.containsKey(needed)){
                return new int[]{i, map.get(needed)};
            }
            map.put(nums[i],i);
        }
        return new int[0];
    }
}