class Solution {
    public int findMin(int[] nums) {
        int i =0, j = nums.length-1;
        while (i < j) {
            int idx = i+ (j-i) / 2;
            if (nums[idx] <= nums[j]) {
                j = idx;
            } else {
                i = idx + 1;
            }
        }

        return nums[i];
    }
}
