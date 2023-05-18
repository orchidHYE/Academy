package chap0304;

/* 증감연산자(p110)
   ++변수 : 1씩 증가
      변수++
   --변수 : 1씩 감수
      변수--
 * ]*/
public class IDEx01_p112 {

	public static void main(String[] args) {
		//변수 x,y,z 변수의 값을 출력하시오.
		int x = 10;
		int y = 20;
		int z;
				
		System.out.println("초기 x = " + x); //10
		System.out.println("초기 y = " + y); //20
		
		x++; //10
		++x; //12
		System.out.println("1)x=" + x); //12
		
		z = x++;
		System.out.println("2)z=" + z); //12
		
		z = ++x; //14
		System.out.println("3)z=" + z); //14
		
		//y--; //20
		//System.out.println("4)y=" + y); //19
		//--y; //18
		//System.out.println("5)y=" + y); //18
		
		y--;
		--y;
		System.out.println("4)y=" + y); //18
		
		//z = ++x; 
		//System.out.println("7)z=" + z); //15
		
		z = ++x + y++; //
		System.out.println("5)z=" + z);
		System.out.println("5)x=" + x);
		System.out.println("5)y=" + y);
		
		
	}

}
