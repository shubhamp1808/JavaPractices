package Methods;

import java.util.Arrays;

public class MethodOverloading {
	public static void main(String[] args) {
		demo(1, 34, 67, 8, 2);
		demo("First", "Second", "Third");
	}
	
	static void demo(int... v) {
		System.out.println(Arrays.toString(v));
	}
	
	static void demo(String... v) {
		System.out.println(Arrays.toString(v));
	}
}