package Practices;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine();
		String s2 = s.nextLine();
		
		if(s1.length() == s2.length()) {
			char[] char1 = s1.toCharArray();
			char[] char2 = s2.toCharArray();
			Arrays.sort(char1);
			Arrays.sort(char2);
			
			boolean anagram = Arrays.equals(char1, char2);
			System.out.println(anagram);
		}
	}
}
