package chap0304;

/* if (조건) {
  	//조건충족시 실행코드
   } 
 */

/*while(조건) {
	//반복실행코드
*/

 
public class ForEx05_whileEx01 {

	public static void main(String[] args) {
		// 출력결과는 ?
		int k=1;
		while(k<6) {
			++k;
			System.out.println(k);
		}
		
		
		// 1 2 3 4 5
		int n=1;
		while (n<6) { //
			System.out.println(n);
			n++;
		}
		
		
		
		
		
		// 1 2 3 4 5
		int i=1;
		for (;i<6;){
			System.out.println(i);
			i++;  
		}//반복문에 대한 조건 명시가 없으면 true라고 인식하여 무한 반복문이 됨. (초기값, 증감식은 다른 위치에 있어도 출력됨)
		
	}

}
