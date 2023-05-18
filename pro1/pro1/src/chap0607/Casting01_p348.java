package chap0607;

/* Casting(p348) : 강제타입변환. 부모타입을 자식타입으로 변환
 * 자손클래스 참조변수 = (자손타입)부모타입();
 */

class GrandMother01 {
	int age = 80;
	void ski() {
		System.out.println("할머니의 ski()");
	}
	void drive() {
		System.out.println("할머니의 차 drive()");
	}
}

class Mother01 extends GrandMother01 {
	int age = 50;
	void cook () {
		System.out.println("엄마의 cook()");
	}
	@Override
	void drive() {
		System.out.println("엄마의 배 drive()");
	}
}

class Daughter01 extends Mother01 {
	int age = 20;
	void study () {
		System.out.println("딸의 study()");
	}
	@Override
	void drive() {
		System.out.println("딸의 비행기 drive()");
	}
}

public class Casting01_p348 {

	public static void main(String[] args) {
		//부모타입 참조변수 = 자손타입;
		//엄마타입 참조변수 = 딸타입객체;
		Mother01 m1 = new Daughter01(); //자동타입변환 //m1 = 딸 클래스의 객체 = 딸 클래스의 인스턴스 //클래스는 마더인데 딸 클래스의객체 즉 딸의 인스턴스가 들어가있음 즉 마더의 탈을 쓴 딸인가? //
		
		System.out.println("m1.age = " + m1.age); //50
		//p335 : 자동 타입 변환된 이후에는 부모 클래스에서 선언된 필드와 메소드만 접근 가능
		
		m1.cook(); //엄마의 cook()
		m1.drive(); //딸의 비행기 drive() //오버라이딩된 메소드는 출발을 엄마에서부터 했지만 딸의 객체까지간다 //즉 마지막으로 오버라이딩된 메소드로 출력됨
		m1.ski(); //할머니의 ski() //할머니의 클래스를 상속받았기 때문에 오버라이딩 안된 메소드를 그대로 가지고 있는 것? //딸도 스키를 갖고 있음  //스키 메소드는 오버라이딩되지 않았기때문에 할머니의 스키가 출력된 것.
		
		System.out.println("=====");
		
		
		//Exception in thread "main" java.lang.ClassCastException
		
		//강제타입변환은 자식타입 -> 부모타입으로 변환되어있는 상태에서만 가능하다.
		// => 처음부터 부모타입으로 생성된 객체는 자식타입으로 변환할 수 없다
		//강제로 타입을 변환하면 classCastingException 발생
		//따라서 그 전에 확인이 필요하다
		//Daughter01 d3 = (Daughter01) new GrandMother01();
		//Exception in thread "main" java.lang.ClassCastException: chap0607.GrandMother01 cannot be cast to chap0607.Daughter01
		
		//객체타입확인 (p350) : 참조변수 instanceof 클래스
		//자손클래스 참조변수 = (자손타입) 부모타입 ;
		
		if ( m1 instanceof Daughter01 ) {
			//m1참조변수는 Daughter01클래스의 instance라면
			Daughter01 d2 = (Daughter01) m1; //자식 클래스 -> 부모 클래스 -> 자식 클래스
			System.out.println("d2.age = " + d2.age); //20
			d2.cook(); //엄마의 쿡
			d2.drive(); //딸의 드라이브
			d2.ski(); //할머니의 스키
			d2.study(); //딸의 스터디
		}

		if ( m1 instanceof Daughter01 ) {
			System.out.println("참조변수m1은 할머니01의 인스턴스구나");
			GrandMother01 gm3 = (GrandMother01)m1;
			System.out.println(gm3.age); //80
		} else {
			System.out.println("참조변수m1은 할머니01의 인스턴스가 아니구나");
		}
		
	}

}
