package chap0607;

import other.AccessModifier01;

public class AccessModifier05 extends AccessModifier01 {
	//필드
	AccessModifier01 am = new AccessModifier01();
	
	
	//생성자
	
	
	//메서드
	void aaa () {
		//am.pri = 200; //error
		//AccessModifier01 am = new AccessModifier01();
		//private : 동일 클래스에서는 접근이 가능하지만 외부 클래스에서는 모든 접근을 제한함.
		//am.pack= 200;
		//The field AccessModifier01.pack is not visible 
		//defualt 접근 제한자는 외부 패키지에서 접근 제한
		//am.pro = 200;
		//The field AccessModifier01.pro is not visible
		//protected 접근 제한자는 외부 패키지에서 접근 제한
		
		this.pro = 2000;
		super.pro = 20000;
		
		am.pub = 200;
		
	}
	
}
