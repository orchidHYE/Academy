package hw;

//깊은복사 : for문 이용해서 복사하기
public class Array_Sc_Dc {

	public static void main(String[] args) {
		int[] oriArr = {1, 2, 3};
		int[] copyArr = new int[5]; // 배열을 사용하겠다는 선언만 해놓은 상태 //이 때 배열의 값은 자동초기화된다
		
		//깊은복사

	    for (int i=0; i<oriArr.length; i++) {
			copyArr[i] = oriArr[i]; //배열 길이 복사 //oriArr에 있던 배열 값 1, 2, 3이 copyArr에 복사됐을 것이다. => copyArr의 배열값은 {1, 2, 3, 0, 0} 예상
		}
		
		for (int i=0; i<copyArr.length;i++) {
			System.out.println(copyArr[i] + ",  "); // copyArr 배열 값 출력 코드
		}
		
		System.out.println("=========================");
		
		oriArr[0] = 5;
		oriArr[1] = 7;
		oriArr[2] = 9;
		
		for (int i=0; i<oriArr.length;i++) {
			System.out.println(oriArr[i] + ",  "); // copyArr 배열 값 출력 코드
		}
		
		System.out.println("=========================");
		
		for (int i=0; i<copyArr.length;i++) {
			System.out.println(copyArr[i] + ",  "); // copyArr 배열 값 출력 코드
		}
	
		
	/*  얕은복사	
	 
		oriArr = copyArr;
		System.out.println(Arrays.toString(copyArr));
		System.out.println(Arrays.toString(oriArr));
		
		copyArr[0] = 547;
		System.out.println(Arrays.toString(copyArr));
		System.out.println(Arrays.toString(oriArr));
	*/	
	
	}

}
