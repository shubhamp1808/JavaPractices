package Stacks;

import java.util.Stack;

public class ValidParanthesis {
    public static void main(String[] args) {
        String s = "(({[]})";
        System.out.println(checkifValid(s));
    }

    public static boolean checkifValid(String s){
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);

            if(isOpening(curr)){
                stack.push(curr);
            } else {
                if (stack.isEmpty()) {
                    return false;
                } else if (!isMatching(stack.peek(), curr)) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        return stack.isEmpty();
    }

    static boolean isOpening(char c){
        return c == '(' || c == '[' || c == '{';
    }

    static boolean isMatching(char a, char b){
        return a == '(' && b == ')' || a == '{' && b == '}' || a == '[' && b == ']';
    }
}
