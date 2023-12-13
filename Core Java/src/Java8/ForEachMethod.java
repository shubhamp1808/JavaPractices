package Java8;

import java.util.Arrays;
import java.util.List;

public class ForEachMethod {

	public static void main(String[] args) {
		List<Integer> sample = Arrays.asList(6,3,8,9,26,33);  // a list containing integers
		
		//to iterate, we can use several methods like
		/*
		for(int i =0; i<sample.size(); i++) {
			System.out.println(sample.get(i));
		}
		
		for(int i : sample) {
			System.out.println(i);
		}
		*/
		
//		In JAVA 8, forEach is useful method to iterate List
		
		sample.forEach(i -> System.out.println(i));  //lambda expression refer pt4   //Consumer Interface
		
	}

}
