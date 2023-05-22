package chap13;

import java.util.ArrayList;
import java.util.List;

//LinkedList (p564)와 ArrayList의 실행 성능 비교
/* 순차적으로 데이터를 추가/삭제 : ArrayList가 빠름
* 비순차적으로 데이처를 추가/삭제 : LinkedList가 빠름
* 접근시간(access time) : ArrayList가 빠름 */
public class ArrayList02_0522 {

	public static void main (String[] args) {
		
		
		//ArrayList 클래스의 객체를 List인터페이스 타입변수에 할당
		//인터페이스 참조변수 = new 구현클래스명();
		List list = new ArrayList();
		long st = 0L; //시작시간을 저장하기위한 변수선언 및 초기화 
		long et = 0L; //종료시간을 저장하기위한 변수선언 및 초기화 
		//시작시간
		st = System.nanoTime(); //시작시간 구하기
		
		for (int i = 1; i<90000; i++) {
			list.add(0,"BMW" + i);
		}
		
//		list.add("TESLA");
//		list.add("AUDI");
//		list.add("HYUNDAI");
//		list.add("KIA");
		
		for (Object car : list) {
			System.out.println(car);
		}
		
		//끝시간
		et = System.nanoTime(); // 종료시간 구하기
		
		//끝시작시간 - 끝시간 = 소요시간
		long runtime = et - st;
		System.out.println("ArrayList소요시간 = " + runtime);
	}
}
