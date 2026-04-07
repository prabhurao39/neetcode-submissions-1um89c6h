class Solution {
    public int maxArea(int[] heights) {
        int n = heights.length;
        int[] lmax = new int[n];
        int[] rmax = new int[n];

        for (int i=0; i<n; i++) {
            if(i==0) {
                lmax[i] = heights[i];
            } else {
                lmax[i] = Math.max(heights[i], lmax[i-1]);
            }
        }

        for (int i=n-1; i>= 0; i--) {
            if(i==n-1) {
                rmax[i] = heights[i];
            } else {
                rmax[i] = Math.max(heights[i], rmax[i+1]);
            }
        }

        int maxAmt =0;
        for (int i=0, j = n-1; i<j;) {
            int m = 0;
            m = Math.min(lmax[i], rmax[j]) * (j-i);
            if (lmax[i] > rmax[j]) {
                j--;
            } else {
                i++;
            }
            maxAmt = Math.max(m, maxAmt);
        }

        return maxAmt;
    }
}
