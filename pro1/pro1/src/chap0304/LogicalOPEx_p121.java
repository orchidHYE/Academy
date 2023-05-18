package chap0304;

//논리연산자(p122)
/*
 * or : 모든 조건이 f이면 f => 단 1개의 조건이라도 참이면 T
		T F
		T F
 */
public class LogicalOPEx_p121 {

	public static void main(String[] args) {
		//if문에서 실행되는 문장이 1줄이면 {} 생략가능
		if (true && true) {
			System.out.println("&&연산자 - 둘 다  true");
		}
		
		if (true & true) {
			System.out.println("&&연산자 - 둘 다  true");
		}
		
		if (false && true) {
			System.out.println("&&연산자 - 둘 다 true");
		} else {
			System.out.println("else문");
		}
		
		if (false & true) {
			System.out.println("&&연산자 - 거짓");
		} else {
			System.out.println("else문");
		}
		
	}

}
