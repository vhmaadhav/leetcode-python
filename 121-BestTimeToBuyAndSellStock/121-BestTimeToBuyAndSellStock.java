// Last updated: 9/29/2026, 9:33:45 AM
class Solution {
    public int maxProfit(int[] prices) {
       int minprice = prices[0];
       int profit = 0;
       for(int i=1; i<prices.length; i++){
        if(minprice > prices[i]){
            minprice = prices[i];
        }
        if(profit < prices[i]-minprice){
            profit = prices[i] -  minprice;
        }
       }
       return profit;
    }
}