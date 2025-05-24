class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (hm.containsKey(arr[i])) {
                hm.put(arr[i], hm.get(arr[i]) + 1);
            } else {
                hm.put(arr[i], 1);
            }
        }
        // Add all occurances to a hashset. If all the occurances are unique
        // then both the hashmap and hashset size will be the same.
        HashSet<Integer> hs = new HashSet<>(hm.values());
        if (hs.size() == hm.size()) {
            return true;
        }
        return false;
    }
}