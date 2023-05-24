package chap12;

//p532_0524_09
public class ThreadA extends Thread {

	public ThreadA() {
		setName("ThreadA");
	}

	public void run() {
		for(int i=1; i< 6; i++) {
			String name = getName();
			System.out.println(name);
	}
	
}
}
