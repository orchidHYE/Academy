package chap0304;

/* for문(p.149)
for(초기값; 조건식; 증감식) {
	//반복실행문
}
*/
public class ForEx01_p149 {

	public static void main(String[] args) {
		//10번 변수 i값 출력, 마지막 0출력, 1씩 감소
		for (int i = 9; i>-1 ; i--)
		System.out.println(i);
		
		//5 4 3 2 1
		for (int i = 5; i>0 ; i--)
		//System.out.println(i);
		
		System.out.println(); //공백으로 두어서 줄바꿈 실행
		System.out.println("-------------------");
		
		//0 1 2 3 4 5 6 7 8 9 
		for(int i = 0; i<10 ; i++) {
			//System.out.print(i + " ");
			//System.out.printf("%d\t", i);

		}
		System.out.println(); //공백으로 두어서 줄바꿈 실행
		System.out.println("-------------------");
		
	}
	
}
