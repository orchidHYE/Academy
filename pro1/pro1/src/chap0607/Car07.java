package chap0607;

public class Car07 {
	//필드
	int price;
	String company; //제조회사명 
	Tire fL_Tire = new Tire("전면 좌측", 6);
	Tire fR_Tire = new Tire("전면 우측", 2);	
	Tire bL_Tire = new Tire("후면 좌측", 3);
	Tire bR_Tire = new Tire("후면 우측", 4);
	
	//생성자
	
	//메소드
	int run () {
		System.out.println("run() 자동차 달립니다.");
		if (fL_Tire.roll() == false) {
			stop();
			return 1;
		} 
		if (fR_Tire.roll() == false) {
			stop();
			return 2;
		} 
		if (bL_Tire.roll() == false) {
			stop();
			return 3;
		} 
		if (bR_Tire.roll() == false) {
			stop();
			return 4;
		} 
			return 0; //No problem일 때
	}
	
	void stop () {
		System.out.println("stop() 자동차 멈춥니다.");
		
	}
}
