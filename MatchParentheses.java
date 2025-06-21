import java.util.Stack;

public class MatchParentheses {
    public static void main(String[] args) {
        String expression = "{[(2+3)*(5-1)]}";
        boolean result = isBalanced(expression);
        System.out.println("Expression: " + expression);
        System.out.println("Balanced: " + result);
    }

    public static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<>();

        for (char ch : expr.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}

Output:

Expression: {[(2+3)*(5-1)]}
Balanced: true

