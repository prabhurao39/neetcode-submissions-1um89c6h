class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];
        lmax[0] = height[0];
        rmax[n-1] = height[n-1];
        for (int i=1, j=n-2; i<n&& j>=0; i++, j--) {
            lmax[i] = Math.max(height[i], lmax[i-1]);
            rmax[j] = Math.max(height[j], rmax[j+1]);
        }

        int max =0;
        for (int i=0; i<n; i++) {
            max = max + Math.min(lmax[i], rmax[i]) - height[i];
        }
        return max;
    }
}
