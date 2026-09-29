// Last updated: 9/29/2026, 9:34:31 AM
import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        if (n < 4) return res;
        
        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++) {
            // 1. Skip duplicates for the first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            // 2. Pruning: Smallest possible sum from here is too large
            if ((long) nums[i] + nums[i + 1] + nums[i + 2] + nums[i + 3] > target) break;
            
            // 3. Pruning: Largest possible sum from here is too small
            if ((long) nums[i] + nums[n - 3] + nums[n - 2] + nums[n - 1] < target) continue;

            for (int j = i + 1; j < n - 2; j++) {
                // 4. Skip duplicates for the second number
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                // 5. Pruning: Smallest possible sum for this 'j' is too large
                if ((long) nums[i] + nums[j] + nums[j + 1] + nums[j + 2] > target) break;
                
                // 6. Pruning: Largest possible sum for this 'j' is too small
                if ((long) nums[i] + nums[j] + nums[n - 2] + nums[n - 1] < target) continue;

                // Standard Two-Pointer approach for the remaining two numbers
                int left = j + 1, right = n - 1;
                while (left < right) {
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];
                    if (sum == target) {
                        res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    } else if (sum < target) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}