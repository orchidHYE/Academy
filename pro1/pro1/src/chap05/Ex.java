package chap05;

import java.util.Arrays;

public class Ex {

	public static void main(String[] args) {
		int[] oriArr = {1, 2, 3};
		int[] copyArr = new int[5];
		
		for (int i=0; i<oriArr.length;i++) {
			copyArr[i] = oriArr[i];
		}
		System.out.println(copyArr.length);
		System.out.println(Arrays.toString(copyArr));
		
		for (int i=0; i<copyArr.length; i++) {
			System.out.println(copyArr[i]);
		}
		
		oriArr[0] = 55;
		
		System.out.println(Arrays.toString(oriArr));
		System.out.println(Arrays.toString(copyArr));
		
		for (int i=0; i<copyArr.length; i++) {
			System.out.println(copyArr[i]);
		}
	}

}
