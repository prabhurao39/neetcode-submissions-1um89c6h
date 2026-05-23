class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int idx = n%2 == 0 ? n/2 : (n+1)/2;
        

        for (int i=0, j = n-1; i <= j;) {
            idx = (i + j) / 2;
            if (nums[idx] == target ) {
                return idx;
            } if (nums[idx] < target) {
                i= idx;
                i++;
            } else {
                j = idx;
                j--;
            }
        }

        return -1;
    }
}
