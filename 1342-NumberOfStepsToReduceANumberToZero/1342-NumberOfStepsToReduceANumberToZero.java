// Last updated: 9/29/2026, 9:32:17 AM
class Solution {
    public int numberOfSteps(int num) {
       int count = 0;
        while(num>0){
            if(num%2==0){
                num=num/2;
            }
            else{
                num=num-1;
            }
            count++;
        }
        return count;
     }
}