package chap11;

/* Math 클래스 : 수학계산에 사용할 수 있는 메서드,필드를 제공
 * 
 */
public class MathEx01_p504 {

	public static void main(String[] args) {
/*		double v = Math.random();
		System.out.println(v);
		
		int v2 = (int)Math.random();
		System.out.println(v2);
		
		for (int i=0; i<10; i++) {
			System.out.println((int)(Math.random()*101) + 0);
		}
*/		
		System.out.println(Math.abs(10));
		System.out.println(Math.abs(-10));
		
		double v3 = Math.PI;
		System.out.println("Math.PI=" + v3);
		System.out.println(Math.ceil(v3)); //4.0
		System.out.println(Math.floor(v3)); //3.0
		System.out.println(Math.round(v3)); //3
		
	}

}
