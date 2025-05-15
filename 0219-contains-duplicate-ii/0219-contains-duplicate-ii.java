class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hs.containsKey(nums[i])) {
                if (Math.abs(i - hs.get(nums[i])) <= k) {
                    return true;
                }
            }
            hs.put(nums[i], i); // update index of duplicate num if abs(i - j) > k
        }
        return false;
    }
}