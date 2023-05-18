package chap0607;

//p253 실습예제_매개변수의 개수를 모를 경우
public class Computer01_p253 {
	//필드 
	//타입 필드명;
	
	
	//생성자
	//클래스명 (매개변수리스트) {}
	
	//메소드
	//리턴유형 메서드명 (매개변수리스트) {}
	//add(10, 90)
	int add(int a, int b) {
		return a + b;
	}
	
	//배열 <= 값이 아닌 주소를 원하기 때문에 배열명을 넣어줘야 함
	int sum1(int[] values) {
		int sum = 0;
		for (int i = 0; i<values.length ;i++) {
			sum += values[i];
		}	
		return sum;
	}
	
	//가변 인자 배열로 선언
	//타입...매개변수 <= 리터럴값 제시
	int sum2 (int ... values) {
		int sum = 0;
		for (int i = 0; i<values.length ;i++) {
			sum += values[i];
		}
		return sum;
	}
}