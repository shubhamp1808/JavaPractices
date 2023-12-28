package Arrays;

import java.util.*;

// Move Zeros to End

public class ZerosToEnd {
    public static void main(String[] args) {
        int[] sample ={2,3,6,0,1,0,0,8,4,0};
        int n = sample.length;
        System.out.println("After sorting array: " + Arrays.toString(zerosToEnd(sample, n)));
    }

    /*
    //Brute
    static int[] zerosToEnd(int[] a, int n){
        ArrayList<Integer> temp = new ArrayList<>();
        for(int i=0; i<n;i++){
            if(a[i]!=0){
                temp.add(a[i]);
            }
        }

        for(int i=0; i<temp.size(); i++){
            a[i]=temp.get(i);
        }

        for(int i=temp.size(); i<n; i++){
            a[i]=0;
        }
        return a;
    }  */

    //Optimal
    static int[] zerosToEnd(int[] a, int n){
        int j =-1;
        for(int i=0; i<n; i++){
            if(a[i]==0){
                j=i;
                break;
            }
        }

        if(j==-1) return a;

        for(int i=j+1; i<n;i++){
            if(a[i]!=0){
                int tmp = a[i];
                a[i] = a[j];
                a[j] = tmp;
                j++;
            }
        }
        return a;
    }
}
