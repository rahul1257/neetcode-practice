class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] pref = new int[n];
        int[] suff = new int[n];
        int ans = 0;

        pref[0] = height[0];
        suff[n-1] = height[n-1];

        for(int i = 1; i < n; i++) {
            pref[i] = Math.max(pref[i-1], height[i]);
            suff[n-i-1] = Math.max(suff[n-i], height[n-i-1]);
        }

        for(int i = 0; i < n; i++) {
            ans += (Math.min(pref[i], suff[i]) - height[i]);
        }
        return ans;
    }
}
