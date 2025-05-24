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
        Integer prevous = 0;
        for (Integer x : hm.keySet()) {
            if (hm.get(x) == prevous) {
                return false;
            }
            prevous = hm.get(x);
        }
        return true;
    }
}