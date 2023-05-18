package chap02;

/*기본타입(primitive type)
* 정수 : byte<short<int(기본)<long
* 실수 : float<double(기본)
* 논리 : true, false
* 정수<실수 
*
**/
public class VarEx02_p61 {

	public static void main(String[] args) {
		//byte(1) : -128~127값의 범위
		byte b1 = -128;
		byte b2 = 0;
		byte b3 = 127;
		//byte b4 = 128;//에러 error
		//Type mismatch: cannot convert from int to byte
		
		
		
		
		//변수선언 데이터타입 변수명;
		int number;
		
		//초기값할당 변수명 = 초기값;
		number = 105;
		
		System.out.println(number);
	}

}
