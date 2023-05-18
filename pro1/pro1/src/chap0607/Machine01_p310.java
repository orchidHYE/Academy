package chap0607;

import java.util.Date;

//부모클래스 = 상위클래스 = super 클래스
//자식클래스 = 하위클래스 = sub 클래스 = 파생클래스
public class Machine01_p310 {
	//필드
	String brand; //null
	String color; 
	Date proDay; //생산일 //null
	//상태데이터
	boolean power; //false
	
	
	//생성자
	
	
	//메소드
	//전원켜다
	void powerOn () {
		System.out.println("power on");
		//power = true; 
		//return !power; //리턴타입 boolean으로 줘야함 
		power = !power;
	}
	
	//전원끄다
	void powerOff () {
		System.out.println("power off");
		power = false;
	}
}
