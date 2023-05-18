package chap0607;

//이 클래스는 Car01의 실행 클래스이다.
/* 클래스타입 참조변수 = null;
 * 변수명 = new 클래스명(); 
 
 * 클래스타입 참조변수명 = new 클래스명();
 */
public class Car01_Main {

	public static void main(String[] args) {
		Car01 car1 = null; //참조 변수 선언 //
		System.out.println(car1); //null
		car1 =  new Car01(); //객체 (object) 생성
		System.out.println("car1" + car1); //chap06.Car01@15db9742
		
		System.out.println(car1.color); //red
		car1.color = "blue";
		System.out.println(car1.color); //blue
		car1.powerOn();
		
		System.out.println("최초 currentSpeed : " + car1.currentSpeed);
		car1.speedUp();
		System.out.println("증속 후의 currentSpeed : " + car1.currentSpeed);
		car1.speedDown();
		System.out.println("감속 후의 currentSpeed : " + car1.currentSpeed);
		
		car1.powerOff();
		
		
		System.out.println("--------------------------");
		System.out.println("");
		
		Car01 car2 = new Car01();
		System.out.println("car2" + car2);
		System.out.println(car2.fuelEff);
		car2.fuelEff = 15.5;
		System.out.println(car2.fuelEff);
		System.out.println(car2.color); //red
		
		
		
/*		String color = "red";
		System.out.println(color);
		color = "yellow";
		System.out.println(color); */
	}

}
