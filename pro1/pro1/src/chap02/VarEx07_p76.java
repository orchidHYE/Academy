package chap02;

//이항연산자
/* (p76) 정수 연산에서의 자동타입변환
  정수타입간의 산술연산식(+, -, *, /, %)에서 사용이되면 
 int보다 작은 byte, char, short타입의 변수는 
 int타입으로 자동타입변환된 후 연산을 수행한다 */

//byte < char(2) short(2) < int(정수기본.4) < long(8) < float(4) < double(실수기본.8)
//정수(byte, char, short, int) +, -, *, /, % 정수(byte, char, short, int)
public class VarEx07_p76 {

	public static void main(String[] args) {
		int r1 = 10 + 20;
		System.out.println("int r1 ="+ r1); //30
		
		byte a = 10;
		byte b = 20;
		//byte r2 = a+b; //에러발생.int + int
		//Type mismatch: cannot convert from int to byte
		int r2 = a + b;
		System.out.println("int r2=" + r2); //30
		long r3 = a + b;
		System.out.println("long r3=" + r3); //30
		float r4 = a + b;
		System.out.println("float r4=" + r4); //30.0
		double r5 = a + b;
		System.out.println("double r5=" + r5); //30.0
		
		//----------------------------------------------
		
		int c = 100;
		long d = 2;
		//int r6 = c / d;
		//Type mismatch: cannot convert from long to int
		long r6 = c / d; // int / long  100/2
		System.out.println("long r6=" + r6); //50
		
		//long타입의 변수 r6의 값을 int타입 변수에 할당하시오.
		int r16 = (int)r6; //long타입을 int로 강제형변환
		int r26 = (int)(c/d); 
		//int/long의 결과는 long타입
		//()에 의해 /연산을 수행하고 결과 int로 강제형변환
		int r36 = c/(int)d;
		//d를 int로 강제형변환
		//int c / int d => int끼리의 /연산 => 결과 int
		
		System.out.println("int r16=" + r16);
		
		float r7 = c / d; // int/long의 결과는 long인데 float타입변수에 할당하면서 실수화
		System.out.println("float r7=" + r7); //50.0
		
		double r8 = c / d; // int/long의 결과는 long인데 double타입변수에 할당하면서 실수화
		System.out.println("double r8=" + r8); //50.0
 
	}
}
