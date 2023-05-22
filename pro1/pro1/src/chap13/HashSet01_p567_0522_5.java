package chap13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Interface Collection : List, Set 인터페이스의 상위 인터페이스
//List 인터페이스 (p557) : 객체의 순서를 유지하고, 인덱스가 부여된다 ex) 대기자 리스트의 순서유지 -> 중복 허용 
//Set 인터페이스 (p565) : 저장순서가 유지되지 않고, 중복저장의 허용이 불가하며 하나의 null값만 존재할 수 있다.
//HashSet - set 인터페이스의 구현 클래스
public class HashSet01_p567_0522_5 {

	public static void main (String[] args) {
		//부모클래스타입 참조변수 = new 자식클래스명();
		//클래스타입 참조변수 = new 클래스명();
		
		//HashSet 클래스의 객체를 Set인터페이스 타입변수에 할당
		//인터페이스 참조변수 = new 구현클래스명();
		Set set = new HashSet();
		
		set.add("BMW");
		set.add("TESLA");
		set.add("AUDI");
		set.add("HYUNDAI");
		set.add(new String("좋은 브랜드 차"));
		set.add("KIA");
		set.add("KIA"); //중복허용 X //중복값은 저장자체도 안됨
		
		//for each 사용하여 출력
		System.out.println("== for each 사용하여 출력 ==");
		for (Object element : set) {
			System.out.println(element); //순서유지 X
		}
		
		//size 출력
		System.out.println(set.size());

		//특정 객체 포함여부 확인
		if (set.contains("KIA")) {
			System.out.println("KIA 포함되어있으니 삭제");
			//특정 객체 삭제
			set.remove("KIA");
		} else {
			System.out.println("KIA 미포함");
		}
		System.out.println(set.size());
		System.out.println();

		//while 전체출력 //while문은 정확한 예측이 불가능할 때 사용
		System.out.println("== Iterator 사용하여 출력 ==");
		Iterator iter = set.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next()); //순서유지X
		}
		
	}
	
}
