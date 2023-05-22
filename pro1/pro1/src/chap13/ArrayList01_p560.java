package chap13;

import java.util.ArrayList;

//ArrayList
public class ArrayList01_p560 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		//value추가
		list.add(1); //int의  wrapper클래스인 Integer클래스로 취급
		list.add(2.1234);//타입이 달라도 된다
		list.add(1); //중복값허용
		//size확인
		int size=list.size();
		System.out.println("list.size()="+size);
		//for문이용-값출력=>입력한 순서가 유지(되어 출력)
		for(int i=0;i<size;i++) {
			System.out.println(list.get(i));
		}
		
		//특정index값지정-값출력
		list.add(3,4); //index가 3인 위치에   value4을 추가
		System.out.println(list.get(3));//4
		
		//특정index값변경 후 값출력 확인
		list.set(3,40);//index가3인 위치의 요소를  40으로 변경
		System.out.println(list.get(3));//40
		
		//특정index값삭제
		list.remove(3);
		//향상된 for문이용-값출력
		for(Object value : list) {
			//변수 instanceof 특정클래스타입객체
			if(value instanceof Integer){
				System.out.println("Integer클래스의 객체야");
				int v = (int)value;  //unboxing : 클래스->기본타입
				System.out.println("int v="+v);
			}
			if(value instanceof Long){
				System.out.println("Long클래스의 객체야");
			}
			if(value instanceof Double){
				System.out.println("Double클래스의 객체야="+value);
			}
			
				
			System.out.println("Object value="+value);
		}

		//전부삭제
		list.clear();//모든 요소를 삭제
		//size확인
		System.out.println("모든 요소 삭제후 개수="+list.size());//0
	}

}






















