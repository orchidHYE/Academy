package chap0607;

/* static(273~) : 정적멤버 (정적필드, 정적메서드)
 * 클래스로더가 클래스 (바이트코드)를 로딩해서 메서드 메모리 영역에 적재할 때 클레스 별로 관리
 * ->클래스 로딩이 끝나면 바로 사용할 수 있다.
 * ->클래스명.필드명	클래스명.메서드명() 
 * ->공용데이터라면 정적 필드로 선언하기도...
 * ->문법 : [접근제어자] static 타입 필드명 [=초기화]
 * ->문법 : [접근제어자] static 리턴타입 메서드명 (매개변수리스트)[=초기화]
 * 	      예) public static void main(String[] args) {}
 * 인스턴스 멤버 -> 객체마다...
 * ->참조변수.필드명	참조변수명..메서드명()
 */
public class Car04_p277 {
	//필드
	//타입 필드명;
	String color;
	static int maxSpeed = 300;
	
	//생성자
	//클래스명 () {}
	
	//메소드
	//리턴타입 메소드명() {}
	static void powerOnOff () {
		System.out.println("powerOnOff()");
	}
}
