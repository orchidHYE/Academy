package chap0607;

public class Car04_Main {
	public static void main (String[] arga) {
		Car04_p277 car = new Car04_p277();
		car.color = "red";
		System.out.println(car.color);
		System.out.println(Car04_p277.maxSpeed);
		car.powerOnOff();
		System.out.println(Car04_p277.maxSpeed);
		Car04_p277.powerOnOff(); //static이 사용된 메소는 참조변수, 클래스명을 통해 선언 가능
		
		System.out.println("------------");
		
		Car04_p277 car2 = new Car04_p277();
		car2.color = "black";
		System.out.println(car2.color);
		System.out.println(Car04_p277.maxSpeed);
		car2.powerOnOff();
	}
}
