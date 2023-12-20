package Practices;

import java.util.Scanner;
// 0 1 2 3 5 8 13 21 34 55
public class Fibonacci {

	public static void main(String[] args) {
		
		try (Scanner scn = new Scanner(System.in)) {
			int n = scn.nextInt();
			
			int i=0;
			int j=1;
			int m;
			System.out.println(i);
			System.out.println(j);
			for(int k=3; k<=n;k++) {			
				m=i+j;
				System.out.println(m);
				i=j;
				j=m;
			}
		}

	}

}
