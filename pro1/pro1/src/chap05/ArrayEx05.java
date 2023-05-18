package chap05;

import java.util.Arrays;

/* Arrays 클래스 :
   java.util.Arrays
      배열을 다루는데 유용한 여러 메서드를 제공.
   Arrays 클래스의 모든 메서드는 static 메서드이다.
   => (객체 생성하지 않고) 클래스명.메서드명
   => 예) Arrays.toString()
*/
public class ArrayEx05 {

	public static void main(String[] args) {
		// int형 숫자 데이터를 저장하기 위한 배열 arr1을 선언
		// 11 12 13 14 15 값을 초기값으로 저장
		int[] arr1 = {11, 12, 13, 14, 15};
		System.out.println("arr1 = " + arr1);
		//arr1[5] = 55; //error 발생 => index 범위 밖을 지정했기 때문에 발생
		//java.lang.ArrayIndexOutOfBoundsException
		System.out.println(Arrays.toString(arr1));
		//Arrys.toString(배열):배열의 값들(element,요소)을 []문자안에 넣어서 String 타입으로 리턴
		
		// for문 이용 출력
		System.out.println("");
		System.out.println("--for문 이용출력--");
		System.out.println("");
		
		for (int i=0; i<arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		// 향상된 for문 이용 출력
		System.out.println("");
		System.out.println("--향상된 for문 이용출력--");
		System.out.println("");

		for ( int temp : arr1) {
			System.out.println(temp);
		}
		
	}

}
