// Last updated: 9/29/2026, 9:32:01 AM
import java.util.HashMap;

class Solution {
    public int minOperations(int[] nums, int x) {

        HashMap<Integer, Integer> hm = new HashMap<>();

        int suffixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            hm.put(suffixSum, i);
            suffixSum += nums[nums.length - 1 - i];
        }

        hm.put(suffixSum, nums.length);

        int operations = Integer.MAX_VALUE;
        int prefixSum = 0;

        for (int i = 0; i <= nums.length; i++) {

            int neededSuffix = x - prefixSum;

            if (hm.containsKey(neededSuffix)) {

                int rightOperations = hm.get(neededSuffix);
                int totalOperations = i + rightOperations;

                if (totalOperations <= nums.length) {
                    operations = Math.min(operations, totalOperations);
                }
            }

            if (i < nums.length) {
                prefixSum += nums[i];
            }
        }

        return operations == Integer.MAX_VALUE ? -1 : operations;
    }
}