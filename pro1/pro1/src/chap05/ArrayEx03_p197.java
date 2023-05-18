package chap05;

//향상된 for문 => 배열(Array) 또는 컬렉션(collection)에서 사용
/*
 for ( 타입 변수명 : 배열명 or 컬렉션명) {
 	//반복 실행 코드
 }
 */
public class ArrayEx03_p197 {

	public static void main(String[] args) {
		//10, 20, 30, 40, 50을 정수 배열 arr1에 할당 후 출력
		
		System.out.println("--일반 for문 배열값 출력--");
		int[] arr1 = {10, 20, 30, 40, 50};
		for (int i=0; i<arr1.length;i++) {
			System.out.println(arr1[i]);
		}
		
		//int 배열 arr1에 할당된 모든 값의 총합 출력
		int sum = 0;
		for (int i = 0; i<arr1.length; i++) {
			sum += arr1[i];
		}
		System.out.println("총합 sum = " + sum);
		
		double avg = (double) sum / arr1.length; //평균 = 총합/수 = 몫=int/5
		System.out.println("평균 = " + avg);
		
		System.out.println("");
		System.out.println("-----------------");
		System.out.println("--향상된 for문 배열값 출력--");
		for ( int temp : arr1) {
			System.out.println(temp);
		}
	}

}
