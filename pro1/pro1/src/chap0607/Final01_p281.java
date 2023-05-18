package chap0607;

//final : 마지막 
/*
 final class  : 하위 클래스가 존재할 수 없다
 final field  : 선언시 값을 초기화, 초기값을 변경할 수 없다
 final method : 오버라이딩할 수 없다
 */
public class Final01_p281 {
	int a = 10;
	//a = 100; //변수가 아니고 필드이기 때문에 값 변경 불가능
	final int b = 10; //불변
	//final int b; //final 필드는 반드시 값 선언해야함
	//The blank final field b may not have been initialized
	static final int C = 100; //상수.constant
	
	void test () {
		a = 100;
		//b = 100; //final 필드이기 때문에 값 배정할 수 없음
		//The final field Final01_p281.b cannot be assigned 
	}
	
	final void test2 () {} 
}

//
class C1 extends Final01_p281 {
	@Override
	void test () {
		System.out.println("부모클래스의 test()를 오버라이딩");
	}
	
	void method1 () {}
	
	/* @Override
	void test2 () {
		System.out.println("오버라이딩 ~ ㅊ");
	}
	*/
}

final class Final02 {}
//class C2 extends Final02 {}
//The type C2 cannot subclass the final class Final02
//final로 선언클래스 Final02을 상속받을 수 없다.