package Practices;

import java.util.Scanner;

public class BarChart {

	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
	    int n = 5;
	    int[] arr = {3, 1, 0, 7, 5};


	    int max = Integer.MIN_VALUE;
	    for (int i = 0; i < n; i++) {

	      max = Math.max(max, arr[i]);
	    }


	    for (int i = 0; i < max; i++) {
	      for (int val : arr) {
	        if (val >= max - i) {
	          System.out.print("*	");
	        } else {
	          System.out.print("	");
	        }
	      }

	      System.out.println();
	    }
	}

}
