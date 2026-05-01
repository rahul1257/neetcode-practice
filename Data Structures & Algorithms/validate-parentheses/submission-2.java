class Solution {
    private boolean isValidParentheses(char ch1, char ch2) {
        if((ch1 == '(' && ch2 == ')') ||
                (ch1 == '{' && ch2 == '}') ||
                (ch1 == '[' && ch2 == ']')) {
                    return true;
                }
        return false;
    }
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for(char ch: s.toCharArray()) {
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if(!stack.isEmpty() && isValidParentheses(stack.peek(), ch)) {
                stack.pop();
            } else {
                return false;
            }
        }
        if(stack.isEmpty()) return true;
        return false;
    }
}
