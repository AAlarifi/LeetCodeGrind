class Solution {
    public int distinctAverages(int[] nums) {
        // find min and max in array then remove and find the average of both numbers.
        // repeat on new array containing numbers that haven't been removed yet.
        Arrays.sort(nums);
        ArrayList<Integer> ansList = new ArrayList<>();
        int left = 0;
        int right = nums.length - 1;
        HashSet<Double> hs = new HashSet<>();
        while (left < right) {
            double average = (nums[right] + nums[left]) / 2.0;
            hs.add(average);
            left++;
            right--;
        }
        int answer = hs.size();
        return answer;
    }
}