package chap0607;

import java.util.Calendar;
import java.util.Date;

//Promotion(p333) : 상속 관계에 있는 클래스간에 프로그램 실행 도중에 자동적으로 타입변환이 일어나는 것.
/* 문법 > 
      클래스       참조변수 = new 클래스();
      부모타입    참조변수 = 자식타입
      부모클래스 참조변수 = new 자식클래스();
 */

//자동형변환 : 자식은 부모 타입으로 자동타입변환 가능
//p335 : 자동 타입 변환된 이후에는 부모 클래스에서 선언된 필드와 메소드만 접근 가능
class Grandfather02 {
	int height = 160;
	String name = "홍할";
	
	void sing () {
		System.out.println("할아버지의 sing()");
	}
}

class Father02 extends Grandfather02 {
	int height = 170;
	String addr = "서울";
	
	void dance () {
		System.out.println("아빠의 dance()");
	}
}

class Son02 	 extends Father02 {
	int height = 180;
	String gender = "남자";
	
	void run() {
		System.out.println("아들의 run()");
	}
}

public class Promotion02_p336 {

	public static void main(String[] args) {
		/*
		Grandfather  gf = new Grandfather(); //100번지
		Father 		  f = new Father();		 //200번지
		Son 	    son = new Son();		 //300번지
		*/
		
		Grandfather02 gf1 = new Grandfather02(); //110번지
		System.out.println("할아버지 타입 참조변수 gf1.height : " + gf1.height);
		System.out.println("할아버지 타입 참조변수 gf1.name : " + gf1.name);
		gf1.sing(); 
					
		Grandfather02 gf2 = new Father02(); 	 //210번지
		System.out.println("할아버지 타입 참조변수 gf2.height : " + gf2.height);
		System.out.println("할아버지 타입 참조변수 gf2.name : " + gf2.name);
		gf2.sing(); 
		//System.out.println("할아버지 타입 참조변수 gf2.height : " + gf2.addr);
		//addr cannot be resolved or is not a field
		//gf2.dance();
		//The method dance() is undefined for the type Grandfather
		
		Grandfather02 gf3 = new Son02(); 		 //310번지
		System.out.println("할아버지 타입 참조변수 gf3.height : " + gf3.height);
		System.out.println("할아버지 타입 참조변수 gf3.name : " + gf3.name);
		gf3.sing(); 			
	
		Father02 		 f1 = new Father02();		 //220번지
					 
		Father02 		 f2 = new Son02();		 //320번지			
					 

		Son02		   son1 = new Son02();		 //320번지
				  
	
		//Table  table1 = new Grandfather(); //(X) 
		//Table  table2 = new Father(); //(X)
		//Table  table3 = new Son(); //(X) //Type mismatch: cannot convert from (~) to Table
		
	}

}
