package chap05;


/* 배열의 초기값 (p183)
      정수[] : byte, short, int, long 의 기본값 : 0, 0L
      실수[] float, double의 기본값 : 0.0F 0.0 
   char[]의 기본값 : 공백 (\u0000)
   boolean[]의 기본값 : false
      클래스의 기본값 : null => 예)String[]의 기본값 : null
 */
public class ArrayEx02_p184 {

	public static void main(String[] args) {
		int[] a1 = new int[3];
		for (int i = 0; i<a1.length; i++) {
			System.out.println("int 배열 a1[" + i + "] = " + a1[i]);
		}
		
		byte[] a2 = new byte[3]; 
		for (int i = 0; i<a2.length; i++) {
			System.out.println("byte 배열 a2[" + i + "] = " + a2[i]);
	
		}
		
		long[] a3 = new long[3]; 
		for (int i = 0; i<a3.length; i++) {
			System.out.println("long 배열 a3[" + i + "] = " + a3[i]);
		
		}
			
		float[] a4 = new float[3]; 
		for (int i = 0; i<a4.length; i++) {
			System.out.println("float 배열 a4[" + i + "] = " + a4[i]);	
		
		}
			
		double[] a5 = new double[3]; 
		for (int i = 0; i<a5.length; i++) {
			System.out.println("double 배열 a5[" + i + "] = " + a5[i]);
			
		}	
		
		boolean[] a6 = new boolean[3]; 
		for (int i = 0; i<a6.length; i++) {
			System.out.println("boolean 배열 a6[" + i + "] = " + a6[i]);
			
		}
		
		char[] a7 = new char[3]; 
		for (int i = 0; i<a7.length; i++) {
			System.out.println("char 배열 a7[" + i + "] = " + a7[i]);
			
		}
		
		String[] a8 = new String[3]; 
		for (int i = 0; i<a8.length; i++) {
			System.out.println("String 배열 a8[" + i + "] = " + a8[i]);
			
		}
		
	}
		
}

