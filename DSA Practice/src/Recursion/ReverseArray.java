package Recursion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ReverseArray {
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter number");
        int n = myObj.nextInt();
        List<Integer> arr = new ArrayList<>();

        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
            arr.add(i, myObj.nextInt());
        }

        List<Integer> reversed = reverse(arr, 0);

        System.out.println("Reversed::");
        for (int i = 0; i < reversed.size(); i++) {
            System.out.print(reversed.get(i) + " ");
        }
    }

    public static List<Integer> reverse(List<Integer> arr, int l){
        if(l>=arr.size()/2) return arr;
        Collections.swap(arr, l, arr.size()-l-1);
        reverse(arr, l+1);
        return arr;
    }
}
