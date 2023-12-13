package Practices;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Number");
		int n = scn.nextInt();

		while (n != 0) {
			int q = n % 10;
			System.out.print(q);
			n = n / 10;
		}

	}

}
