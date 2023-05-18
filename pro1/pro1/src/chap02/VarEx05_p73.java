package chap02;

//자동형변환(p74) : 값의 허용 범위가 작은 타입이 허용 범위가 큰 타입으로 저장될 때 발생
//기본타입크기 : byte < char(2) short(2) < int(정수기본.4) < long(8) < float(4) < double(8)

public class VarEx05_p73 {

	public static void main(String[] args) {
		byte b1 = 10; //-128~127
		
		//정수간의 자동형변환
		short s1 = b1; //자동형변환 byte -> short
		long l1 = b1; //자동형변환 byte -> long
		
		//정수타입에서 실수타입으로 자동형변환
		double d1 = b1; //자동형변환 byte -> double
		
		System.out.println("byte b1=" + b1); //10
		System.out.println("short s1=" + s1); //10
		System.out.println("long l1=" + l1); //10
		System.out.println("double d1=" + d1); //10 -> 실수타입 10.0
	}

}
