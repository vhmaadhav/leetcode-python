// Last updated: 9/29/2026, 9:32:25 AM
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0;
        int product = 1;
        while (n>0) {
            int digit = n % 10;
            sum += digit;
            product *= digit;
            n /= 10;
        }
        return product - sum;
    }
}