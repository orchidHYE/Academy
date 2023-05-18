package chap02;

import java.io.IOException;

//반복문을 사용하여 키보드에서 입력된 내용을 변수에 저장하기(p92) : System.in.read()
/*반복문
 * while(조건){
 	//반복실행코드
 }
 
 *조건문
 if(조건) {
 	//조건 충족시 실행코드
 }
 */
public class readEx_02 {

	public static void main(String[] args) throws IOException {
		int keyCode;
		
		//while( 1<10 ) { //조건을 충족시 반복실행
		while( true ) { //=>무한반복
			//반복실행코드
			keyCode = System.in.read();
			System.out.println(keyCode);
			
			if(keyCode == 113) { //소문자 q 입력시 반복문 종료
			 	//조건 충족시 실행코드
				break; //반복문 종료
				
			 }
		}
		System.out.println("종료");
	}
	
}
