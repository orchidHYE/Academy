package chap02;

//long타입변수
public class VarEx03_p62 {

	public static void main(String[] args) {
		//int i1  = 1000000000000; //error
		//기본적으로 컴파일러는 정수리터럴을 int로 간주하는데
		//여기에서는 int의 허용범위를 초과할 경우
		//long타입임을 컴파일러에게 알려주어야 한다
		//=>리터럴형변환
		//정수리터럴값l		정수리터럴값L
		//실수리터럴값f		실수리터럴값F
		
		
		long v1 = 10; //int(4)<long(8)
		long v2 = 1000000000000l;
		long v3 = 1000000000000L;
		
		//실수  float(4)<double(8)
		//float v4 = 3.14; //error
		//Type mismatch: cannot convert from double to float
		
		float v4 = 3.14f; //리터럴형변환
		//float v4 = 3.14F; //리터럴형변환
		double v5 = 3.14;
		
	}

}
