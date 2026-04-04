class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] la = new int[l];
        int[] ra = new int[l];
        la[0] = nums[0];
        ra[l-1] = nums[l-1];

        for (int i =1 , j = l-2 ; i<l && j >=0; i++, j--) {
            la[i] = nums[i] * la[i-1];
            ra[j] = nums[j] * ra[j+1];
        }

        int[] arr = new int[l];

        for (int i=0; i<l; i++) {
            if (i ==0) {
                arr[i] = ra[i+1];
            } else if (i == l-1) {
                arr[i] = la[i-1];
            } else
                arr[i] = la[i-1] * ra[i+1];
        }

        return arr;
        
    }
}  
