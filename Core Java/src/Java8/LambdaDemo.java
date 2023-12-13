package Java8;

//we can use lambda expression in Functional Interface

@FunctionalInterface
interface A{
//	void show();
	void show(int i);
}

//class demo implements A{
//	public void show() {
//		System.out.println("Shown::");
//	}
//}

public class LambdaDemo {

	public static void main(String[] args) {
		A obj;  //if no class implements an interface, we can not make object of interface
//		obj = new demo();
		
		/*
		obj = new A() {                       
			public void show() {               //anonymous class
				System.out.println("Shown::");
			}
		};
		*/
		/*
		obj = () -> {
			System.out.println("Shown::");
		};
  		*/
		
//		obj = () -> System.out.println("Shown::");
		
//		obj = (int i) -> System.out.println("Shown::"+i);
		obj = i -> System.out.println("Shown::"+i);
		
		obj.show(6);
		

	}

}
