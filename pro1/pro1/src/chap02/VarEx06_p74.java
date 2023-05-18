package chap02;

//강제타입변환casting (p74) : 큰 허용 범위타입을 작은 허용범위 타입으로 강제로 나누어 저장하는 것
//byte < char(2) short(2) < int(정수기본.4) < long(8) < float(4) < double(실수기본.8)
//데이터타입 변수명 = (강제형변환타입)변수명;
public class VarEx06_p74 { 

	public static void main(String[] args) {
		//double v1 = 3.14;
		float v1 = 3.14f; //리터럴형변환
		System.out.println("v1=" + v1); //

		double v2 = v1; //float실수타입변수 ->double실수타입변수 자동형변환
		System.out.println("v2=" + v2); // 3.140000104904175

		
		double v3 = 3.14;
		System.out.println("v3=" + v3); //3.14
		int v4 = (int)v3; //실수타입 -> 정수타입 강제형변환
		System.out.println("v4=" + v4); //3 -> int = 정수타입 -> 값의 손실발생 =   
		
		/*car타입(p63) : 유니코드는 세계 각국의 문자를 2byte로 표현할 수 있는 
		 * 숫자 (0~65535)로 매핑한 국제 표준 규약
		 * 자바는 유니코드를 저장할 수 있도록 char타입을 제공*/
		int v5 = 44032;
		char v6 = (char)v5;
		System.out.println("int v5=" + v5); //44032
		System.out.println("char v6=" + v6); //가 -> 유니코드
		
		//char v6가 44032로 출력되게 하시오.
		
		//int v7 = v6;
		//System.out.println("int v7=" + v7); //44032
		
		//char타입을 int정수타입으로 강제형변환
		int v7 = (int)v6;
		System.out.println((int)v6); //44032
		System.out.println("int v7=" + v7); //44032
		
	}

}
