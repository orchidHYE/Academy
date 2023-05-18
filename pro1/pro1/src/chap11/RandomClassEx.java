package chap11;

import java.util.Random;

//java.util.Random클래스
public class RandomClassEx {

	public static void main(String[] args) {
		//객체생성
		//클래스타입 변수명 = new 클래스명(long seed);
		Random random1 = new Random (System.currentTimeMillis());
		System.out.println(random1.nextInt());
		
		System.out.println("------------------------------");
		System.out.println();
		
		
		
		
		
		//-----------------------------------------------
		//객체생성
		//클래스타입 변수명 = new 클래스명(long seed);
		//long 타입 seed : 씨앗 => 기준
		//seed가 동일하면 동일한 난수를 구할 수 있다
		Random random = new Random();
		
		boolean v4 = random.nextBoolean();
		System.out.println("nextInt():" + v4);
		
		System.out.println("------------------------------");
		System.out.println();
		
		double v3 = random.nextDouble();
		System.out.println("nextInt():" + v3);
		
		System.out.println("------------------------------");
		System.out.println();
		
		float v2 = random.nextFloat();
		System.out.println("nextInt():" + v2);
		
		System.out.println("------------------------------");
		System.out.println();
		
		long v1 = random.nextLong();
		System.out.println("nextInt():" + v1);
		
		System.out.println("------------------------------");
		System.out.println();
		
		//random.nextInt(n) => 0이상 n미만
		for (int i = 1; i<=10 ; i++) {	
			System.out.println(random.nextInt(20));
		}
		
		System.out.println("------------------------------");
		System.out.println();
		
		for (int i = 1; i<=10 ; i++) {	
			int v = random.nextInt();
			System.out.println("nextInt():" + v);
		}
	}

}
