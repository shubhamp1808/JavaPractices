package Practices;

import java.util.Scanner;

public class InverseNum {
// 21453--> 23154
	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			System.out.print("Enter Number");
			int num = scn.nextInt();

			int inv = 0;
			int op = 1;
			while (num != 0) {
				int od = num % 10;
				int ip = od;
				int id = op;

				inv = inv + id * (int) Math.pow(10, ip - 1);
				num = num / 10;
				op++;
			}
			System.out.println(inv);
		}
	}

}
