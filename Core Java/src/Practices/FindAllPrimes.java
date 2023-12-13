package Practices;

import java.util.Arrays;

public class FindAllPrimes {

	public static void main(String[] args) {
		boolean isPrime[] = seiveOfEratosthenes(20);
		for (int i = 0; i <= 20; i++) {
			System.out.println(i + " is Prime? " + isPrime[i]);
		}
	}

	static boolean[] seiveOfEratosthenes(int n) {
		boolean[] isPrime = new boolean[n + 1];
		Arrays.fill(isPrime, true);

		isPrime[0] = false;
		isPrime[1] = false;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			for (int j = i * 2; j <= n; j += i) {
				isPrime[j] = false;
			}
		}

		return isPrime;

	}

}
