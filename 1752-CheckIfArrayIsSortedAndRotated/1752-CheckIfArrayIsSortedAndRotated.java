// Last updated: 9/29/2026, 9:31:56 AM
import java.util.*;

class Solution {
    public boolean check(int[] arr) {
        List<Integer> nums = new ArrayList<>();
        for (int x : arr) {
            nums.add(x);
        }

        int n = nums.size();
        int pos = 1;
        while (pos < n && nums.get(pos) >= nums.get(pos - 1)) {
            pos++;
        }

        if (pos == n) return true;
        if (nums.get(pos) > nums.get(0)) return false;
        if (pos == n - 1) return true;

        pos = pos + 1;
        while (pos < n && nums.get(pos) >= nums.get(pos - 1) && nums.get(pos) <= nums.get(0)) {
            pos++;
        }
        return pos == n;
    }
}