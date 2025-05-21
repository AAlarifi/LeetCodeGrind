class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++){
            if (hm.containsKey(nums[i])){
                hm.put(nums[i], hm.get(nums[i]) + 1);
            } else {
                hm.put(nums[i], 0);
            }
        }
        int answer = 0;
        int freq = 0;
        for (Integer x : hm.keySet()){
            if (hm.get(x) >= nums.length /2){
                answer = x;
            }
        }
        return answer;
    }
}