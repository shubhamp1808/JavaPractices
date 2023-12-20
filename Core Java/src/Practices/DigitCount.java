package Practices;

import java.util.*;

public class DigitCount {

	public static void main(String[] args) {
		System.out.print("Enter Number:::");
		try (Scanner scn = new Scanner(System.in)) {
			int n = scn.nextInt();
			int s = n;
			int count=0;
			while(n!=0) {
				n=n/10;
				count++;
			}
			System.out.println(count);
			
			int div = (int) Math.pow(10, count-1);
			while(div!=0) {
				int q = s/div;
				System.out.println(q);
				s = s%div;
				div=div/10;
				
			}
		}

	}

}
