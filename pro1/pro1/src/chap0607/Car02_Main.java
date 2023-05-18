package chap0607;

//이 클래스는 Car02의 실행 클래스이다.
public class Car02_Main {
	
	public static void main (String[] args) {
		//Car02 객체생성하여 참조변수 car1에 할당
		//클래스명 변수 = new 클래스명();
		//Car02의 color값 확인
		
		Car02 car1 = new Car02();
		car1.color = "검정";
		System.out.println(car1.color); //error
		//The field Car02.color is not visible
		//System.out.println(car1.brnad); //error
		//The field Car02.color is not visible
		
		String brand = car1.getBrand();
		System.out.println(brand); //클래스 파일의 brand 값이긴하나 같으건 아님
		
		car1.setBrand("브랜드");
		System.out.println(car1.getBrand());
		
		double fuelEff = car1.getFuelEff();
		System.out.println(fuelEff);
		
		car1.setFuelEff(15.2);
		System.out.println(car1.getFuelEff());
		
		//System.out.println(car1.currentSpeed); //error
		//The field Car02.currentSpeed is not visible
		
		//getter()를 호출하여 Car02 클래스의 필드값 가져오기
		double FuelEff = car1.getFuelEff();
		System.out.println(fuelEff);
		
		int rpm = car1.getRpm();
		System.out.println(rpm);
		
		char haveAI = car1.getHaveAI();
		System.out.println(haveAI);
		
		boolean haveNavi = car1.getHaveNavi();
		System.out.println(haveNavi);
		
		int currentSpeed = car1.getCurrentSpeed();
		System.out.println(currentSpeed);
		
		int maxSpeed = car1.getMaxSpeed();
		System.out.println(maxSpeed);
		
		
	}
}
