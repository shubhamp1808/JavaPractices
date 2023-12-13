package Practices;

import java.util.Arrays;
import java.util.Scanner;

public class SpanOfArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			int d = scn.nextInt();
			arr[i] = d;
		}
		Arrays.sort(arr);
		int max = arr[n - 1];
		int min = arr[0];
		System.out.println(max - min);
	}

}
