// Last updated: 9/29/2026, 9:32:58 AM
class Solution {
    public int findMaxLength(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        int prefixSum = 0;
        int max = 0;

        hm.put(0, -1);

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];

            if (hm.containsKey(prefixSum)) {
                int len = i - hm.get(prefixSum);
                max = Math.max(max, len);
            } else {
                hm.put(prefixSum, i);
            }
        }

        return max;
    }
}