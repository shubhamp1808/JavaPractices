package Practices;

import java.util.Scanner;

public class ReverseString {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter string to reverse::");
		Scanner scn= new Scanner(System.in);
		String str = scn.next();
		
		//length of string
		int len = str.length();
		String rev="";
		/*for(int i=len-1;i>=0;i--) {
			rev = rev+str.charAt(i);
		}*/
		
		char[] a = str.toCharArray();
		for(int i = len-1; i>=0; i--) {
			rev = rev+a[i];
		}
		System.out.println(rev);
		
		/*StringBuffer string = new StringBuffer(str);
		System.out.println(string.reverse());*/
	}

}
