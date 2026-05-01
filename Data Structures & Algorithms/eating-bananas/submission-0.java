class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = Arrays.stream(piles).max().getAsInt();
        int res = r;

        while(l <= r) {
            int mid = (l + r) / 2;

            int totalHours = 0;
            for(int pile: piles) {
                totalHours += Math.ceil((double)pile / mid);
            }

            if(totalHours <= h) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }
}
