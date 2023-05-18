package chap0607;

import java.util.Date;

//이 클래스는 Car06클래스의 실행클래스이다
public class Car06_Main {

	public static void main(String[] args) {
		//Car06클래스의 임의 데이터로 초기화된 객체를 생성하시오
		Car06_p232 myCar4 = new Car06_p232 ("튼튼자동차", 2500, 'A',
											true, new Date(123,4,17));
		System.out.println(myCar4.getCompany());
		System.out.println(myCar4.getPrice());
		System.out.println(myCar4.getClass());
		System.out.println(myCar4.isHybrid());
		System.out.println(myCar4.getProDay());
		
		//Car06클래스의 매우 좋은 회사에서 생산한 판매가격이 5000 
		//파라미터가 1개인 생성자를 호출하여 객체를 생성하시오
		Car06_p232 myCar3 = new Car06_p232("매우좋은회사", 5000);
		System.out.println(myCar3.getCompany());
		System.out.println(myCar3.getPrice());
		System.out.println("-----");
		System.out.println();
		
		//Car06클래스의 int타입 파라미터가 1개인 생성자를 호출하여 객체를 생성하시오
		Car06_p232 myCar2 = new Car06_p232(3000);
		System.out.println(myCar2.getPrice());
		System.out.println("-----");
		System.out.println();
		
		//Car06클래스의 파라미터가 1개인 생성자를 호출하여 객체를 생성하시오
		Car06_p232 myCar1 = new Car06_p232("좋은회사");
		
		myCar1.showInfo();
		
		
	/*	
	 * System.out.println(myCar1.getCompany());
		System.out.println("-----");
		System.out.println();
	*/		
		
		
		//Car06클래스의 기본생성자를 호출하여 객체를 생성하시오
		Car06_p232 myCar = new Car06_p232();
		
		System.out.println(myCar.getCompany());
		
	}

}
