// Last updated: 9/29/2026, 9:33:33 AM
class Solution {
    public int majorityElement(int[] nums) {
     HashMap<Integer,Integer> hm = new HashMap<>();
     for(int num: nums){
        if(hm.containsKey(num)){
            hm.put(num, hm.get(num)+1);
        }
        else{
            hm.put(num,1);
        }
        if(hm.get(num)>nums.length/2){
            return num;
        }
     }
     return -1;
     
    }
}