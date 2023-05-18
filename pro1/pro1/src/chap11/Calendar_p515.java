package chap11;

import java.util.Calendar;

//Calendar클래스 (p515) : 추상클래스이므로 new 연산자를 사용 x
public class Calendar_p515 {

	public static void main(String[] args) {
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		
		
		int year = now.get(1);
		System.out.println(year);

		year = now.get(Calendar.YEAR);
		System.out.println(year);
		
		int month = now.get(Calendar.MONTH)+1; // 1월 = 0 
		System.out.println(month);
		
		int day = now.get(Calendar.DATE); //일
		int hour = now.get(Calendar.HOUR); //시
		int minute = now.get(Calendar.MINUTE); //분
		int second = now.get(Calendar.SECOND); //초
		int week = now.get(Calendar.DAY_OF_WEEK); //요일 // 월 = 1, 화 = 2
		
		System.out.printf("%d년 %d월 %d일 %d시 %d분 %d초", year, month, day, hour, minute, second);
		System.out.println();
		
		System.out.println("요일:" + week);
	}

}
