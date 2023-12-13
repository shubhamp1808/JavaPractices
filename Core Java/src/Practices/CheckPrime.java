package Practices;

import java.util.Scanner;

@SuppressWarnings("resource")
public class CheckPrime {

	public static void main(String[] args) {
		System.out.println("Enter number::");
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		/*
		int count =0;
		for(int d=1; d<=n; d++) {
			if(n%d==0)
				count++;
		}
		
		System.out.println("factors:: "+count);
		if(count==2) {
			System.out.println(n+" is Prime.");
		}
		else {
			System.out.println(n+" is not Prime.");
		}
		*/
		
		int count =0;
		for(int d=2; d<=Math.sqrt(n);) {
			if(n%d==0)
				count++;
			break;
		}
		
		System.out.println("factors:: "+count);
		if(count==0) {
			System.out.println(n+" is Prime.");
		}
		else {
			System.out.println(n+" is not Prime.");
		}
	}
}
