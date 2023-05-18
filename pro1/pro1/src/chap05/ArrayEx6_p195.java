package chap05;

import java.util.Arrays;

/* 배열 복사 (p195)
       ★★★★★★
      얕은 복사 (shallow copy) : 주소 복사 => 동일 주소 공유
      					      원본에 변화 발생하면 사본에 변화 반영
      깊은 복사 (deep copy) : 원본에 변경이 있어도 사본 배열에 영향 X
    1) for문 이용
    2) Object.clone();
    3) Arrays.copyOf();
    4) Arrays.copyOfRange(); 
    5) System.arraycopy(Object src, int srcPos, Object dest, int destPos, int length); 
 */
public class ArrayEx6_p195 {

	public static void main(String[] args) {
		// int형 숫자 데이터를 저장하기 위한 배열 arr1을 선언
		// 11 12 13 14 15 값을 초기값으로 저장
		int[] oriArr = {11, 12, 13, 14, 15}; //원본배열
		System.out.println("oriArr = " + oriArr);
		
		System.out.println(Arrays.toString(oriArr));
		//Arrys.toString(배열):배열의 값들(element,요소)을 []문자안에 넣어서 String 타입으로 리턴
		
		
		// 원본 배열의 2배 길이인 새 배열 선언
		// int[] copyArr = new int[10];
		int[] copyArr = new int[oriArr.length * 2];
		System.out.println(Arrays.toString(copyArr));
		
/*		System.out.println("");
		System.out.println("--배열 복사 : 새 배열명 = 원본배열명--");
		System.out.println("--배열 복사 : 주소 복사 => 얕은 복사(shallow copy)");
		copyArr = oriArr;
		System.out.println(copyArr);
		System.out.println(Arrays.toString(copyArr));
		oriArr[0] = 7777;
		System.out.println(Arrays.toString(oriArr));
		System.out.println(Arrays.toString(copyArr));
*/
		
/*		// 배열복사-for문 이용 출력
		System.out.println("--배열 복사 : => 깊은 복사(deep copy)");
		System.out.println("");
		
		for (int i=0; i<oriArr.length; i++) {
			copyArr[i] = oriArr[i];
		}
		
		//2) Object.clone();
		//Object클래스의 clone()
		//System.out.println("--배열 복사 : Object.clone(); => 깊은 복사(deep copy)");
		//System.out.println("");
		//copyArr = oriArr.clone();
		
		
/*		System.out.println(Arrays.toString(copyArr));
		oriArr[0] = 0; // 원본에 변경이 있어도 사본 배열에 영향 X
		System.out.println(oriArr); 
		System.out.println(copyArr);
		System.out.println(Arrays.toString(oriArr)); // [0, 12, 13, 14, 15]
		System.out.println(Arrays.toString(copyArr)); // [11, 12, 13, 14, 15, 0, 0, 0, 0, 0]
*/
		
/*		//3) Arrays.copyOf(); 
		System.out.println("--배열 복사 : Arrays.copyOf(); => 깊은 복사(deep copy)");
		copyArr = Arrays.copyOf(oriArr, oriArr.length); //시작점 지정 불가
		
		System.out.println(Arrays.toString(copyArr));
		oriArr[0] = 0; // 원본에 변경이 있어도 사본 배열에 영향 X
		System.out.println(oriArr); 
		System.out.println(copyArr);
		System.out.println(Arrays.toString(oriArr)); // [0, 12, 13, 14, 15]
		System.out.println(Arrays.toString(copyArr)); // [11, 12, 13, 14, 15, 0, 0, 0, 0, 0]
*/		
		//4) 4) Arrays.copyOfRange();
		//System.out.println("--배열 복사 : 4) Arrays.copyOfRange();=> 깊은 복사(deep copy)");
		//copyArr = Arrays.copyOfRange(oriArr, 0, oriArr.length); // 범위 지정
		//copyArr = Arrays.copyOfRange(oriArr, 0, 3); // 원본배열의 인덱스 0부터 인덱스 3전까지 => 0,2
		//copyArr = Arrays.copyOfRange(oriArr, 1, 1); // 인덱스 1부터 인덱스 3전까지 => 1,2
		//copyArr = Arrays.copyOfRange(oriArr, 1, 10); // 인덱스 1부터 인덱스 10전까지 
		//3번째 매개변수가 배열의 길이보다 클 경우 -> 남은 부분은 0으로 채운다.
		
/*		System.out.println(Arrays.toString(copyArr));
		oriArr[0] = 0; // 원본에 변경이 있어도 사본 배열에 영향 X
		System.out.println(oriArr); 
		System.out.println(copyArr);
		System.out.println(Arrays.toString(oriArr)); // [0, 12, 13, 14, 15]
		System.out.println(Arrays.toString(copyArr)); // [11, 12, 13, 14, 15, 0, 0, 0, 0, 0]
*/
		
		//5) System.arraycopy(); 
		System.out.println("--배열 복사 : System.arraycopy(원본배열, 원본배열시작인덱스, 새배열, 새배열시작인덱스, 복사할개수); => 깊은 복사(deep copy)");
		//System.arraycopy(oriArr, 0, copyArr, 0, 5); //[11, 12, 13, 14, 15, 0, 0, 0, 0, 0]
		System.arraycopy(oriArr, 2, copyArr, 6, 3); 
		
		System.out.println(Arrays.toString(copyArr));
		oriArr[0] = 0; // 원본에 변경이 있어도 사본 배열에 영향 X
		System.out.println(oriArr); 
		System.out.println(copyArr);
		System.out.println(Arrays.toString(oriArr)); // [0, 12, 13, 14, 15]
		System.out.println(Arrays.toString(copyArr));
	}

}
