package Practices;

import java.util.Scanner;

public class DigitFreq {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Number::");
		int n = scn.nextInt();
		System.out.println("Enter number to check the frequncy of?");
		int d = scn.nextInt();
		int t=n;
		int count=0;
		while(n!=0) {
			n=n/10;
			count++;
		}
//		System.out.println(count);
		int fq=0;
		int div = (int) Math.pow(10, count-1);
		while(div!=0) {
			int q= t/div;
//			System.out.println(q);
			t=t%div;
			div=div/10;
			
			if(q==d) {
				fq++;
			}
		}
		System.out.println(fq);
	}

}
