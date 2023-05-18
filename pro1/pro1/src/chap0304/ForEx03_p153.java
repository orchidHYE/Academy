package chap0304;

//for문 - 구구단 출력
/*출력결과
 5 * 1 = 5
 ...
 5 * 9 = 45
 */
public class ForEx03_p153 {

	public static void main(String[] args) {
		int dan=2;
		for (dan=2 ;dan<10; dan++) {
			System.out.println("***" + dan + "단***");
		
			for(int i=1; i<10; i++) {
				System.out.println(dan + "x" + i + "=" + dan*i);
		} 
		
		}	
			
	}

}
