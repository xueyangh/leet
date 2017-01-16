public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (int i=0; i<s.length(); i++) {
            char curr = s.charAt(i);
            String lefts = "([{";
            if (lefts.indexOf(curr)!=-1) {
                stack.push(curr);
            } else {
                if (stack.empty()) {
                    return false;
                } else {
                    char left = stack.pop();
                    if (left == '(' && curr != ')') {
                        return false;
                    } else if (left == '[' && curr != ']') {
                        return false;
                    } else if (left == '{' && curr != '}') {
                        return false;
                    }
                }
            }
        }
        return stack.empty();
    }
}
