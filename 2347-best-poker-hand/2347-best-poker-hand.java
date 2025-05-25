class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        HashSet<Character> hsSuits = new HashSet<>();
        for (Character s : suits) {
            hsSuits.add(s);
        }
        if (hsSuits.size() == 1) {
            return "Flush";
        }
        HashMap<Integer, Integer> hm = new HashMap<>(); // Store rank and  its frequency of occuring.
        for (Integer rank : ranks) {
            hm.put(rank, hm.getOrDefault(rank, 0) + 1);
        }
        int maxCount = 0;
        for (Integer freq : hm.values()) {
            maxCount = Math.max(maxCount, freq);
        }
        if (maxCount >= 3) {
            return "Three of a Kind";
        } else if (maxCount == 2) {
            return "Pair";
        } else {
            return "High Card";
        }

    }
}