package chap13;

import java.util.Vector;

//컬렉션프레임워크(p556)
/*자료구조를 사용해서 객체들을 효율적으로 추가,삭제,검색할 수 있도록 
    인터페이스와 구현클래스를 java.util패키지에서 제공하는 것을 총칭한다.
    framework(프레임워크)-사용방법을 정해놓은 라이브러리를 말한다 
 */
public class ArrayVector_p556 {

	public static void main(String[] args) {
		//인터페이스 참조변수=new 구현클래스();
		//List list = new Vector();
		Vector vector = new Vector(); //Vector객체를 생성
		vector.add(10);//int의  wrapper클래스인 Integer클래스로 취급
		vector.add(20);
		vector.add(30);
		vector.add(40);
		vector.add(50);
		System.out.println("vector.size()="+vector.size());//5
		//for문이용해서 value꺼내기
		for(int i=0;i<vector.size();i++) {
			System.out.println(vector.get(i));
		}
		vector.add(5,60); //index가 5인 위치에   value60을 추가
		System.out.println(vector.get(5));//60
		vector.set(5,600);//index가 5인 위치의 요소를  600으로 변경
		System.out.println(vector.get(5));//600
		System.out.println("600포함?="+vector.contains(600));//true
		System.out.println("index가 5인 삭제element가 뭐니?="+vector.remove(5));
		vector.clear();//모든 요소를 삭제
		System.out.println("clear()후의 개수="+vector.size());//0
		
		
		System.out.println("-------------------");
		System.out.println();		
		
		int[] arr1 = new int[]{10,20,30,40,50};
		//for문이용해서 value꺼내기
		for(int i=0;i<arr1.length;i++) {
			System.out.println(i+"번째 value="+arr1[i]);
		}
		System.out.println();
		//arr1[5] = 60;//runtime에러발생
		//ArrayIndexOutOfBoundsException: 5		
		
		//향상된 for문이용해서 value꺼내기
		//for(타입 변수:배열명or컬렉션 ) {}
		for(int value:arr1) {
			System.out.println(value);
		}
	}

}









