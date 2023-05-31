package hw;

public class AbstractClassMain {

	public static void main(String[] args) {
		//AbstractClass_p360 phone = new AbstractClass_p360(); //Cannot instantiate the type AbstractClass_p360
		
		AbstractClass_Smartphone smartPhone = new AbstractClass_Smartphone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}

}
