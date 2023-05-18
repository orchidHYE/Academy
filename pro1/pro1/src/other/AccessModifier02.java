package other;

public class AccessModifier02{
	//필드
	AccessModifier01 am = new AccessModifier01();
	
	
	//생성자
	
	
	//메서드
	void aaa () {
		//am.pri = 200; //error
		//AccessModifier01 am = new AccessModifier01();
		//private : 동일 클래스에서는 접근이 가능하지만 외부 클래스에서는 모든 접근을 제한함.
		am.pack= 200;
		am.pro = 200;
		am.pub = 200;
	}
	
}
