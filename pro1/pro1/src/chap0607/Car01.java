package chap0607;

// 클래스
/* [접근제어자] [제어자] class 클래스명 {
	//field : 데이터 저장 (명사적 형태)
	[접근제어자] [제어자] 타입 필드명[=초기값];
	
	//constructor (생성자) : 객체생성, 필드 초기화 주로 사용
	[접근제어자] 메서드명 (매개변수리스트) {}
	
	//method : 기능 동자 (동사적 형태)
	[접근제어자] [제어자] 리턴유형 메서드명 (매개변수리스트) {}
}
*/
public class Car01 {
	//field : 데이터 저장 (명사적 형태)
	//[접근제어자] [제어자] 타입 필드명[=초기값];
	//고유 데이터
	
	String color = "red";
	String brnad = "볼보";
	double fuelEff = 10.5; 
	int rpm = 10000;
	char haveAI = 'Y';
	boolean haveNavi = true; 
	
	//상태 데이터
	
	int currentSpeed = 0;
	int maxSpeed = 300;
	
	//시동 켜기
	void powerOn () {
		System.out.println("powerOn() 호출");
	}
	
	
	//시동 끄기
	void powerOff() {
		System.out.println("powerOff() 진입");
	}
	
	//속도 높이다
	void speedUp () {
		System.out.println("speedUp()");
		currentSpeed++;
	}
	
	//속도 낮추다
	void speedDown () {
		System.out.println("speedDown()");
		currentSpeed--;
	}
	
	//부품 데이터
	
	//method : 기능 동자 (동사적 형태)
	//[접근제어자] [제어자] 리턴유형 메서드명 (매개변수리스트) {}
	
	
}










