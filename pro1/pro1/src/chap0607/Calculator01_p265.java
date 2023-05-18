package chap0607;

public class Calculator01_p265 {

	public static void main(String[] args) {
		//calculator01 클래스 객체 생성
		Calculator01 calc = new Calculator01();
		System.out.println("정사각형 넓이 = " + calc.areaRectangle(10));
		System.out.println("직사각형 넓이 = " + calc.areaRectangle(10, 50));
	}

}
