package Stacks;

import java.util.Stack;

public class StringReversal {
    public static void main(String[] args) {
        String s = "interview";
        int n = s.length();

        Stack<Character> obj = new Stack<>();
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < n; i++) {
            obj.push(s.charAt(i));
        }
        for (int i = 0; i < n; i++) {
            str.append(obj.pop());
        }
        System.out.println(str);
    }
}