package chap12;

/*멀티스레드(multi thread) : 하나의 프로세스에서 여러개의 thread가 동시에 일어나는 것
    예) 미디어플레이어 : 사운드 재생과 영상 재생이 동시에 실행 */

//p529
//메인 스레드와 작업 스레드(BeepTask_p529)가 동시에 실행
public class BeepPrintMain02_p529_0524_07 {

	public static void main(String[] args) {
		
		Thread thread = new BeepTesk02_p529_0524_06(); //쓰레드 생성
		thread.start(); //Thread 클래스의 run() 호출
		
		for(int i=1; i< 6; i++) {
			System.out.println(i + "영상재생");
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
	}

}
}
