package StreamMapFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsMapExm {

	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(2,3,4,5,6);
		
		List<Integer> updatedList = list1.stream().map(x -> x*2).collect(Collectors.toList());
		
		System.out.println(updatedList);
		
		list1.stream().map(x -> x*2).forEach(System.out::println);

	}

}
