// Last updated: 9/29/2026, 9:32:39 AM
import java.util.HashMap;

class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int prefixSum = 0;
        int count = 0;
        hm.put(0, 1);
        for (int n : nums) {
            prefixSum += n;

            if (hm.containsKey(prefixSum - goal)) {
                count += hm.get(prefixSum - goal);
            }

            hm.put(prefixSum, hm.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }
}