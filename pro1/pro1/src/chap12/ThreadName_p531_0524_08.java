package chap12;


//p531 - 스레드 이름 출력 및 User Thread 생성 및 시작
//Thread.currentThread() : 현재 스레드 얻기
//참조변수.setName("스레드 이름") : 스레드에 이름 설정
//참조변수.getName() : 스레드에 이름 가져오기

public class ThreadName_p531_0524_08 {

	public static void main(String[] args) {
		//현재 스레드 얻기
		Thread mainThread = Thread.currentThread();
		System.out.println("현재 스레드 이름: " + mainThread.getName()); //main
		
		Thread ta = new ThreadA();
		System.out.println("스레드 이름: " + ta.getName()); //main
		ta.start();
		
		Thread tb = new ThreadB();
		System.out.println("스레드 이름: " + tb.getName()); //main
		tb.start();
		
		Thread tc = new ThreadB();
		System.out.println("스레드 이름: " + tc.getName()); //main
		tc.start();
	}

}
