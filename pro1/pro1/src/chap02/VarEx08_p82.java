package chap02;

/* 데이터타입
 * - 참조타입(reference type) : 주소저장 => 배열(Array), Class의 객체(object)
 * - 기본타임(primitive type) : 값저장
 * - 정수 : byte < short(2) < int(정수기본.4) < long(8)
 * - 실수 : float(4) < double(실수기본.8)
 * - 문자 : char(2) 
 * - 논리형() : true, false
 * - 형변환
 * - 자동형변환 : 자동으로 타입이 변환되는 것 // 작은 데이터 타입 -> 큰 데이터 타입
 * - 강제형변환 : 강제로 타입을 변환하는 것 // 큰 데이터 타입 -> 작은 데이터 타입 => 타입변환법 : (강제형변환타입)변수;
 * - 리터럴형변환 : 값F 값f / 값L 값l
*/

// +연산에서의 문자열 자동타입변환(p82)
public class VarEx08_p82 {

	public static void main(String[] args) {
		int r1 = 10*10;
		System.out.println("int r1=" + r1); // int int -> int , r1 = 문자열 , 숫자로보여져도 내부적으론 문자열로 저장 , 문자열 + 숫자 = 문자열화?
		
		//int r2 = 10+10+"99"; //error //int + int + 문자열  => 문자열화 : 문자열 + 문자열 + 문자열
		//Type mismatch: cannot convert from String to int ->스트링화
		String r2 = 10 + 10 + "99"; // 10 + 10 + "99" ->99는 숫자가 아닌 문자열이기 때문에 계산X
 		System.out.println("int r2=" + r2); //2099
 		
 		r2 = 10 + "99" + 10;
 		System.out.println(r2); // 109910 // 문자 + 숫자 혼합 = 왼쪽부터 계산 // 10+"99" "10"+"99" "1099"
 		//"1099"+10 "1099"+"10" "109910"
 		
 		r2 = "99" + 10 + 10;
 		System.out.println(r2); // 9920 -> 991010
 		
 		r2 = "99" + (10+10);
 		System.out.println(r2); //9920 
 		
 		//---------------------------------------------------
 		//문자열을 기본타입(byte,short,int,long,float,double)으로 강제변환
 		//래퍼클래스(wrapper class) : 기본타입을 클래스
 		int price =  9900; //가격
 		int cnt = 5; //수량
 		System.out.println("총구매가격=" + (price*cnt)); //49500
 		
 		String strcnt = "5";
 		byte b =Byte.parseByte(strcnt);//String -> byte로 형변환
 		System.out.println("총구매구격=" + (price*b)); //49500
 		
 		short s = Short.parseShort(strcnt); //String -> short 
 		System.out.println("총구매구격=" + (price*s)); //49500
 		
 		int c = Integer.parseInt(strcnt);//String -> int로 형변환
 		System.out.println("총구매구격=" + (price*c)); //49500
 		
 		long l = Long.parseLong(strcnt); 
 		System.out.println("총구매구격=" + (price*l)); //49500
 		
 		float f = Float.parseFloat(strcnt);
 		System.out.println("총구매구격=" + (price*f)); //49500.0
 		
 		double d = Double.parseDouble(strcnt);
 		System.out.println("총구매구격=" + (price*d)); //49500.0
 		
 		
 		//------------------------------------------------------------
 		
 		//p84 p.498 참고
 		//String.valueOf(기본타입값) : 기본타입의 값을 String으로 강제형변환
 		
 		String s1 = String.valueOf(10);
 		//System.out.println(s1*99);
 		//The operator * is undefined for the argument type(s) String, int
 		
 		String s2 = String.valueOf(10.123);
 		System.out.println(s2); // 문자열
 		
 		String s3 = String.valueOf(true);
 		System.out.println(s3); //boolean X, 문자열
 		
	}
}

