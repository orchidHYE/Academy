package hw;

import java.util.Arrays;

public class P201_5 {
	
	public static void main (String[] args) {
		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				
				sum += array[i][j];
				cnt++; // 1씩 증가하는 ++이 어떻게 배열의 개수를 입력시켜주는건지 ,,,?
			}
		}
		avg = sum / cnt;
		System.out.println(sum);
		System.out.println(avg);
	}
}
