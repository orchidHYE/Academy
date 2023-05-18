package chap0607;

//이 클래스는 P228 클래스의 실행클래스이다.
public class P228_Main {

	public static void main(String[] args) {
		//P228 클래스의 객체를 생성한다
		//타입 주소저장변수명 = new 클래스명();
		// -> 다형성, 상속 전까지 위 문법  -> 클래스명 주소저장변수명 = new 클래스명(); 가능
		
		//그 객체의 필드값을 출력하시오
		//System.out.println(참조변수명.필드명);
		
		P228 p228 = null;
		p228 = new P228();
		System.out.println(p228.bool);
		System.out.println(p228.color);
		System.out.println(p228.c + " :공백");
		System.out.println(p228.price);
		System.out.println(p228.d);
		System.out.println(p228.f);
		System.out.println(p228.l);
		System.out.println(p228.b);
		System.out.println(p228.s);
		
		p228.color = "빨강";
		System.out.println(p228.color);
		
		System.out.println("--------------------");
		
		//Car01 클래스를 참조하느 변수선언 및 객체생성
		//Car01 클래스의 생상, 연비필드값을 출력하시오
		
		Car01 car = new Car01();
		System.out.println(car.color);
		System.out.println(car.fuelEff);
		
		
		
	}

}
