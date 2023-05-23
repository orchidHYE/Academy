package chap13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

//Generic 이용한 컬렉션
public class Generic_p566_0523_03 {

	public static void main(String[] args) {
		//List 인터페이스 참조하는 ArrayList 클래스 객체 생성
		List<String> list = new ArrayList<String>();
		
		//list.add(10000); //String 타입을 제외한 데이터를 add할 수 없다
		list.add("볼보");
		list.add("현대");
		list.add("아우디");
		
		for (String temp : list) {
			System.out.println(temp);
		} 
		
	/*	
		for (Object temp : list) { //class 자동형변환 : 하위클래스 -> 상위클래스
			System.out.println((String)temp); //상위 클래스 -> 하위 클래스 //강제 클래스 캐스팅
		} //()조건 중 타입을 Object로 해도 가능하다. 다형성 때문에 
		  //내부적으로 클래스 간의 자동형변환이 일어남
	*/	
		
		//Set 인터페이스 참조하는 HashSet클래스 객체 생성
		Set<String> set = new HashSet<String>();
		
		set.add("볼보1");
		set.add("현대1");
		set.add("아우디1");
		
		Iterator<String> iter = set.iterator(); 
		while (iter.hasNext()) {
			String str = iter.next();
			System.out.println(str + " :" + str.length() + "글자");
		}
	}

}
