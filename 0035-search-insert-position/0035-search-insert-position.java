class Solution {
    public int binarySearch(int[] nums, int target) {
        // binary search
        int left = 0;
        int right = nums.length - 1;
        int mid = -1;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                right = mid - 1;
            } else if (target > nums[mid]) {
                left = mid + 1;
            }
        }
        return left;
    }

    public int searchInsert(int[] nums, int target) {
        int ans = 0;
        ans = binarySearch(nums, target);
        return ans;
    }
}