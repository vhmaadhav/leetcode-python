// Last updated: 9/29/2026, 9:32:20 AM
class Solution {
    public int findNumbers(int[] nums) {
        int counter = 0; 
        for (int num : nums) {
            int digits = 0; 
            
            if (num == 0) {
                digits = 1;
            }
            while (num > 0) { 
                num = num / 10; 
                digits++; 
            }
            if ((digits & 1) == 0) { 
                counter++; 
            }
        }
        return counter; 
    }
}