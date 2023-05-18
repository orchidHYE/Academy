package chap02;

//모니터로 변수값 출력하기(p90)
/* printf("형식문자열", 값1, 값2,... or 변수명)
 * 정수 %d
 * 실수 %f
 * 문자열%s
 * \n \t %%
 */
public class printf_p90 {

	public static void main(String[] args) {
		int v = 123;
		System.out.printf("정수%d\n", v); //정수123
		System.out.printf("주소:%d번지\n", v); //주소:123번지
		System.out.printf("가격:%-5d원\n", v); //가격:123원
		System.out.printf("가격:%05d원\n", v); //가격:123원
		
		System.out.println(); //빈줄
		//원의 넓이= 반지름 * 반지름 * 3.14
		int r = 10;
		double area = r * r * 3.14;
		System.out.printf("반지름:%d\n",r);
		System.out.printf("원의 넓이=%f\n",area); //원의 넓이=314.000000
		System.out.printf("원의 넓이=%10.2f\n",area); //원의 넓이=    314.00
		System.out.printf("원의 넓이=%6.2f\n",area); //원의 넓이=314.00
		
		System.out.println(); //빈줄
		//반지름 10인 원의 넓이는 
		String str = "원의 넓이";
		System.out.printf("반지름 %d인 원의 넓이는 %6.2f\n", r, area); //반지름 10인 원의 넓이는 314.00
		System.out.printf("반지름 %d인 %s는 %6.2f\n", r, str,area); //반지름 10인 원의 넓이는 314.00
		
	}

}
