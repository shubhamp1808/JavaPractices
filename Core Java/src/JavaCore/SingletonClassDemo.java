package JavaCore;

/*
 * Singleton Class--> which can have only one instance created
 */

public class SingletonClassDemo {
	public static void main(String[] args) {
//		Demo demo = new Demo();
//		Demo demo1 = new Demo();
		Demo demo = Demo.getObject();
		System.out.println(demo);
	}

}

class Demo{
	static Demo demo = new Demo();              //make it a static object
	private Demo(){ }                           // define as private method
	public static Demo getObject(){             //to make a single instance
		return demo;
	}
	
}
