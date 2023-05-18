package chap0304;

// % 나머지
// / 몫 
//홀짝수
//if문			if(조건) {조건참일경우}else{조건 경우}
//삼항연산자 (p125)조건? 조건참일경우 : 조건x경우
public class IfEx02_p125 {

	public static void main(String[] args) {
		//0.0이상이면서 1.0미만의 double 타입 실수난수
		//주사위 1이상 6이하
		//(int)(Math.random()*최대값) + 최소값
		//(int)(Math.random()*6)  + 1		=> 주사위 1이상 6
		//(int)(Math.random()*45) + 1		=>
		/* for
		int n = (int) Math.random();
		System.out.println(n%2);
		System.out.println(n/2);? */
		 
		int n =(int)(Math.random()*100);
		System.out.println(n%2);
		System.out.println(n/2);
		String r1 = "";
		//연산자 우선순위 : 단항(높) -> 이항 -> 삼항 -> 대입
		//산술연산자(높) -> 비교연산
		if ((n%2) == 0) { //수를 2로 나눈 나머지가 0일 겨우 짝수 출력
			 r1 = "짝수";
		} else {
			 r1 = "홀수";
		}
		System.out.println(n + " is " + r1);
		 
		System.out.println("---------------------------");
		System.out.println();
		 
		//삼항연산자 (p125)조건? 조건참일경우 : 조건x경우
		String result = (n%2 == 0)?"짝수":"홀수";
		System.out.println(result);
		 
	}

}
