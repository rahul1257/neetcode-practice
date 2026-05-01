class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] res = new int[n];
        Deque<int[]> stack = new ArrayDeque<>();

        for(int i = 0; i < n; i++) {
            int curr = temperatures[i];

            while(!stack.isEmpty() && curr > stack.peek()[0]) {
                int[] temp = stack.pop();
                res[temp[1]] = i - temp[1];
                
            }

            stack.push(new int[] {curr, i});
        }
        return res;
    }
}
