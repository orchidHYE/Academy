package chap0304;

// for문 - 합계구하기
public class ForEx02_p151 {

	public static void main(String[] args) {
		//1부터 5까지의 정수 합을 출력하시오.
		int sum = 0; //총합을 저장하기위한 변수 선언
		for (int i=1;i<6;i++) {
			sum = sum + i;
			/* 0+1
			 * 0+1의 결과를 sum에 저장 sum=1
			 * 1+2
			 * 1+2의 결과를 sum에 저장 sum=3
			 * 3+3
			 * 3+3의 결과를 sum에 저장 sum=6 ...
			 */
		}
		System.out.println("총합 = " + sum);
 	}

}
