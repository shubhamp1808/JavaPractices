package Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParantheses {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParantheses(n));
    }

    public static List<String> generateParantheses(int n){
        List<String> result = new ArrayList<>();
        findAll("(", 1, 0, result, n);
        return result;
    }

    static void findAll(String curr, int open, int close, List<String> result, int n){

        if(curr.length()==2*n){
            result.add(curr);
            return;
        }

        if(open<n){
            findAll(curr+"(", open+1, close, result, n);
        }
        if(close<open){
            findAll(curr+")", open, close+1, result, n);
        }
    }
}
