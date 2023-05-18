package chap05;

//p178
/* 배열 (Array) : 동일 타입의 데이터를 연속된 공간에 나열,
 				 각 데이터에 index를 부여해 놓을 자료구조 
 * index : 0부터 1씩 증가하는 번호
                      배열명[index] => index에 해당하는 값을 가져오는 => get
                      배열명[index] => index에 해당하는 값을 설정하기 => set
 
 * 배열 선언 및 값 할당 : 타입[] 변수명 = new 타입 [길이];
 				       타입[] 변수명 = {값0, 값1, 값2, ...};
 				       타입[] 변수명 = new 타입[] {값0, 값1, 값2, ...};
 
 * 배열선언 : 타입[] 변수명; or 타입 변수명[];
 
 * 값 할당 : 변수명[인덱스 번호] = 값; 
 		   ex) 변수명 [0] = 값;
 		   
 * 배열의 길이 : 배열명.length
 */
public class ArrayEx01_p178 {

	public static void main(String[] args) {
		//배열 선언 및 값 할당(p184)
		//타입[] 변수명 = new 타입 [길이];
		int[] arr1 = new int [3];
		System.out.println("arr1 = " + arr1 ); // [I@15db9742 -> 문자열화 주소지
		// 배열의 길이 출력
		System.out.println("arr1.length = " + arr1.length); //3
		
		// 타입[] 변수명 = {값0, 값1, 값2, ...};
		int[] arr2 = {10, 20, 30, 1234};
		System.out.println("arr2 = " + arr2); // [I@6d06d69c
		// 배열의 길이 출력
		System.out.println("arr2.length = " + arr2.length); //4
		System.out.println("arr2[0] = " + arr2[0]); // arr2[0] = 10
		System.out.println("arr2[1] = " + arr2[1]); // arr2[1] = 20
		System.out.println("arr2[2] = " + arr2[2]); // 30
		System.out.println("arr2[3] = " + arr2[3]); // 1224
		
		//타입[] 변수명 = new 타입[] {값0, 값1, 값2, ...};
		int[] arr3 = new int[] {10, 20, 30, 40, -50};
		System.out.println("arr = " + arr3); //[I@7852e922
		System.out.println("arr3.length = " + arr3.length);
		//for문 이용하여 값 출력
		for (int i = 0; i<arr3.length; i++) {
			System.out.println("arr3[" + i + "] = " + arr3[i]);
	
		}
		
		//값 변경
		//arr3 인덱스 0의 값을 100으로 변경
		//변수명 = 값;
		arr3[0] = 100;
		
		//출력
		System.out.println("변경후 arr3[0] = " + arr3[0]);
		
		//arr3 배열안의 모든 값에 기존 값 *10로 변경
		for (int i = 0; i<arr3.length; i++) {
			arr3[i] *= 10; //대입할당연산자 arr3[i] = arr3[i] * 10 
		}
		
		// for (int i = 0; i<arr3.length; i++) {
		// System.out.println("arr3[" + i + "] = " + (arr3[i] * 10));
		
		/*  arr3[1] = 200;
			System.out.println("변경후 arr3[1] = " + arr3[1]);
			arr3[2] = 300;
			System.out.println("변경후 arr3[2] = " + arr3[2]);
			arr3[3] = 400;
			System.out.println("변경후 arr3[3] = " + arr3[3]);
			arr3[4] = 50;
			System.out.println("변경후 arr3[4] = " + arr3[4]);
		*/
		
		
		
		for (int i = 0; i<arr3.length; i++) {
			System.out.println("arr3[" + i + "] = " + (arr3[i] * 10));
			
		}
			
	}
	
}
