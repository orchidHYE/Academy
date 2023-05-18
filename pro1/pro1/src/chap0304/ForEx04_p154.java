package chap0304;

//for문 - 구구단 출력
//출력결과 2~9단
public class ForEx04_p154 {

	public static void main(String[] args) {
		
		int dan=3;
			System.out.println("***" + dan + "단 ***");
		for(int i=1; i<10; i++) {
			System.out.println(dan + "x" + i + "=" + (dan*i));
		}
	}

}
