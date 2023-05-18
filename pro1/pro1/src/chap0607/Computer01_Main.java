package chap0607;

//이 클래스는 Computer01_p253 클래스의 실행 클래스이다.
public class Computer01_Main {
	
	public static void main (String[] args) {
		// Computer01_p253 클래스의 객체 생성
		Computer01_p253 com1 = new Computer01_p253();
		
		// Computer01_p253 클래스의 add 메서드 콜
		//int r0 = com1.add(10) //error //The method add(int, int) in the type Computer01_p254 is not applicable for the arguments (int)
		//=> 메서드의 매개변수 개수가 일치해야 한다
		
		//int r0 = com1.add(30.40, 100); //error //The method add(int, int) in the type Computer01_p254 is not applicable for the arguments (double, int)
		//=>메서드의 매개변수의 타입과 일치해야 한다
				
		//int r0 = com1.add(30, 100); //error
		//=>메서드의 매개변수의 타입과 일치해야 한다
		//=>int r0 = com1.add(30,(byte)100);
		
		int r0 = com1.add(10, 90);
		System.out.println("add(10, 90)의 결과 = " + r0);
		
		r0 = com1.sum2(10, 90);
		System.out.println("sum2(10, 90)의 결과 = " + r0);
		
		r0 = com1.sum2(10, 90, 100);
		System.out.println("sum(10, 90, 100)의 결과 = " + r0);
		
		r0 = com1.sum2(10, 90, 100, 1, 2, 3);
		System.out.println("sum(10, 90, 100, 1, 2, 3)의 결과 = " + r0);
		
		
		System.out.println("-------------------------------");
		System.out.println();
		
		System.out.println("--int[] 배열--");
		int[] arr = {10, 90};
		//참조변수 arr에는 주소
		
		r0 = com1.sum1(arr); //값 자체를 넣었을 때 오류 //주소를 원함
		System.out.println("sum1(10, 90)의 결과 = " + r0);
		
		//3개의 값을 제시한 경우
		arr = new int[] {10, 90, 100};
		r0 = com1.sum1(arr); 
		System.out.println("sum1(10, 90, 100)의 결과 = " + r0);
			
		//5개의 값을 제시한 경우
		// => sum2()는 가변인자배열로 선언되었기에 n개의 값을 제시할 수 있다
		arr = new int[] {10, 90, 100, 1, 2, 3};
		r0 = com1.sum1(arr); 
		System.out.println("sum1(10, 90, 100, 1, 2, 3)의 결과 = " + r0);
		}		
	}
