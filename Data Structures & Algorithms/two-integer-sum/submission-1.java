class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if(map.containsKey(target - n)) {
                arr[0] = map.get(target - n);
                arr[1] = i;

                return arr;
            }
            map.put(n, i);
        }
        return arr;
    }
}
