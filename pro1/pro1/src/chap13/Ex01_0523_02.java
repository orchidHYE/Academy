package chap13;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Ex01_0523_02 {
	public static void main (String[] args) {
		//List 인터페이스 참조하는 ArrayList 클래스 객체 생성
		List list = new ArrayList();
		
		list.add(1); //Integer //형변환이 돼서 int 취급이 아닌 클래스로 취급된다
		list.add(10L); //Long
		list.add(3.1); //Double
		list.add(true); //Boolean
		list.add('1'); //Character
		list.add("문자열"); //String
		
		for (Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		//Set 인터페이스 참조하는 HashSet클래스 객 체 생성
		Set set = new HashSet();
		
		set.add(1); //Integer //형변환이 돼서 int 취급이 아닌 클래스로 취급된다
		set.add(10L); //Long
		set.add(3.1); //Double
		set.add(true); //Boolean
		set.add('1'); //Character
		set.add("문자열"); //String
		
		//String 클래스의 length() 이용해서 문자열의 길이
		Iterator iter = set.iterator();
		while (iter.hasNext()) {
			Object obj = iter.next();
			if (obj instanceof String) {
				String str = (String) obj;
				System.out.println("글자 길이  = " + str.length());
			}
			
			System.out.println(obj);
		
		}
	}
}
