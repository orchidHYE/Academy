package chap12;

import java.awt.Toolkit;

//p529
//Beep음 소리 작업
//Thread 하위 클래스로부터 생성. Thread클래스 상속
public class BeepTesk02_p529_0524_06 extends Thread {

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=1; i< 6; i++) {
			toolkit.beep();
			//System.out.println("사운드 재생");
			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
 
}
