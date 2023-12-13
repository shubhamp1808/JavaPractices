package Java8;

/*
 * Explanation of forEach Method or Consumer Interface
 */
import java.util.Arrays;
import java.util.List;

//class CompSampl implements Consumer<Integer> {
//
//	@Override
//	public void accept(Integer t) {
//		System.out.println(t);
//		
//	}
//	
//}

public class ConsumerInterfaceDemo {

	public static void main(String[] args) {
		List<Integer> sample = Arrays.asList(4,5,2,7,8,9);
		// Consumer<Integer> comp;
//		comp = t-> System.out.println(t);
			
		sample.forEach(t-> System.out.println(t));
		
//		sample.forEach(i-> System.out.println(i));
		
		

	}

}
