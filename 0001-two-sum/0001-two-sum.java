class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> h = new HashMap<>();
        int complement = 0;
        for(int i = 0; i < nums.length; i++){
            complement = target - nums[i];
            if (h.containsKey(complement)){
                return new int[]{i,h.get(complement)};
            }
            h.put(nums[i], i);
        }
        return new int[0];
    }
}