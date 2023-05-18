package chap0304;

// if문(p135)
/* 
if (조건) {
	//조건1 만족 실행코드
} else if (조건2) {
	//조건2 만족 실행코드
} else if (조건n) {
	//조건n 만족 실행코드
} else {
	//위 모든 조건만족x 실행코드
}
*/
public class IfEx01_135 {

	public static void main(String[] args) {
		String s = ""; //학점을 저장하기위한 변수 //공백이랑 다름 
		int score = 10;
		
		/* A학점: 100점 이하 and 90점 이상 //점수가 100이하이면서 점수가 90이상 
		 * B학점: 90점 미만 && 80점 이상 
		 * C학점: 80점 미만 & 70점 이상 
		 * D학점: 70점 미만 && 60점 이상
		 * F학점: 그 외 */
		if (score <= 100 && score >= 90 ) {
			s = "A";
		} else if (score < 90 && score >= 80) {
			s = "B";
		} else if (score < 80 && score >= 70) {
			s = "C";
		} else if (score< 70 && score >= 60) {
			s = "D";
		} else {
			s = "F";
		}
		
		System.out.println("------------------------------");
		System.out.println();
		
		/* A학점: 90점 이상 
		 * B학점: 90점 미만 ~ 80점 이상 
		 * C학점: 80점 미만 ~ 70점 이상 
		 * D학점: 70점 미만 ~ 60점 이상
		 * F학점: 그 외 */
		
		if (score >= 90) {
			s = "A";
		} else if (score >= 80) {
			s = "B";
		} else if (score >= 70) {
			s = "C";
		} else if (score >= 60) {
			s = "D";
		} else {
			s = "F";
		}
		
		System.out.println(s + "학점");
		
		System.out.println("------------------------------");
		System.out.println(); //줄바꿈
		
		//점수가 70점이상이라면 통과출력
		if (score >= 70) {
			System.out.println("통과");
		} else {
			System.out.println("불통");
		} 

	}

}
