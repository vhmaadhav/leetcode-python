// Last updated: 9/29/2026, 9:31:31 AM
import java.util.*;

class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
        Map<String, Integer> order = new HashMap<>();
        order.put("electronics", 0);
        order.put("grocery", 1);
        order.put("pharmacy", 2);
        order.put("restaurant", 3);

        List<Integer> validIndices = new ArrayList<>();
        
        for (int i = 0; i < code.length; i++) {
            if (isActive[i] && order.containsKey(businessLine[i])) {
                if (isValid(code[i])) {
                    validIndices.add(i);
                }
            }
        }

        Collections.sort(validIndices, (a, b) -> {
            int priorityA = order.get(businessLine[a]);
            int priorityB = order.get(businessLine[b]);
            
            if (priorityA != priorityB) {
                return priorityA - priorityB;
            }
            return code[a].compareTo(code[b]);
        });

        List<String> result = new ArrayList<>();
        for (int index : validIndices) {
            result.add(code[index]);
        }
        
        return result;
    }

    private boolean isValid(String s) {
        if (s == null || s.isEmpty()) return false;
        for (char c : s.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
            }
        }
        return true;
    }
}