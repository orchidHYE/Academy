package chap0607;

//p265 : method overloading
//클래스 내에 같은 이름의 메서드를 여러개 선언하는 것.
//단, 매개변수의 타입, 개수, 순서 중 하나가 달라야한다. 
public class Calculator01 {
	//field:[접근제어자][제어자] 타입 필드명 [=초기값];
	//constructor:[접근제어자] 클래스명(매개변수리스트) {}
	//method:[접근제어자][제어자] 리턴타입 메서드명(매게변수리스트) {}
	
	//정사각형 넓이 구하기
	double areaRectangle (int width) {
		return width * width;
	}
	
	double areaRectangle (double width) {
		return width * width;
	}
	
	//직사각형 넓이 구하기
	double areaRectangle (double width, double height) {
		return width * height;
	}
}

