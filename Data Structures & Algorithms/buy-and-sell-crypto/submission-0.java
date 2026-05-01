class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        int ans = 0;

        pref[0] = prices[0];
        suff[n-1] = prices[n-1];

        for(int i=1; i<n; i++) {
            pref[i] = Math.min(pref[i-1], prices[i]);
            suff[n-1-i] = Math.max(suff[n-i], prices[n-1-i]);
        }

        for(int i = 0; i<n; i++) {
            ans = Math.max(suff[i] - pref[i], ans);
        }

        return (ans > 0) ? ans : 0;
    }
}
