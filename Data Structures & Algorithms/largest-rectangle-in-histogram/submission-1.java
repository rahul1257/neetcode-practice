class Solution {
    public int largestRectangleArea(int[] heights) {
        int res = 0, curr = 0, n = heights.length, tp = 0;
        Deque<Integer> st = new ArrayDeque<>();

        for(int i = 0; i < n; i++) {
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                tp = st.pop();

                int width = st.isEmpty() ? i : i - st.peek() - 1;

                res = Math.max(res, heights[tp] * width);
            }
            st.push(i);
        }

        while(!st.isEmpty()) {
            tp = st.pop();
            curr = heights[tp] * (st.isEmpty() ? n : n - st.peek() - 1);
            res = Math.max(res, curr);
        }

        return res;
    }
}
