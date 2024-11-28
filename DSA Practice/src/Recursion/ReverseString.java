package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseString {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter String");
        String n = myObj.nextLine();
        List<Character> arr = new ArrayList<>();

        for(int i=0; i<n.length(); i++){
            arr.add(i, n.charAt(i));
        }

        List<Character> reversed = reverse(arr, 0);

        System.out.println("Reversed::");
        for (int i = 0; i < reversed.size(); i++) {
            System.out.print(reversed.get(i) + " ");
        }
    }

    public static List<Character> reverse(List<Character> arr, int l){
        if(l>=arr.size()/2) return arr;

        Collections.swap(arr, l, arr.size()-l-1);
        reverse(arr, l+1);
        return arr;
    }
}
