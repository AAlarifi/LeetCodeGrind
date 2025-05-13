import java.util.*;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        Boolean ans = null;
        String[] charArray = s.split("");
        HashMap<String, Integer> hash = new HashMap<>();
        for (String x : charArray) {
            if (hash.containsKey(x)) {
                hash.put(x, hash.get(x) + 1);
            } else {
                hash.put(x, 1);
            }
        }
        HashSet<Integer> compare = new HashSet<>();
        for (String x : hash.keySet()) {
            compare.add(hash.get(x));
        }
        if (compare.size() > 1) {
            ans = false;
        } else {
            ans = true;
        }

        return ans;
    }
}