class Solution {
    public int missingNumber(int[] nums) {
        int currentNum = 0;
        int n = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < n;) {
            if (nums[i] == currentNum) {
                i++;
                currentNum++;
            } else {
                return currentNum;
            }
        }
        return currentNum;
    }

}