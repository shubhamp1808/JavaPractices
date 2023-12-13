package Java8;

/*
 * Phone interface has call method that AndroidPhone implements and has defined
 * in future, if Message functionality has to be added in Phone so, AndroidPhone will have to define that method too
 * to help this, we can define a method in interface using default keyword
 */

interface Phone{
	void call();
	
	default void message(){
		System.out.println("Sent::");
	}
}

class AndroidPhone implements Phone{
	public void call(){
		System.out.println("Calling::");
	}
}


public class DefaultMethod {

	public static void main(String[] args) {
		Phone p = new AndroidPhone();
		p.call();
		p.message();
	}

}
