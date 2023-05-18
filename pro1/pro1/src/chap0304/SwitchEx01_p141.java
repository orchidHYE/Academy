package chap0304;

import java.util.Random;

/* 조건문 - switch
   switch(조건) {
   case 값1: 실행코드; [break;]
   case 값2: 실행코드; [break;]
   case 값N: 실행코드; [break;]
   default: 실행코드;
   }
 */
public class SwitchEx01_p141 {

	public static void main(String[] args) {
		String id = "kimid";
		switch(id) {
		   case "hongid": 
		   case "kimid": 
		   case "choiid": System.out.println("회원입니다"); break;
		default: System.out.println("비회원입니다");
		   }
		
		
		switch(id) {
		   case "hongid": System.out.println("회원입니다"); break;
		   case "kimid": System.out.println("회원입니다"); break;
		   case "choiid": System.out.println("회원입니다"); break;
		default: System.out.println("비회원입니다");
		   }
		
		//--------------
		
		Random random = new Random();
		int score = random.nextInt(4); //0이상 4미만의 정수
		System.out.println("score=" + score);
		switch(score) {
		   case 1: System.out.println("1이다"); break;
		   case 2: System.out.println("2이다"); break;
		   case 3: System.out.println("3이다"); break;
		   case 4: System.out.println("4이다"); break;
		default: System.out.println("그 외");
		   }
	}

}
