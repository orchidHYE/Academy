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
public class Car02 {
	//field : 데이터 저장 (명사적 형태)
	//[접근제어자] [제어자] 타입 필드명[=초기값];
	//고유 데이터
	
	String color = "red";
	private String brand = "볼보";
	private double fuelEff = 10.5; 
	private int rpm = 10000;
	private char haveAI = 'Y';
	private boolean haveNavi = true; 
	
	//상태 데이터
	
	private int currentSpeed = 0;
	private int maxSpeed = 300;
	
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
	//brand 필드의 값을 변경
	public void setBrand(String brand) {
		 this.brand = brand;
	}
	
	public void setFuelEff(double fuelEff) {
		this.fuelEff = fuelEff;
	}
	
	public void setRpm(int rpm) {
		this.rpm = rpm;
	}
	
	public void setHaveAI (char haveAI) {
		this.haveAI = haveAI;
	}
	
	public void setHaveNavi (boolean haveNavi) {
		this.haveNavi = haveNavi;
	}
	
	public void setCurrentSpeed (int currentSpeed) {
		this.currentSpeed = currentSpeed;
	}
	
	public void setMaxSpeed (int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}
	
	
	// brand필드의 값을 외부에 제공
	public String getBrand() {
		return brand;
	}
	
	public double getFuelEff () {
		return fuelEff;
	}
	
	public int getRpm () {
		return rpm;
	}
	
	public char getHaveAI () {
		return haveAI;
	}
	
	public boolean getHaveNavi () {
		return haveNavi;
	}
	
	public int getCurrentSpeed () {
		return currentSpeed;
	}
	
	public int getMaxSpeed () {
		return maxSpeed;
	}
	
}
