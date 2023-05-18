package chap0607;

public class Static_p277 {
	//필드
	String f1 = "인스턴스 필드"; //인스턴스필드, 전역변수
	static String f2 = "정적필드"; //정적필드(static필드), 전역변수
	
	
	void m1() {
		this.f1 ="m1()메서드에서 접근";
		this.f2 ="m1()메서드에서 접근";
		f2 = "m1()메서드에서 접근";
		m2(); //객체 생성 할 때부터 존재하기 때문에 호출 가능
	}
	
	static void m2 () {
		System.out.println("static m2() 진입");
		//this.f2 = "m2()메서드에서 접근"; //error 
		//Cannot use this in a static context
		f2 ="m2()메서드에서 접근";
		//m1(); //error
		//Cannot make a static reference to the non-static method m1() from the type Static_p277
		//f1 = "m2()메서드에 접근";
		//Cannot make a static reference to the non-static field f1
	}
	
	public static void main(String[] args) {
		//f1 = "메인메서드에서 값 설정";//f1필드 접근 가능? X => 정적 메소드에서 인스턴스 멤버 접근 불가능 //정적 main() 메소드이기 때문에 객체 생성 후 참조변수로 접근해야 함.
		f2 = "메인메서드에서 값 설정";//f2필드 접근 가능? O
		//m1();//m1() 호출? X
		m2();//m2() 호출? O 
		
		//인스턴스 필드와 메서드느 객체참조변수의 주소를 통해 접근가능
		Static_p277 refVa1 = new Static_p277();
		refVa1.f1 = "메인메서드에서 값 설정";
		refVa1.m1();
		
		System.out.println("~~");
	}
}









