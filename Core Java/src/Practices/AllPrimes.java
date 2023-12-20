package Practices;

import java.util.Scanner;

public class AllPrimes {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			int low = scn.nextInt();
			int high = scn.nextInt();

			for (int i = low; i <= high; i++) {
				int count = 0;
				for (int d = 2; d <= Math.sqrt(i); d++) {
					if (i % d == 0) {
						count++;
						break;
					}
				}
				if (count == 0) {
					System.out.println("Prime:: " + i);
				}
			}
		}

	}

}
