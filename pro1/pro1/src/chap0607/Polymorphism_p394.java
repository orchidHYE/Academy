package chap0607;

//p394
//Polymorphism (다형성) : 매개변수의 다형성

class BusP393 implements Vehicle_p393 {
	@Override
	public void run () {
		System.out.println("Bus.run()메소드 호출 ");
	}
}

class TaxiP393 implements Vehicle_p393 {
	@Override
	public void run () {
		System.out.println("Taxi.run()메소드 호출 ");
	}
}

public class Polymorphism_p394 {
	public static void main(String[] args) {
		DriverP393 driver = new DriverP393();
		//driver.drive(new Vehicle_p393()); //인터페이스는 생성자가 없으므로 에러 발생
		//Cannot instantiate the type Vehicle_p393
		
		BusP393 bus = new BusP393(); //Driver클래스에서 -> Vehicle 클래스 사용 -> 택시랑 버스 Vehicle 상속 받음  
		//bus.set메서드(값); => 기본생성자이지만 값을 넣어줘야하는 경우도 있음
		driver.drive(bus); //호출 가능해짐 
		
		TaxiP393 taxi = new TaxiP393();
		driver.drive(taxi);
		//driver.drive(new Car05); => Vehicle을 상속받지 않은 클래스의 객체를 생성하려했기 때문에 에러 발생
		
		
		
	}

}

//p393
class DriverP393 {
	//drive() 메서드에는 Vehicle_p393(인터페이스) 참조하는 매개변수가 있다
	void drive(Vehicle_p393 vehicle) {
		vehicle.run();
	}
}