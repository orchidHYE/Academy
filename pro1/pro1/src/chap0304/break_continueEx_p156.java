package chap0304;

//break; break가 속한 반복문을 종료
//continue; 반복문을 멈춤
public class break_continueEx_p156 {

	public static void main(String[] args) {
		int j = 1;
		while (j<11) {
			j++;
			System.out.println(j);
				if(j==5) {
					System.out.println("j는 5입니다");
					continue; //반복문 멈춤 //if
				}
			 // j==5라는 조건 때문에 코드 실행 X
		}
		System.out.println("while문-밖");
		System.out.println();
		int i = 1;
		while (i<11) {
			System.out.println(i);
				if(i==5) {
					System.out.println("i는 5입니다");
					// break; //반복문을 종료 while문에 속해있기 때문에 while문 자체를 종료시킴 / if문에 걸면 
				}
			i++;
		}
		System.out.println("while문-밖");
	}

}
