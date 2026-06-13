class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int r = Arrays.stream(piles).max().getAsInt();
        int ans = r;
        int l = 1;
        System.out.println(l);
        while (l <= r) {
            int k = (l + r) / 2;

            long totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / k);
            }
            if (totalTime <= h) {
                ans = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
    }

    return ans;
    }
}
