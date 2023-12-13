package JavaCore;

//public class CustomThreadClass implements Runnable{
//
//	@Override
//	public void run() {
//		for(int i=1; i<=10; i++) {
//			System.out.println(i*5);
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//
//}

public class CustomThreadClass extends Thread{
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println(i*5);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
