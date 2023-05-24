package chap12;

//p532_0524_10
public class ThreadB extends Thread {
	
	public void run() {
		for(int i=1; i< 6; i++) {
			String name = getName();
			System.out.println(name);
	}
	
}
}
