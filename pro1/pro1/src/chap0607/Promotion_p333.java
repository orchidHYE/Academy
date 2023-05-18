package chap0607;

import java.util.Calendar;
import java.util.Date;

//Promotion(p333) : 상속 관계에 있는 클래스간에 프로그램 실행 도중에 자동적으로 타입변환이 일어나는 것.
/* 문법 > 
      클래스       참조변수 = new 클래스();
      부모타입    참조변수 = 자식타입
      부모클래스 참조변수 = new 자식클래스();
 */

class Table extends Object {}

class Grandfather {}

class Father extends Grandfather {}

class Son 	 extends Father {}

public class Promotion_p333 {

	public static void main(String[] args) {
		Grandfather  gf = new Grandfather(); //100번지
		Father 		  f = new Father();		 //200번지
		Son 	    son = new Son();		 //300번지
		
		Object		obj = new Table();
					obj = new Grandfather();
					obj = new Father();
					obj = new Son();
					obj = new Date();
					obj = Calendar.getInstance();
					obj = new String("홍길동");
		
		Table     table = new Table();
		
		
		//자동형변환 : 자식은 부모 타입으로 자동타입변환 가능
		Grandfather gf1 = new Grandfather(); //110번지
					gf1 = gf;				 //100번지
					gf1 = new Father(); 	 //210번지
					gf1 = f;				 //200번지
					gf1 = new Son(); 		 //310번지
					gf1 = son;				 //300번지
	
		Father 		 f1 = new Father();		 //220번지
					 f1 = f;				 //200번지
					 f1 = new Son();		 //320번지			
					 f1 = son;				 //300번지

		Son		   son1 = new Son();		 //320번지
				   son1 = son;				 //300번지
	
		//Table  table1 = new Grandfather(); //(X) 
		//Table  table2 = new Father(); //(X)
		//Table  table3 = new Son(); //(X) //Type mismatch: cannot convert from (~) to Table
		
	}

}
