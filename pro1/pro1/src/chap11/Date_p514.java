package chap11;

import java.text.SimpleDateFormat;
//java.util패키지 안의 Date클래스를 import
import java.util.Date;

//Date클래스(p514) : 객체 간의 날짜 정보를 주고받을 때 매개변수, 리턴타입으로 주로 사용된다.
public class Date_p514 {

	public static void main(String[] args) {
		//현재 날짜, 시간정보를 갖는 Date 클래스 객체생성
		Date today = new Date();
		System.out.println(today);
		System.out.println(today.toString());
		
		SimpleDateFormat sdf = 
		new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초 E요일");
		String strToday = sdf.format(today);
		System.out.println(strToday);
	}

}
