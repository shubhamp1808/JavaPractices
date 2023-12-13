package Practices;

import java.util.Scanner;

public class InverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		
		int inv[] = new int[n];
		for(int j=0; j<arr.length;j++) {
		int v=	arr[j];
		inv[v]=j;
		}
		for(int x:inv) {
			System.out.println(x);
		}
	}

}
