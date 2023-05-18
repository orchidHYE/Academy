package chap02;

public class Ex {

	public static void main(String[] args) {
		long l1 = 500;
		int i1 = (int)l1;
		System.out.println(i1);
		
		double d1 = 3.14;
		int i2 = (int)d1;
		System.out.println(i2); //3
		
		float f1 = 1.2f;
		double d2 = 3.4;
		double result = f1 + d2;
		System.out.println(result); // 4.600000047683716
		
		/*int i3 = 10;
		double d3 = 5.5;
		int result2 = i3 + d3;
		System.out.println(result2);
		Type mismatch: cannot convert from double to int
		*/
		
		int i3 = 10;
		double d3 = 5.5;
		int i4 = (int)d3;
		int result2 = i3 + i4;
		System.out.println(result2);
		
		int intValue = 10;
		double doubleValue = 5.5;
		int result3 = intValue + (int) doubleValue;
		System.out.println(result3); // 위에서는 i4라는 새로운 변수를 지정했는데, 괄호 씌워서 한번에 계산하면 되는거였음!
		
		float result4 = 1.5f + 3.5F;
		System.out.println(result4);
		
		int x = 1;
		int y = 2;
		int result5 = x / y;
		System.out.println(result5); // int result5 X double result5 O 에러는 안뜨는데 결과값이 틀림
		
		int x1 = 1;
		int y1 = 2;
		double result6 = x / y;
		System.out.println(result6); // 변환 
		
		double result7 = (double) x / (double) y;
		System.out.println(result7); // 0.5
		
		char c1 = 'A';
		char c2 = 1;
		int intValue2 = c1 + c2;
		System.out.println("유니코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int i5 = 10;
		int i6 = i5/4;
		//System.out.println(i6); //2
		double d4 = (double) i5 / 4;
		System.out.println(d4); //2.5
		
		int i7 = 10;
		//int i8 = i7 / 4.0;
		//System.out.println(i8); //error
		double d5 = i7 / 4.0;
		System.out.println(d5);
		
		String str = "1a";
		//int value = Integer.parseInt(value); -> 숫자 형식 예외(NumberFormatException)
		//The method parseInt(String) in the type Integer is not applicable for the arguments (int)
		
		
		String str11 = String.valueOf(1);
		System.out.println(str11 + 4);
		
		char cv1 = 'A';
		int iv1 = cv1;
		System.out.println(iv1);
		//Type mismatch: cannot convert from char to short
		
		//String strValue = "A";
		//String strValue = String.Of(A); //문자열을 char타입으로 강제 타입 변환(캐스팅) 할 수 없음.
		
		int x3 = 5;
		int y3 = 2;
		double result8 = x3 / y3;
		System.out.println(result8);
		
		double result9 = (double) x3 / y3;
		System.out.println(result9);
		
		double var1 = 3.5;
		double var2 = 2.7;
		int result10 = (int)(var1 + var2);
		System.out.println(result10);

		/*long var3 = 2L;
		float var4 = 1.8f;
		double var5 = 2.5;
		String var6 = "3.9";
		int var7 = (int)var3;
		int var8 = (int)var4;
		int var9 = (int)var5;
		int var10 = Integer.parseInt(var6);
		int result11 = var7 + var8 + var9 + var10;
		System.out.println(result11);
		*/
		
		String str1 = 2 + 3 + "";
		String str2 = 2 + "" + 3;
		String str3 = "" + 2 + 3;
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		char c3 = 'a';
		//char c4 = c3 +1;
		//System.out.println(c4);
	}

}
