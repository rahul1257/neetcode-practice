class Solution {
    public int evalRPN(String[] tokens) {
        int n = tokens.length;
        if(n < 2) {
            return Integer.parseInt(tokens[0]);
        }

        Deque<Integer> stack = new ArrayDeque<>();
        for(String str: tokens) {
            if(str.equals("+")) {
                stack.push(stack.pop() + stack.pop());
            } else if(str.equals("-")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b - a);
            } else if(str.equals("*")) {
                stack.push(stack.pop() * stack.pop());
            } else if(str.equals("/")) {
                int a = stack.pop();
                int b = stack.pop();
                stack.push(b/a);
            } else {
                stack.push(Integer.parseInt(str));
            }
        }
        return stack.pop();
    }
}
