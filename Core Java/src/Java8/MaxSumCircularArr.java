package Java8;

import java.util.Arrays;

public class MaxSumCircularArr {
	
//	public static int maxCircularSum(int a[], int n) {
//		
////		sum=0
////				For sum = sum+a[i]
////
////				Int first = a[0], inc = a[0], last = a[0], dec = a[0]
////
////				First = max
//
//		int sum =0;
//		for(int i =0; i<n; i++) {
//			sum = sum+a[i];
//		}
//		
//		
//		
//		return 0;
//	}
	
	
//	Input:  {1, 2, 3, 4, 5, 6, 7}
//	Output: {1, 3, 2, 5, 4, 7, 6}
//	Input:  {9, 6, 8, 3, 7}
//	Output: {6, 9, 3, 8, 7}
//	 
//	Input:  {6, 9, 2, 5, 1, 4}
//	Output: {6, 9, 2, 5, 1, 4}

	
	public static void rearrangeArr(int[] num) {
		for(int i = 1; i<num.length; i = i+2) {
			if(num[i-1]>num[i]) {                      //i-1
				int temp = num[i-1];
				num[i-1]=num[i];
				num[i]=temp;
			}
			
			//i+1
			if(i+1 <num.length && num[i+1]>num[i]) {
				int temp = num[i+1];
				num[i+1]=num[i];
				num[i]=temp;
			}
		}
	}
	
	public static void main(String args[]) {
		int[] num =  {1, 2, 3, 4, 5, 6, 7};
		System.out.println(Arrays.toString(num));
		rearrangeArr(num);
		
		System.out.println(Arrays.toString(num));
	}

}






















