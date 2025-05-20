class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int num = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 0);
            }
        }
        for (Integer x : hm.keySet()) {
            if (hm.get(x) == 0) {
                num = x;
            }
        }
        return num;
    }
}