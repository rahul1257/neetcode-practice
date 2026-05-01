class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int n: nums) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        List<int[]> list = new ArrayList<>();
        for(Map.Entry<Integer, Integer> m: map.entrySet()) {
            list.add(new int[] {m.getValue(), m.getKey()});
        }

        list.sort((a, b) -> b[0] - a[0]);

        int[] res = new int[k];
        for(int i = 0; i < k && i < nums.length; i++) {
            res[i] = list.get(i)[1];
        }

        return res;
    }
}
