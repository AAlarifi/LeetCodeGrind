import java.util.*;

class Solution {
    public boolean areOccurrencesEqual(String s) {
        String[] charArray = s.split("");
        HashMap<String, Integer> hash = new HashMap<>();
        for (String x : charArray) {
            if (hash.containsKey(x)) {
                hash.put(x, hash.get(x) + 1);
            } else {
                hash.put(x, 1);
            }
        }
        Iterator<Map.Entry<String,Integer>> iterator = hash.entrySet().iterator();
        Integer firstValue = iterator.next().getValue();
        while(iterator.hasNext()){
            if (!firstValue.equals(iterator.next().getValue())){
                return false;
            }
        }
        return true;
    }
}