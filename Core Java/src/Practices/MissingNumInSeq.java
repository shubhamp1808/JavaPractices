package Practices;

import java.util.Arrays;

public class MissingNumInSeq {

	public static void main(String[] args) {
		//array of integers 1,3,4,6,5
		//spit out missing number in sequence
		
		int arr[] = {1,3,4,6,5};
		
		//1,3,4,5,6
		Arrays.sort(arr);
//		int m=0;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=1;j<arr.length-1;j++) {
//				int d= arr[j]-arr[i];
//				if(d!=1) {
//					m=arr[j]-1;
//					break;
//				}
//			}
//		}
		
		 int total = 1;
	        for (int i = 2; i <= (arr.length + 1); i++) {
	            total += i;
	            total -= arr[i - 2];
	        }
		System.out.println(total);
	}

}
