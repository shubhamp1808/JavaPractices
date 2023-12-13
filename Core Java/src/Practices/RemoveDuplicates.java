package Practices;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {
	
	
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scn.next();
		
		char[] word = str.toCharArray();
		int n = str.length();
		
		removeDuplicates(word, n);
	}
	
	static void removeDuplicates(char[] a , int n){
		HashSet<Character> hash = new LinkedHashSet<>(n-1);
		
		for(char x : a) 
			hash.add(x);
		
		
		for(char x : hash) 
			System.out.print(x);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}