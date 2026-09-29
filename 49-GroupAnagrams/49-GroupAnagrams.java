// Last updated: 9/29/2026, 9:34:14 AM
// Last updated: 6/4/2026, 7:25:11 PM
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }
        Map<String, List<String>> frequencystringsmap = new HashMap<>();
        for (String str : strs) {
            String frequencystring = getFrequencyString(str);
            if (frequencystringsmap.containsKey(frequencystring)) {
                frequencystringsmap.get(frequencystring).add(str);
            } else {
                List<String> strlist = new ArrayList<>();
                strlist.add(str);
                frequencystringsmap.put(frequencystring, strlist);
            }
        }
        return new ArrayList<>(frequencystringsmap.values());
    }

    private String getFrequencyString(String str) {
        int[] freq = new int[26];
        for (char ch : str.toCharArray()) {
            freq[ch - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            sb.append('#');
            sb.append(freq[i]);
        }
        return sb.toString();
    }
}