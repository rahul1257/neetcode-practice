class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        int n = nums.length;
        int ans = 0;

        for(int i = 0; i < n; i++) {
            hs.add(nums[i]);
        }

        for(int i = 0; i < n; i++) {
            if(hs.contains(nums[i] - 1)) {
                continue;
            }

            int curr = 0;
            int num = nums[i];
            while(hs.contains(num)) {
                curr = curr + 1;
                num = num + 1;
            }
            ans = Math.max(ans, curr);
        }
        return ans;
    }
}
