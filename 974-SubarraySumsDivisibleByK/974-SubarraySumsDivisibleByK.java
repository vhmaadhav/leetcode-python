// Last updated: 9/29/2026, 9:32:34 AM
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        hm.put(0, 1);

        int prefixSum = 0;
        int count = 0;

        for (int num : nums) {
            prefixSum += num;

            int remainder = prefixSum % k;

            if (remainder < 0) {
                remainder += k;
            }

            if (hm.containsKey(remainder)) {
                count += hm.get(remainder);
            }

            hm.put(remainder, hm.getOrDefault(remainder, 0) + 1);
        }

        return count;
    }
}