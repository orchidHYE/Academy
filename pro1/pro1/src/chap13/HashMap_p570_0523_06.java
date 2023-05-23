package chap13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

//HashMap(p570)
/* Map 컬렉션 - key, Value로 구성된 Map.Entry객체를 저장하는 구조를 가지고 있다.
 * Entry는 Map 인터페이스 내부에 선언된 중첩 인터페이스이다.
 * Object 타입의 Key, Object 타입의 Value
 * 객체 추가 - map 참조변수.put(Object key, Object value)
 * 객체 검색 - map 참조변수.get(Object key)
 * 			Object 변수 = map 참조변수.get(Object key)
 */
public class HashMap_p570_0523_06 {

	public static void main(String[] args) {
		//Map 인터페이스 타입 변수선언 및 구현 클래스 객체 생성
		Map map = new HashMap();
		
		//객체 추가 - map 참조변수.put(Object key, Object value)
		map.put("회원번호", 1);
		//map.put("회원번호", 11); //식별을 위한 key는 unique하게 
		map.put("키", 173.1);
		map.put("약관동의", true);
		map.put("email 수신여부", true); // 값 중복 허용 (키는 중복 X)
		map.put("회원등급", 'A');
		map.put("회원명", "홍길동");
		
		//객체를 하나씩 처리
		System.out.println("== 객체를 하나씩 처리 ==");
		Set<Map.Entry<String, Object>> entrySet = map.entrySet();
		
		Iterator<Map.Entry<String, Object>> entryIter = entrySet.iterator();
		while (entryIter.hasNext()) {
			Map.Entry<String, Object> entry = entryIter.next();
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key + " : " + map.get(key));
			
		}
		
		System.out.println();
		
		//Key size 출력하기 
		System.out.println("== size 가져오기 ==");
		System.out.println("key size() = " + map.size());
		
		System.out.println();
		
		//Key 가져오기 -> 가져온 Key를 이용하여 객체 검색
		//"회원번호", "키", "약관동의", "email 수신여부", "회원등급", "회원명"
		System.out.println("== KeySet 이용하여 가져오기 ==");
		Set<String> keys = map.keySet();
		
		Iterator<String> iter = keys.iterator();
		
		System.out.println("key : Value");
		while (iter.hasNext()) {
			String key = iter.next();
			System.out.println(key + " : " + map.get(key));
		}

		//객체 검색 - map 참조변수.get(Object key)
		int memberNo = (Integer)map.get("회원번호");
		double  height = (Double)map.get("키");
		boolean agreeYN = (Boolean)map.get("약관동의");
		boolean emailYN = (Boolean)map.get("email 수신여부");
		char grade = (Character)map.get("회원등급");
		String memberName = (String)map.get("회원명");
		
		
	}

}
