package JavaCore;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		CustomThreadClass t1 = new CustomThreadClass();
//		Thread t = new Thread(t1);
		t1.start();
	}

}
