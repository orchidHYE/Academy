package chap12;

import java.awt.Toolkit;

//p526
//Beep음 소리 작업
//Runnable 인터페이스를 구현한 클래스
public class BeepTesk_p562_0524_04 implements Runnable {

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
