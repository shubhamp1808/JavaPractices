package Practices;

public class ElementInArray {

	public static void main(String[] args) {
		int[] arr = {2,3,4,1,1,2,98,23};
		int d = 2;
		
//		for(int x : arr) {
//			if(d==x)
//			System.out.println(x);
//		}
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]==d) {
				System.out.println(i);
			}
		}
	}

}
