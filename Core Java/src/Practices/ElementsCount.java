package Practices;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ElementsCount {

	public static void main(String[] args) {
		try (Scanner scn = new Scanner(System.in)) {
			String str = scn.next();
			Map<Character, Integer> hm = new HashMap<Character, Integer>();
//		int count=0;
			for (int i = 0; i < str.length(); i++)
			{
			  char ch = str.charAt(i);
			  if (hm.containsKey(ch)) //2
			  {
			    int old = hm.get(ch);
			    int now = old + 1;
			    hm.put(ch, now);
			  }
			  else {  //3
			    hm.put(ch, 1);
			  }

			}

			char max = str.charAt(0); //4
			for (Character key : hm.keySet()) //5
			{
			  if (hm.get(key) > hm.get(max))
			    max = key;

			}
			System.out.println(max);  //6
		}
	  }


}
