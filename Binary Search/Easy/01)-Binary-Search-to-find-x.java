class Solution {
    public int search(int[] nums, int target) {
        int low = 0, high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                return mid;
            } 
            else if (nums[mid] < target) {
                low = mid + 1;   // move right
            } 
            else {
                high = mid - 1;  // move left
            }
        }
        return -1;
    }
}

//https://leetcode.com/problems/binary-search/?utm=codolio
