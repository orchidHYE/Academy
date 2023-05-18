package chap0607;

//Polymorphism (다형성) : 매개변수의 다형성
	
class Vehicle {
	public void run () {
		System.out.println("Vehicle.run()메소드 호출 ");
	}
}	

class Bus extends Vehicle {
	@Override
	public void run () {
		System.out.println("Bus.run()메소드 호출 ");
	}
}

class Taxi extends Vehicle {
	@Override
	public void run () {
		System.out.println("Taxi.run()메소드 호출 ");
	}
}

public class Polymorphism_p347 {
	public static void main(String[] args) {
		Driver driver = new Driver();
		driver.drive(new Vehicle()); // Vehicle은 기본생성자이기 때문에 파라미터가 안들어간 것, 파라미터가 존재하는 생성자는 그 값을 넣어줘야 한다.
		
		
		Bus bus = new Bus(); //Driver클래스에서 -> Vehicle 클래스 사용 -> 택시랑 버스 Vehicle 상속 받음  
		//bus.set메서드(값); => 기본생성자이지만 값을 넣어줘야하는 경우도 있음
		driver.drive(bus); //호출 가능해짐 
		
		Taxi taxi = new Taxi();
		driver.drive(taxi);
		//driver.drive(new Car05); => Vehicle을 상속받지 않은 클래스의 객체를 생성하려했기 때문에 에러 발생
		
		
		
	}

}

//p346
class Driver {
	void drive(Vehicle vehicle) {
		vehicle.run();
	}
}