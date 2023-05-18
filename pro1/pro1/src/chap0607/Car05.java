package chap0607;

//이 클래스는 Machine01_p310클래스를 상속받는 하위클래스이다.
//[접근제한자] [제어자] class 클래스명 extends 부모클래스명 {}
public class Car05 extends Machine01_p310 {
	//Machine01클래스로부터 field,method를 상속받았다
	//필드
	int currentSpeed; //자동초기화 값이 0이기 때문에 동일한 값인 0입력 안넣어줘도 됨
	static int maxSpeed = 300; //고정값의 변수이기 때문에 static으로 접근제한자 선언
	
	//메소드
	//속도 높이다
	void speedUp (int speed) {
		currentSpeed += speed;
	}
	
	//속도 낮추다
	void speedDown (int speed) {
		currentSpeed -= speed;
	}

}
