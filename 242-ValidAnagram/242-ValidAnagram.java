// Last updated: 9/29/2026, 9:33:23 AM
class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arr = new int[256];

        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();

        if (s.length() != t.length()) {
            return false;
        }
        else{
        
            for(char ch: ch1){
            arr[ch]++;
            }
            for(char ch: ch2){
            arr[ch]--;
            }
            for (int count : arr) {
            if (count != 0) {
                return false;
            }
            }
            return true;
        }
    }    
}