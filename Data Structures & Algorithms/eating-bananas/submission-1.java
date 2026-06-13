class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        
        double ll = Math.floor(Arrays.stream(piles).sum())/(double)h;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;
        int l = (int)ll;
        System.out.println(l);
        while (l <= r) {
            int k = (l + r) / 2;

            long totalTime = 0;
            for (int p : piles) {
                totalTime += Math.ceil((double) p / k);
            }
            if (totalTime <= h) {
                res = k;
                r = k - 1;
            } else {
                l = k + 1;
            }
    }

    return res;
    }
}
