// Last updated: 9/29/2026, 9:33:56 AM
class Solution {
    public int climbStairs(int n) {
        if(n==1) {
            return 1;
        }
        int[] step = new int[n+1];
        step[1] = 1;
        step[2] = 2;

        for(int i=3; i<=n; i++){
            step[i] = step[i-1] + step[i-2];
        }

        return step[n];
    }
}