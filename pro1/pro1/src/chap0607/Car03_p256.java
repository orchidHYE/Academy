package chap0607;

//이 클래스는 Car03의 실행클래스이다
public class Car03_p256 {
	
	public static void main (String[] args) {
		//Car03의 객제를 생성하여 참조변수 myCar에 할당
		//타입 변수 = new 클래스명();
		Car03 myCar = new Car03();
		System.out.println(myCar); //chap06.Car03@15db9742
		//System.out.println("초기 gas = " + myCar.gas); //클래스 파일에서 선언만 했기때문에 초기값인 0으로 저장.
		System.out.println("초기 gas = " + myCar.getGas()); //클래스 파일에서 선언만 했기때문에 초기값인 0으로 저장.
		
		//가스 충전
		myCar.setGas(100);
		System.out.println("가스량 = " + myCar.getGas());
		
		//가스량 확인
		//gas가 존재하면 "출발합니다." 
		boolean gasState = true;
				
		if (gasState) {
			System.out.println("출발합니다.");
			myCar.run();
		}
		
		if (myCar.isLeftGas()){
			System.out.println("gas가 충분합니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
		
	}
	
}
