package chap0304;

/* while (조건) {
   		//반복실행코드
   } 
 */
public class whileEx02_p155 {

	public static void main(String[] args) {
		//do while문
		//1 2 3 4 5 
		int k=1;
		do {
			System.out.println(k); k++;
		}while(k<6);
		
		
		//1부터 5까지의 합을 출력하시오.
		//sum=0+1+2+3+4+5;
		int sum = 0; //합을 저장하기 위한 변수 선언 및 초기화
		int i = 1; //계산의 대상이 되어지는 변수선언 및 초기화
		while (i<6) {
			sum += 1;
			i++;
		}
	}
	
}
