package chap13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//p576
public class HashMapMain_p576_0524_01 {

		public static void main (String[] args) {
			//Map 인터페이스를 참조하는 HashMap 객체 생성
			Map<String,Integer> map = new HashMap<String,Integer>();
			
			map.put("홍길동", 100); // int로 넣었어도 자동 박싱되어 Integer가 됨
			map.put("이순신", 95);
			map.put("세종대왕", 90);
			map.put("세종대왕", 9); 
			
			//key 개수 -> 학생 수 출력
			int cnt = map.size();
			System.out.println("총 학생수: " + cnt);

			//value 출력 -> 모든 학생의 점수 출력
			//int score = (Integer) map.get("홍길동"); //wrapper class를 int로 강제 형변환. 언박싱 시켜줌
			//System.out.println("홍길동의 점수 : " + score);

			Set<String> keys = map.keySet();
			Iterator<String> iter = keys.iterator();
			while (iter.hasNext()) {
				String key = iter.next();
				int score = (Integer)map.get(key);
				System.out.println(key);
			}
			
			System.out.println("=========================");
			
			Map<Student_0524_02,Integer> map1 = new HashMap<Student_0524_02,Integer>();
			
			map1.put(new Student_0524_02(1, "홍길동", "경영", '여'),100);
			map1.put(new Student_0524_02(2, "이순신", "컴공", '남'),95);
			map1.put(new Student_0524_02(3, "세종대왕", "국문", '여'),90);
			map1.put(new Student_0524_02(3, "세종대왕", "국문", '남'),0);
			//동등 객체의 기준은 학번
			//따라서 학번이 3인 세종대왕(국문, 여)의 값(점수 90)은
			//	      학번이 3인 세종대왕(국문, 남)의 값(점수 0)으로 덮어 씌어짐
			//=> 결국 키가 중복되면 안된다
			
			int cnt1 = map1.size();
			System.out.println("총 학생수: " + cnt1);

			Set<Student_0524_02> keys1 = map1.keySet();
			Iterator<Student_0524_02> iter1 = keys1.iterator();
			while (iter1.hasNext()) {
				Student_0524_02 key = iter1.next();
				int score = (Integer)map1.get(key);
				System.out.println(key + "의 점수: " + score);
			}
		}
}
