package chap02;

import java.util.Scanner;

//키보드에서 입력된 내용을 문자열로 얻기 : Scanner 클래스를 이용
public class ScannerEx01_p96 {

	public static void main(String[] args) {
		//클래스의 객체를 생성하여 참조변수에 할당
		//클래스타입 참조변수 = new 클래스명();
		//java.util.Scanner sc = new java.util.Scanner(); ->import 없이도 쓸 수 있음
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
			String inputData = sc.nextLine();	
			System.out.println("입력받은 문자열:" + inputData);
			
			if (inputData.equals("q")) { //입력받은 문자열이 q와 동일하다면
			 	//조건 충족시 실행코드
				System.out.println("if문-안");
				break; //반복문 종료
			}
			
		} 
		System.out.println("while문-밖");
	}

}
