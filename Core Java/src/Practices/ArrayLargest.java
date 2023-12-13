package Practices;

import java.util.Arrays;

public class ArrayLargest {

	public static void main(String[] args) {
		int A[] = {87,87,6,9,36,12,21};
		int n = A.length;
		print2largest(A, n);
	    
	}
	
	static void print2largest(int A[], int n) {
		
		if(n<2)
			System.out.println("Not a valid array.");
		
		Arrays.sort(A);
		
		for(int i=0; i<n;i++)
		System.out.println(A[i]);
		
		for (int i = n - 2; i >= 0; i--) {
			// If the element is not equal to largest element
			if (A[i] != A[n - 1]) {
				System.out.printf("The second largest " + "element is %d\n", A[i]);
				return;
			}
		}
		
	}

}
